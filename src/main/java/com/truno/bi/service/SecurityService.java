package com.truno.bi.service;

import com.truno.bi.domain.Role;
import com.truno.bi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alok on 1/4/2018.
 */

@Service
public class SecurityService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {
        com.truno.bi.domain.User user = userRepository.findByUsername(userName);

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for (Role role : user.getRoles()) {

            authorities.add(new SimpleGrantedAuthority(role.getRole()));
        }

        UserDetails userDetails = (UserDetails) new User(user.getUsername(),
                user.getPassword(), authorities);

        return userDetails;
    }
}