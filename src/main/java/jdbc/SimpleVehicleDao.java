package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleVehicleDao {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {
			conn = JdbcUtil.getConnection();

			String query = "select * from vehicle";

			try(Statement stm = conn.createStatement()) {
				ResultSet rs = stm.executeQuery(query);
				while (rs.next()){
					int vehicleId = rs.getInt("vehicle_id");
					String name = rs.getString("name");
					int userId = rs.getInt("user_id");

					System.out.println(vehicleId + " " + name + " " + userId);
				}
			}

			JdbcUtil.commit(conn);
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw e;
		} finally {
			JdbcUtil.closeConnection(conn);
		}
	}
}
