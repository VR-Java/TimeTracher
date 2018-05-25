package eu.mdpop.timetracking.service;

import eu.mdpop.timetracking.entity.RecordingSheetEntity;

import java.util.List;

public interface RecordingSheetService {

    void create(RecordingSheetEntity recordingSheet);

    RecordingSheetEntity getRecordingSheet(Long id);

    void update(Long id, RecordingSheetEntity recordingSheet);

    void delete(Long id);

    List<RecordingSheetEntity> getRecordingSheets();

}
