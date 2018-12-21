package ExerciseJava2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import oracle.jdbc.pool.OracleDataSource;

public class HelloRaw {

	public static void main(String[] args) {
		try {
			OracleDataSource ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@localhost:1521/orclpdb");
			ods.setUser("hr");
			ods.setPassword("hr");
			
			Connection conn = ods.getConnection();
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("SELECT first_name FROM employees");
			
			List<String> results = new ArrayList<String>();
			while (rs.next()) {
				results.add(rs.getString(1));
			}
			
			System.out.println(results.size());
			Collections.sort(results);
			System.out.println(results.get(0));
			System.out.println(results.get(results.size() - 1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
