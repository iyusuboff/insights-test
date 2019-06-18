package az.inngress.pm.users.services.impl;

import az.inngress.pm.users.dto.UserDto;
import az.inngress.pm.users.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public Long createUser(UserDto userDto) {
        return 2132L;
    }
}
