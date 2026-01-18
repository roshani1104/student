package com.std.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.std.entity.Student;
import com.std.util.Util;

public class StudentDao {
	static Connection con = Util.getConnection();

	public static void createData(Student student) {

		try {
			PreparedStatement ps = con.prepareStatement("insert into studentsdata values(?,?,?)");

			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getLastName());

			ps.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		Student st = new Student();
		st.setId(7);
		st.setName("roshni");
		st.setLastName("dangat");

		createData(st);
	}

}
