package eu.mdpop.timetracking.repository;

import eu.mdpop.timetracking.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
