package com.springmvc.etg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.etg.model.TaskBean;
import com.springmvc.etg.model.UserBean;
import com.springmvc.etg.task.MySQLConnectionIm;



@Component
public class UserImpl implements UserInterface  {

	@Autowired
	MySQLInterface  mySQLConnection;
	public boolean validateuser(String name, String password) throws SQLException {
		
		boolean st =false;
        try {
        	Connection c =  mySQLConnection.getConnection();
            PreparedStatement ps = (PreparedStatement) c.prepareStatement("select pwd from loging where username=?  ");
            
			
            ps.setString(1, name);
      
            ResultSet rs =(ResultSet) ps.executeQuery();
           
            st = rs.next();
           
			if( rs.getString("password").equals(password))
    			    {
    			    return true;
    			    }else
    			    {
    			    return false;
    			   }
    		
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;  
        
	}
	//@Autowired
	//MySQLInterface  mySQLConnection;
	//public UserBean getUser(int uid) {
		//Connection c = mySQLConnection.getConnection();
		//UserBean user =new UserBean();
		//try {
		//String sql ="select * from loging where uid=?";
		//PreparedStatement st = c.prepareStatement(sql);
		//st.setInt(1,uid);
		//ResultSet rs= st.executeQuery();
		//while (rs.next())
		//{
		//user.setUid(rs.getInt("uid"));
		//}
		//c.close();
		//}catch(Exception e) {
		//e.printStackTrace();
		//}
		//return user;
		}
	
	
		
		

		
		
	
	
	



