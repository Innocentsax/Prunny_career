package dev.Innocent.serivice.Impl;

import dev.Innocent.model.User;
import dev.Innocent.repository.UserRepository;
import dev.Innocent.security.JwtProvider;
import dev.Innocent.serivice.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;

    @Override
    public User findUserByJwtToken(String jwt) throws Exception {
        String email = jwtProvider.getEmailFromJwtToken(jwt);
        return userRepository.findByEmail(email);
    }
}