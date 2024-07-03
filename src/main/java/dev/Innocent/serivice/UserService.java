package dev.Innocent.serivice;

import dev.Innocent.model.User;

public interface UserService {
    User findUserByJwtToken(String jwt) throws Exception;
}
