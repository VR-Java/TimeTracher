package eu.mdpop.timetracking.repository;

import eu.mdpop.timetracking.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
