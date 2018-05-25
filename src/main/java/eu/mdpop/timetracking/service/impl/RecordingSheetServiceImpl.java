package eu.mdpop.timetracking.service.impl;

import eu.mdpop.timetracking.entity.RecordingSheetEntity;
import eu.mdpop.timetracking.repository.RecordingSheetRepository;
import eu.mdpop.timetracking.service.RecordingSheetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Slf4j
public class RecordingSheetServiceImpl implements RecordingSheetService {

    @Autowired
    private RecordingSheetRepository recordingSheetRepository;

    @Override
    public void create(RecordingSheetEntity recordingSheet) {
        recordingSheetRepository.save(recordingSheet);
    }

    @Override
    public RecordingSheetEntity getRecordingSheet(Long id) {
        return recordingSheetRepository.findById(id).orElseThrow(() -> new RuntimeException("Recording sheet not found"));
    }

    @Override
    public void update(Long id, RecordingSheetEntity recordingSheet) {
        getRecordingSheet(id);
        recordingSheet.setId(id);
        create(recordingSheet);
    }

    @Override
    public void delete(Long id) {
        recordingSheetRepository.deleteById(id);
    }

    @Override
    public List<RecordingSheetEntity> getRecordingSheets() {
        return recordingSheetRepository.findAll();
    }
}
