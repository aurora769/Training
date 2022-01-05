package com.springmvc.etg.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.etg.UserInterface;
import com.springmvc.etg.model.TaskBean;
import com.springmvc.etg.model.UserBean;
import com.springmvc.etg.task.TaskInterface;
@RestController
public class UserRestController {
	@Autowired
	UserInterface userImpl; 
	
	//@PostMapping("/restaddtask")
	//public void addTask (@RequestBody TaskBean task) throws SQLException{
	//	 taskImpl.addTask(task);
	//	}

	//@GetMapping("/restgetuser/{uid}")
	//public UserBean getUser(@PathVariable int uid) throws SQLException
	//{
    //   return userImpl.getUser(uid);
		//}
	

}
