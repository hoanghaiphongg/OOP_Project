package data;
import java.util.ArrayList;

import java.util.ArrayList;
import java.sql.Timestamp;
//import java.security.Timestamp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Articles;
import model.BlogPosts;
import model.Box;
import model.NFT;
import model.Tweets;

public class BackupDatabaseReader implements DataReader {
	 private static final String URL = "jdbc:postgresql://localhost:5432/your_database";
	    private static final String USER = "your_username";
	    private static final String PASSWORD = "your_password";

			private static Connection connection = null;
			public static Connection getConnection() throws SQLException, ClassNotFoundException {
				if(connection==null) {
					Class.forName("org.postgresql.Driver");
					connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/oop_backup", "postgres","abcdxyz1234");
					System.out.print("Connected to Group 14's database");
				}
				return connection;
			}

    // Các phương thức đọc dữ liệu khác nếu cần
}