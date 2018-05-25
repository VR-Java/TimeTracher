package eu.mdpop.timetracking.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "recording_sheet")
@NoArgsConstructor
@Getter
@Setter
public class RecordingSheetEntity extends BaseEntity{

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "start_work")
    private LocalTime startWork;

    @Column(name = "finish_work")
    private LocalTime finishWork;

    @Column(name = "shift1")
    private int shift1;

    @Column(name = "shift2")
    private int shift2;

    @Column(name = "shift3")
    private int shift3;

    @Column(name = "holiday")
    private int holiday;

}
