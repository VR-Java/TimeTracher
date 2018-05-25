package eu.mdpop.timetracking.converter.impl;

import eu.mdpop.timetracking.converter.UserConverter;
import eu.mdpop.timetracking.dto.UserDto;
import eu.mdpop.timetracking.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConverterImpl implements UserConverter {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserEntity convertToEntity(UserDto dto) {
        return modelMapper.map(dto, UserEntity.class);
    }

    @Override
    public UserDto convertToDto(UserEntity entity) {
        return modelMapper.map(entity, UserDto.class);
    }
}
