package me.study.designpattern.adapter.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
