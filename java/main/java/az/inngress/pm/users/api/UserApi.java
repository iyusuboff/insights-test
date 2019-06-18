package az.inngress.pm.users.api;

import az.inngress.pm.users.dto.UserDto;

public interface UserApi {

    Long createUser(UserDto userDto);
}
