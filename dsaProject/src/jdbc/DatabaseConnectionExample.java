package jdbc;

public class DatabaseConnectionExample {
	public static void main(String[] args) {
		try {
			// Load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish a connection
			String url = "jdbc:mysql://localhost:3306/yourDatabase";
			String username = "yourUsername";
			String password = "yourPassword";
			Connection connection = DriverManager.getConnection(url, username, password);

			// Create a statement
			Statement statement = connection.createStatement();

			// Execute a query
			String query = "SELECT * FROM yourTable";
			ResultSet resultSet = statement.executeQuery(query);

			// Process the results
			while (resultSet.next()) {
				System.out.println("Column1: " + resultSet.getString("column1"));
				System.out.println("Column2: " + resultSet.getInt("column2"));
			}

			// Close the resources
			resultSet.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
