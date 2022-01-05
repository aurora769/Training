package com.springmvc.etg;

import java.sql.SQLException;

import com.springmvc.etg.model.UserBean;

public interface UserInterface {
public boolean  validateuser(String name , String password) throws SQLException;

//public UserBean getUser(int uid);



}
