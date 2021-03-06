package com.springmvc.etg.task;

import java.sql.SQLException;
import java.util.List;

import com.springmvc.etg.model.TaskBean;
import com.springmvc.etg.model.UserBean;




public interface TaskInterface {
	public boolean addTask(TaskBean task) throws SQLException;
	
	public TaskBean getTask(int taskid);
	public int assignOwner(int taskid,int onwerid);
	public TaskBean getAllTask (String status);
	public int assignpriority(int taskid,int priority);
	public int setNote(int taskid,String notes);

	public boolean addUser(UserBean user) throws SQLException;
	public List<TaskBean> getalllTask(int ownerid);
	
	
	



	
}
