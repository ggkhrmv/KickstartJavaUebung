package ggkhrmv.kickstart.DatabaseTest;

import java.sql.*;
import java.util.Scanner;


public class DBMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.
                getConnection("jdbc:h2:~/test", Creds.userName, Creds.pw);

        Scanner s = new Scanner(System.in);

        String firstName;
        String surname;
        String email;
        boolean inputCorrect = false;


        System.out.println("REGISTER FOR NEWSLETTER");
        System.out.println("=======================");
        System.out.println("Please insert your first name: ");
        firstName = s.nextLine();
        System.out.println("Please insert your last name: ");
        surname = s.nextLine();
        System.out.println("Please insert your email address:");
        email = s.nextLine();

        String sql = """
                DROP TABLE IF EXISTS NEWSLETTER;
                CREATE TABLE NEWSLETTER(ID INT PRIMARY KEY, NAME VARCHAR(255), SURNAME VARCHAR(255), EMAIL VARCHAR(255));
                """;

        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO NEWSLETTER(ID, NAME, SURNAME, EMAIL) VALUES (?,?,?,?)");
        preparedStatement.setInt(1,1);
        preparedStatement.setString(2,firstName);
        preparedStatement.setString(3,surname);
        preparedStatement.setString(4,email);

        String query = "SELECT * FROM NEWSLETTER";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        preparedStatement.executeUpdate();

        ResultSet rs = stmt.executeQuery(query);
        System.out.println();
        while(rs.next()) {
            int id  = rs.getInt("ID");
            String name = rs.getString("NAME");
            String sName = rs.getString("SURNAME");
            String emailQ = rs.getString("EMAIL");

            System.out.print("ID: " + id);
            System.out.print(", Name: " + name);
            System.out.print(", SurName: " + sName);
            System.out.print(", Email: " + emailQ);
        }
        rs.close();
        System.out.println("You have been successfully registered for the newsletter!");
        conn.close();


    }
}

