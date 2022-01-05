package com.springmvc.etg.task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.etg.model.TaskBean;
import com.springmvc.etg.model.UserBean;



@Component
public class TaskImpl implements TaskInterface {
	@Autowired
	MySQLConnection  mySQLConnectionIm;
	public boolean addTask(TaskBean task) throws SQLException {
		boolean flag = false;
		//MySQLConnection con  =  new  MySQLConnectionIm();
		Connection c =  mySQLConnectionIm.getConnection();
		String sql = "insert into taskdetails (taskid,ownerid,description,status,notes,priority,creatorid) values(?,?,?,?,?,?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setInt(1, task.getTaskId());
		st.setInt(2, task.getOwnerId());
		st.setString(3, task.getDescription());
		st.setString(4,task.getStatus());
		st.setString(5,task.getNotes());
		st.setInt(6,task.getPriority());
		st.setInt(7,task.getCreatorId());
		int r = st.executeUpdate();
		c.close();
		if(r<0) {
		System.out.println(r);
		return true;
		}
		else {
		return false;
		}
	}

	@Override
	public TaskBean getTask (int taskid) {
		Connection c = mySQLConnectionIm.getConnection();
		TaskBean task =new TaskBean();
		try {
		String sql ="select * from taskdetails where taskid=?";
		PreparedStatement st = c.prepareStatement(sql);
		st.setInt(1,taskid);
		ResultSet rs= st.executeQuery();
		while (rs.next())
		{
		task.setTaskId(rs.getInt("taskid"));
		//task.setName(rs.getString("taskname"));
		}
		c.close();
		}catch(Exception e) {
		e.printStackTrace();
		}
		return task;
		}
	
	
	public int assignOwner(int taskid,int ownerid) {
	Connection c = mySQLConnectionIm.getConnection();
	int rows=0;
	try {
	String sql = "update taskdetails set ownerid=? where taskid=?";
	PreparedStatement st = c.prepareStatement(sql);
	st.setInt(2, taskid);
	st.setInt(1,ownerid);
	rows=st.executeUpdate();
	c.close();
	} catch(Exception e) {
	e.printStackTrace();
	}
	return rows;
	}


	public TaskBean getAllTask(String status) {
	Connection c = mySQLConnectionIm.getConnection();
	TaskBean task =new TaskBean();
	try {
	String sql ="select * from taskdetails where status=?";
	PreparedStatement st = c.prepareStatement(sql);
	st.setString(1,status);
	ResultSet rs= st.executeQuery();
	while (rs.next())
	{
	task.setTaskId(rs.getInt("taskid"));
	task.setName(rs.getString("taskname"));
	task.setCreatedOn(rs.getDate("createdOn"));
	task.setCreatorId(rs.getInt("creatorid"));
	task.setDescription(rs.getString("description"));

	task.setStatus(rs.getString("status"));
	}
	}catch(Exception e) {
	e.printStackTrace();
	}
	return task;
	}

	
	
	public int assignpriority(int taskid,int priority)
	{
		Connection c = mySQLConnectionIm.getConnection();
		int rows=0;
		try 
		{
		String sql ="update taskdetails set priority =? where taskid=?";
		PreparedStatement st = c.prepareStatement(sql);
		st.setInt(2,taskid);
		st.setInt(1,priority);
		rows= st.executeUpdate();
		c.close();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return rows;
	}
		
	public int setNote(int taskid,String notes)
	{
		Connection c = mySQLConnectionIm.getConnection();
		int rows=0;
		try 
		{
		String sql ="update taskdetails set notes =? where taskid=?";
		PreparedStatement st = c.prepareStatement(sql);
		st.setInt(2,taskid);
		st.setString(1,notes);
		rows= st.executeUpdate();
		c.close();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return rows;
	}

	
	public boolean addUser(UserBean user) throws SQLException {
		boolean flag = false;
		//MySQLConnection con  =  new  MySQLConnectionIm();
		Connection c =  mySQLConnectionIm.getConnection();
		String sql = "insert into userdetails (uid,name) values(?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setInt(1, user.getUid());
		st.setString(2, user.getName());
		
		int r = st.executeUpdate();
		c.close();
		if(r<0) {
		System.out.println(r);
		return true;
		}
		else {
		return false;
		}
	}
	@Override
	public List<TaskBean> getalllTask(int ownerid) {
		Connection con = mySQLConnectionIm.getConnection();
		List<TaskBean> tasklist= new ArrayList<TaskBean>();
		try {
			String sql = "select * from taskdetails where ownerid=? ";
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, ownerid);

			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				TaskBean  task= new TaskBean();
				task.setCreatedOn(rs.getDate("createdon"));
				
				task.setCreatorId(rs.getInt("creatorid"));
				task.setDescription(rs.getString("description"));
			
				task.setNotes(rs.getString("notes"));
				task.setOwnerId(rs.getInt("ownerid"));
				task.setPriority(rs.getInt("priority"));
				task.setStatus(rs.getString("status"));
				task.setName(rs.getString("taskname"));
				task.setTaskId(rs.getInt("taskid"));
				tasklist.add(task);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return tasklist;
	}
}
		
	


