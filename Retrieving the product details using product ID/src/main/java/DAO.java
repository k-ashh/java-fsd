import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DAO {
	public ResultSet retrieve(String id) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.getCon();
		if(con!=null) {
			System.out.println("connection is established");
		}
		else {
			System.out.println("connection failed");
		}
		Statement st=con.createStatement();
		String sql="select * from product where id ="+id;
		//select
		ResultSet rs=st.executeQuery(sql);
		//while(rs.next()) {
		//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		//}
		return rs;
	}
}
