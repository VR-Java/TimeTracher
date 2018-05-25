package eu.mdpop.timetracking.converter.impl;

import eu.mdpop.timetracking.converter.RecordingSheetConverter;
import eu.mdpop.timetracking.dto.RecordingSheetDto;
import eu.mdpop.timetracking.entity.RecordingSheetEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecordingSheetConverterImpl implements RecordingSheetConverter {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public RecordingSheetEntity convertToEntity(RecordingSheetDto dto) {
        return modelMapper.map(dto, RecordingSheetEntity.class);
    }

    @Override
    public RecordingSheetDto convertToDto(RecordingSheetEntity entity) {
        return modelMapper.map(entity, RecordingSheetDto.class);
    }
}
