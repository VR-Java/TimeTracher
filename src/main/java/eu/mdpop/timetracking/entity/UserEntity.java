package eu.mdpop.timetracking.entity;

import eu.mdpop.timetracking.entity.enums.Gender;
import eu.mdpop.timetracking.entity.enums.UserStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Getter
@Setter
public class UserEntity extends BaseEntity{

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name="last_name", nullable = false)
    private String lastName;

    @Column(name = "post", nullable = false)
    private String post;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name="birthday")
    private LocalDate birthday;

    @Column(name = "hiring_date")
    private LocalDate hiringDate;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<RoleEntity> roles;

    @OneToMany(mappedBy = "user")
    private List<RecordingSheetEntity> records;

    @Column(name = "image_url", length=500)
    private String profileImageUrl;

}
