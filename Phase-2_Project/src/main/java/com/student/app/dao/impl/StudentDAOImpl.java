package com.student.app.dao.impl;

/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.student.app.dao.StudentDAO;
import com.student.app.dbutil.MySqlConnection;
import com.student.app.exception.BusinessException;
import com.student.app.model.User;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public boolean isValidLoginCredentials(User user) throws BusinessException {
		boolean b=false;
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="I * from assign_subject where teacher_name=? and subject_name=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, user.getTeacher_name());
			preparedStatement.setString(1, user.getSubject_name());
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				b=true;
				
			}else {
				throw new BusinessException("No User matching with the entered teacher_name and subject_name");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);//take this off when going live
			throw new BusinessException("Internal error occured kindly contact SYSADMIN");
		}
		return b;
	}

}*/




/*import com.app.dbutil.MySqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Employee;*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.student.app.dao.StudentDAO;
import com.student.app.dbutil.MySqlConnection;
import com.student.app.exception.BusinessException;
import com.student.app.model.User;

public class StudentDAOImpl implements StudentDAO {

	/*
	 * public int createEmployee(User user) throws BusinessException { int c = 0;
	 * try (Connection connection = MySqlConnection.getConnection()) { String sql =
	 * "insert into assign_subject(teacher_name,subject_name) values(?,?)";
	 * PreparedStatement preparedStatement = connection.prepareStatement(sql);
	 * //preparedStatement.setInt(1, employee.getId());
	 * preparedStatement.setString(1,user.getTeacher_name());
	 * preparedStatement.setString(2, user.getSubject_name());
	 * //preparedStatement.setDouble(4, employee.getSalary());
	 * //preparedStatement.setLong(5, employee.getContact());
	 * 
	 * c = preparedStatement.executeUpdate();
	 * 
	 * } catch (ClassNotFoundException | SQLException e) { System.out.println(e);
	 * throw new BusinessException("Internal error occured contact SYSADMMIN"); }
	 * return c; }
	 */
	@Override
	public boolean isValidLoginCredentials(User user) throws BusinessException {
		boolean b=false;
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="insert into assign_subject(teacher_name,subject_name) values(?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, user.getTeacher_name());
			preparedStatement.setString(1, user.getSubject_name());
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				b=true;
				
			}else {
				throw new BusinessException("No User matching with the entered teacher_name and subject_name");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);//take this off when going live
			throw new BusinessException("Internal error occured kindly contact SYSADMIN");
		}
		return b;
	}

}

	/*public int updateEmployeeContact(int id, long newContact) throws BusinessException {
		int c = 0;
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "update";// write update query here
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// replace question marks by data here

			c = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMMIN");

		}
		return c;
	}*/

	/*public int deleteEmployeeById(int id) throws BusinessException {
		int c = 0;
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "";// write delete query here
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// replace question mark by data here

			c = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMMIN");

		}
		return c;
	}*/

	/*public int createMultipleEmployees(List<Employee> empList) throws BusinessException {
		int c = 0;
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "insert into employee(id,name,age,salary,contact) values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			for (Employee employee : empList) {
				preparedStatement.setInt(1, employee.getId());
				preparedStatement.setString(2, employee.getName());
				preparedStatement.setInt(3, employee.getAge());
				preparedStatement.setDouble(4, employee.getSalary());
				preparedStatement.setLong(5, employee.getContact());
				preparedStatement.addBatch();
			}
			c = preparedStatement.executeBatch().length;

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMMIN");
		}
		return c;*/
	

	/*
	 * public int createMultipleEmployeesTransaction(List<Employee> empList) throws
	 * BusinessException { int c = 0; Connection connection = null; try { connection
	 * = MySqlConnection.getConnection(); connection.setAutoCommit(false); String
	 * sql = "insert into employee(id,name,age,salary,contact) values(?,?,?,?,?)";
	 * PreparedStatement preparedStatement = connection.prepareStatement(sql); for
	 * (Employee employee : empList) { preparedStatement.setInt(1,
	 * employee.getId()); preparedStatement.setString(2, employee.getName());
	 * preparedStatement.setInt(3, employee.getAge());
	 * preparedStatement.setDouble(4, employee.getSalary());
	 * preparedStatement.setLong(5, employee.getContact());
	 * preparedStatement.addBatch(); } c = preparedStatement.executeBatch().length;
	 *//*
		 * connection.commit(); connection.close();
		 */
		/*
		 * } catch (ClassNotFoundException | SQLException e) { try {
		 * connection.rollback(); } catch (SQLException e1) { System.out.println(e1); }
		 * System.out.println(e); throw new
		 * BusinessException("Internal error occured contact SYSADMMIN"); }
		 *//*
			 * finally { try { connection.close(); } catch (SQLException e) {
			 * System.out.println(e); } } return c; } }
			 */
