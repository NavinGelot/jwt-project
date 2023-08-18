package com.jwt.basicjwt.service;

import com.jwt.basicjwt.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOpt = Optional.of(new User());
        return userOpt.orElseThrow(
                        () -> new UsernameNotFoundException("User " + username + " not found"));
    }
}
