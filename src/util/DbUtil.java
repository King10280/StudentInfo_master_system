package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//�����ݿ⽨�����ӣ�basedao��ȡ�������������ӣ�����ÿһ��������ݿ⽨�����ӵ�model
public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/db_student?useUnicode=true&characterEncoding=utf8"; // ���ݿ����ӵ�ַ
	private String dbUserName="root"; // �û���
	private String dbPassword="root"; // ����
	private String jdbcName="com.mysql.jdbc.Driver"; // ��������
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws Exception
	 */
	public Connection getCon(){
		try {
			Class.forName(jdbcName);//�ҵ�build������mysql�еļܰ�
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	/**
	 * �ر����ݿ�����
	 */
	public void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	//�������ݿ��Ƿ����ӳɹ�
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("���ݿ����ӳɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
	}
}
