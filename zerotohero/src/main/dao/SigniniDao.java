package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//新規登録のときのデータベースのやりとり
//サーブレットとつなぐと思う。
public class SigninDao {
		
//		Conecton（接続に必要なものを準備）
		private static final String url ="jdbc:mysql://localhost/maimai";
		private static final String user ="root";
		private static final String password ="";

//		
		public int insertUser(UsersEnity usersEntity) {
			int result = 0;
			String sql = ("INSERT INTO users(id,name) VALUES(?,?)");
		
//新規登録の再現
	try {
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement xx =con.prepareStatement(sql)){
		
		xx.setInt(1, users.getId());
		xx.setString(2,users.getName());
		result = xx.executeUpdate();
		
	}catch(SQLException e ) {
		e.printStackTrace();
	}
		return result;
	}

}

