package eu.mdpop.timetracking.service;

import eu.mdpop.timetracking.entity.UserEntity;

import java.util.List;

public interface UserService {

    void create(UserEntity user);

    UserEntity getUser(Long id);

    void update(Long id, UserEntity user);

    void deleteUser(Long id);

    List<UserEntity> getUsers();

}
