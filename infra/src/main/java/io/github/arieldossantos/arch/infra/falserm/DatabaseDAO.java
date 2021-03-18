package io.github.arieldossantos.arch.infra.falserm;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public final class DatabaseDAO {
    public void executeSelect() {
        try {
            Class.forName("org.h2.Driver");
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            PreparedStatement prepareStatement = connection.prepareStatement("SELECT 1");
            prepareStatement.execute();
            var rs = prepareStatement.getResultSet();
            while(rs.next()) {
                System.out.println(rs.getInt(1));
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error");
        }
    }
}
