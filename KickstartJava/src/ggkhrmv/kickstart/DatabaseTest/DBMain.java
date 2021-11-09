package ggkhrmv.kickstart.DatabaseTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DBMain {



    public static List getGroupId(String pw, Connection conn) throws SQLException {
        List<Integer> groupId = new ArrayList();
        PreparedStatement ps = conn.prepareStatement("SELECT group_id FROM myStart.pwd_all WHERE pw=?");
        ps.setString(1, pw);
        ResultSet rs = ps.executeQuery();
        System.out.println();
        while (rs.next()) {
            groupId.add(rs.getInt(1));
        }
        rs.close();
        return groupId;
    }



    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = DriverManager.
                getConnection(Creds.url, Creds.userName, Creds.pw);

        String pw = "MyAdmin2021";

        System.out.println(getGroupId(pw,conn));
        conn.close();


    }
}

