package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.landxaio.dao.Login;



public class loginDao {
	public int login(Login login) {
		String URL ="jdbc:mysql://localhost:3306/cms";
		String USERNAME ="root";
		String PWD ="root019910";
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//导入驱动，加载具体的驱动
			Class.forName("com.mysql.jdbc.Driver");
			//与数据库建立连接
			connection = DriverManager.getConnection(URL,USERNAME,PWD);
			//发送sql，执行（增删改，【查】）操作 Statement	
			
			String sql = "select count(*) from login where uname ='"+login.getUname()+"' and upwd='"+login.getUpwd()+"' ";
			//String sql = "delete from datas where id=10";		
			//String sql = "insert into datas values(?,?,?,?,?)";			
			pstmt = connection.prepareStatement(sql);	
				
			rs = pstmt.executeQuery();			
			int count = -1;
			if(rs.next()) {
				count = rs.getInt(1);
			}
			if(count>0) {
				System.out.println("登入成功！");
				
			}else {
				System.out.println("登入失败！");
				
			}
			return count;
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			return -1;
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return -1;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return -1;
		}finally {
			
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(connection != null) connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
}
