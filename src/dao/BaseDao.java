package dao;

import java.sql.Connection;
import java.sql.SQLException;

import util.DbUtil;


//���������ݿ�����Ӷ�����Ŀ�����ݿ����Ӷ�����һ����

public class BaseDao {
	public Connection con = new DbUtil().getCon();//��������ʵ�����ݿ�����
	//���������ݿ�رյķ���
	public void closeDao(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
