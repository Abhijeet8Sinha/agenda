package com.agenda.service;


import java.util.List;
import com.agenda.domain.User;
public interface UserService {
    public void addUser(User user);
    public List<User> getUser();

}