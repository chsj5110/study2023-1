package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	// MySQL Driver 6.0 이상"com.mysql.cj.jdbc.Driver";

	private static final String URL = "jdbc:mysql://localhost:3306/todolist?useSSL=false&allowPublicKeyRetrieval=true";
	// MySQL 6.1 이상
	// "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false&serverTimezone=Asia/Seoul";

	private static final String USER = "root";
	private static final String PW = "0000";

	@Test
	public void testConnection() throws Exception {
		// 드라이버 등록
		Class.forName(DRIVER);

		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {

			System.out.println(con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
