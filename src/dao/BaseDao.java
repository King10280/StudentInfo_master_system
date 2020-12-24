package dao;

import java.sql.Connection;
import java.sql.SQLException;

import util.DbUtil;


//创建对数据库的连接对象，项目与数据库连接都用这一对象

public class BaseDao {
	public Connection con = new DbUtil().getCon();//创建对象实现数据库连接
	//声明了数据库关闭的方法
	public void closeDao(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
