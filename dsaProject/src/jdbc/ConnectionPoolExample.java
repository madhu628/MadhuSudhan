package jdbc;

import java.sql.SQLException;

public class ConnectionPoolExample {
	private static BasicDataSource dataSource;

	static {
		dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/yourDatabase");
		dataSource.setUsername("yourUsername");
		dataSource.setPassword("yourPassword");
		dataSource.setMinIdle(5);
		dataSource.setMaxIdle(10);
		dataSource.setMaxOpenPreparedStatements(100);
	}

	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	public static void main(String[] args) {
		try (Connection connection = getConnection()) {
			// Use the connection
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM yourTable");
			while (resultSet.next()) {
				System.out.println("Column1: " + resultSet.getString("column1"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
