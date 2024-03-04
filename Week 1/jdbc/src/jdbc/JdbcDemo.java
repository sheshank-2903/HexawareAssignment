package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_jfd", "root", "root");

			String insert = "insert into Employees(eid,ename,salary,job) values(112,'Tutu',27000,'MD')";

			String delete = "delete from employees where eid=112";

			String update = "update employees set comm=5000 where eid=111";

			String selectall = "select * from employees";

			String selectWithId = "select * from employees where eid=?";

			String updateprp = "update employees set comm=? where eid=?";

			Statement stmt = conn.createStatement();

			PreparedStatement prp = conn.prepareStatement(updateprp);
			prp.setInt(1, 2000);
			prp.setInt(2, 111);

//			int count = stmt.executeUpdate(update);
//			System.out.println(count + " records affected...");

//			 int count=prp.executeUpdate();
//			 System.out.println(count + " records affected...");

//			ResultSet rset=stmt.executeQuery(selectall);
//			while(rset.next()) {
//				System.out.println(rset.getInt("eid")+" "+rset.getString("ename"));
//			}

			PreparedStatement prp1 = conn.prepareStatement(selectWithId);
			prp1.setInt(1, 103);
			ResultSet rset1 = prp1.executeQuery();
			while (rset1.next()) {
				System.out.println(rset1.getInt("eid") + " " + rset1.getString("ename"));
			}

		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
