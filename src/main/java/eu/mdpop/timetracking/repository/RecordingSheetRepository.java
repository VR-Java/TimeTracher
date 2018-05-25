package eu.mdpop.timetracking.repository;

import eu.mdpop.timetracking.entity.RecordingSheetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordingSheetRepository extends JpaRepository<RecordingSheetEntity, Long> {
}
