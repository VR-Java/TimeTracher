package eu.mdpop.timetracking.controller;

import eu.mdpop.timetracking.converter.RecordingSheetConverter;
import eu.mdpop.timetracking.dto.RecordingSheetDto;
import eu.mdpop.timetracking.service.RecordingSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sheet")
public class RecordingSheetController {

    @Autowired
    private RecordingSheetConverter recordingSheetConverter;

    @Autowired
    private RecordingSheetService recordingSheetService;

    @PostMapping
    public void createRecordingSheet(@RequestBody RecordingSheetDto sheetDto){
        recordingSheetService.create(recordingSheetConverter.convertToEntity(sheetDto));
    }

    @GetMapping
    public List<RecordingSheetDto> getAllSheets(){
        return recordingSheetConverter.convertToDto(recordingSheetService.getRecordingSheets());
    }

    @GetMapping("/{id}")
    public RecordingSheetDto getSheet (@PathVariable("id") Long id) {
        return recordingSheetConverter.convertToDto(recordingSheetService.getRecordingSheet(id));
    }

    @PutMapping("/{id}")
    public void updateSheet(@PathVariable("id") Long id, @RequestBody RecordingSheetDto sheetDto){
        recordingSheetService.update(id, recordingSheetConverter.convertToEntity(sheetDto));
    }

    @DeleteMapping("/{id}")
    public void deleteSheet(@PathVariable("id") Long id){
        recordingSheetService.delete(id);
    }

}
