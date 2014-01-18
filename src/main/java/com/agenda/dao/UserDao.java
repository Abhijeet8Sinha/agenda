package com.agenda.dao;

import java.util.List;
import com.agenda.domain.User;


public interface UserDao {
public void saveUser ( User user );
public List<User> getUser();

}


