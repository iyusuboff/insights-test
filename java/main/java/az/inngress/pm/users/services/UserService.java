package az.inngress.pm.users.services;

import az.inngress.pm.users.dto.UserDto;

public interface UserService {

    Long createUser(UserDto userDto);
}
