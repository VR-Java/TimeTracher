package eu.mdpop.timetracking.controller;

import eu.mdpop.timetracking.converter.UserConverter;
import eu.mdpop.timetracking.dto.UserDto;
import eu.mdpop.timetracking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private UserService userService;

    @PostMapping
    public void createUser(@RequestBody UserDto userDto){
        userService.create(userConverter.convertToEntity(userDto));
    }

    @GetMapping
    public List<UserDto> getAllUsers (){
        return userConverter.convertToDto(userService.getUsers());
    }

    @GetMapping("/{id}")
    public UserDto getUser (@PathVariable("id") Long id){
        return userConverter.convertToDto(userService.getUser(id));
    }

    @PutMapping("/{id}")
    public void updateUser (@PathVariable("id") Long id, @RequestBody UserDto userDto){
        userService.update(id, userConverter.convertToEntity(userDto));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

}
