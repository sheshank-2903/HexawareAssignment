package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Department;

public class DepartmentDaoImpl implements IDepartmentDao{
	
	Connection conn=null;
	
	public DepartmentDaoImpl() {
		
		conn=DBUtil.getDBConnection();
	}
	
	@Override
	public int insertDept(Department dept) {
		// INSERT
		
		int count=0;

		String insert = "insert into dept values(?,?,?)";

		try {
			PreparedStatement prp = conn.prepareStatement(insert);

			prp.setInt(1, dept.getDno());
			prp.setString(2, dept.getDname());
			prp.setString(3, dept.getLocation());

			count = prp.executeUpdate();
			
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}

	@Override
	public int updateDept(Department dept) {

		String update = "update dept set dname=?,location=? where dno=?";
		int count=0;

		try {
			PreparedStatement prp = conn.prepareStatement(update);

			prp.setString(1,dept.getDname());
			prp.setString(2, dept.getLocation());
			prp.setInt(3,dept.getDno());

			count = prp.executeUpdate();
			
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}

	@Override
	public int deleteOne(int dno) {
		String delete="delete from dept where dno=?";
		int count=0;
		
		try {
			PreparedStatement prp=conn.prepareStatement(delete);
			prp.setInt(1,dno);
			
			count=prp.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}

	@Override
	public Department selectOne(int dno) {
		
		String selectOne="select dno,dname,location from dept where dno=?";
		Department dept=null;
		
		try {
			PreparedStatement prp=conn.prepareStatement(selectOne);
			prp.setInt(1, dno);
			
			ResultSet rs=prp.executeQuery();
			
			while(rs.next()) {
				dept=new Department(rs.getInt("dno"), rs.getString("dname"), rs.getString("location"));
			}
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return dept;
	}

	@Override
	public List<Department> selectAll() {
		
		String selectAll="select * from dept";
		List<Department> list=new ArrayList<Department>();
		
		try {
			PreparedStatement prp=conn.prepareStatement(selectAll);
			ResultSet rs=prp.executeQuery();
			while(rs.next()) {
				Department dept=
				new Department(rs.getInt("dno"), rs.getString("dname"), rs.getString("location"));
				list.add(dept);
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}

}
