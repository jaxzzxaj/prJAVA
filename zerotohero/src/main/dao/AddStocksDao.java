package dao;
//在庫を追加する再現
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class AddStocksDao {
//	Coneciton
	private static final String url ="jdbc:mysql://localhost/maimai";
	private static final String user ="root";
	private static final String password ="";
	
//初期段階
	public int addstocks(MaimaisEntity maimaisEntity) {
		int result = 0;
		String sql =("INSERT INTO maimai(id,type,color,name,price,place VALUES(?,?,?,?,?,?)");
		
//在庫追加の再現
		try {
			Connection con  = DriverManager.getConnection(url,user,password);
			PreparedStatement xx = con.prepareStatement(sql)){
				
			xx.setInt(1,maimai.getId());
			xx.setString(2,maimai.getType());
			xx.setString(3,maimai.getColor());
			xx.setString(4,maimai.getName());
			xx.setInt(5,maimai.getPrice());
			xx.setString(6,maimai.getPlace());
			result = xx.executeUpdate();
				
			}catch(SQLException e) { 
				e.printStackTrace();
		}
			return result;
	}
		
}
