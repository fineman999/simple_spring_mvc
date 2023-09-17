package io.ppaekkom.simple_spring_mvc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
public class DatabaseConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Test
    void testDatabaseConnection() {
        try (Connection connection = dataSource.getConnection()){
            System.out.println(connection.getMetaData().getURL());
        } catch (SQLException e) {
            throw new RuntimeException("DB 연결 실패");
        }
    }
}
