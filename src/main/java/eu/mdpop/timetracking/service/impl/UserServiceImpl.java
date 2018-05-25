package eu.mdpop.timetracking.service.impl;

import eu.mdpop.timetracking.entity.UserEntity;
import eu.mdpop.timetracking.repository.UserRepository;
import eu.mdpop.timetracking.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(UserEntity user) {
        userRepository.save(user);
    }

    @Override
    public UserEntity getUser(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("USER NOT FOUND"));
    }

    @Override
    public void update(Long id, UserEntity user) {
        getUser(id);
        user.setId(id);
        create(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

}
