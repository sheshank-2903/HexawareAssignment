package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud {
	public static void main(String[] args) {

		// INSERT

//		Connection conn = DBUtil.getDBConnection();
//
//		String insert = "insert into dept values(?,?,?)";
//
//		try {
//			PreparedStatement prp = conn.prepareStatement(insert);
//
//			prp.setInt(1, 70);
//			prp.setString(2, "Automation");
//			prp.setString(3, "Chennai");
//
//			int count = prp.executeUpdate();
//			System.out.println(count + " records affected...");
//		}
//
//		catch (SQLException e) {
//			e.printStackTrace();
//		}

		// UPDATE
//		Connection conn = DBUtil.getDBConnection();
//
//		String update = "update dept set dname=?,location=? where dno=?";
//
//		try {
//			PreparedStatement prp = conn.prepareStatement(update);
//
//			prp.setString(1, "Logistics");
//			prp.setString(2, "Mumbai");
//			prp.setInt(3, 70);
//
//			int count = prp.executeUpdate();
//			System.out.println(count + " records affected...");
//		}
//
//		catch (SQLException e) {
//			e.printStackTrace();
//		}

		// Select By DNO

//		Connection conn = DBUtil.getDBConnection();
//
//		String selectById = "select dno,dname,location from dept where dno=?";
//
//		try {
//			PreparedStatement prp = conn.prepareStatement(selectById);
//			prp.setInt(1, 20);
//
//			ResultSet rs = prp.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getInt("dno")+" "+rs.getString("dname")+" "+rs.getString("location"));
//			}
//			
//		}
//
//		catch (SQLException e) {
//			e.printStackTrace();
//		}

		// Select All

		Connection conn = DBUtil.getDBConnection();

		String selectAll = "select dno,dname,location from dept";

		try {
			PreparedStatement prp = conn.prepareStatement(selectAll);
			

			ResultSet rs = prp.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("dno") + " " + rs.getString("dname") + " " + rs.getString("location"));
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
