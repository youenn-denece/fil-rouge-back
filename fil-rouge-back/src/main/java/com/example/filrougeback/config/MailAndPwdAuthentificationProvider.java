package com.example.filrougeback.config;

import com.example.filrougeback.entities.Authority;
import com.example.filrougeback.entities.User;
import com.example.filrougeback.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Component
public class MailAndPwdAuthentificationProvider implements AuthenticationProvider {
    @Autowired
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName = authentication.getName();
        String userPwd = authentication.getCredentials().toString();
        List<User> user = userRepository.findByEmail(userName);
        if (user.size()>0) {
            if(passwordEncoder.matches(userPwd, user.get(0).getPassword())){
                return new UsernamePasswordAuthenticationToken(userName, userPwd, getGrantedAuthorities(user.get(0).getAuthorities()));
            }else {
                throw new BadCredentialsException("Password non valide");
            }
        }else {
            throw new BadCredentialsException("Il n'existe pas d'utilisateur avec cette combinaison");
        }
    }
    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }

    private List<GrantedAuthority> getGrantedAuthorities(Set<Authority> authorities) {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (Authority authority : authorities) {
            grantedAuthorities.add(new SimpleGrantedAuthority(authority.getName()));
        }
        return grantedAuthorities;
    }
}
