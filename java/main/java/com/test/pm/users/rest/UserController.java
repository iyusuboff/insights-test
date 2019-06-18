package az.inngress.pm.users.rest;

import az.inngress.pm.users.api.UserApi;
import az.inngress.pm.users.dto.UserDto;
import az.inngress.pm.users.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("users")
public class UserController implements UserApi {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @Override
    public Long createUser(UserDto userDto) {
        return userService.createUser(userDto);
    }
}
