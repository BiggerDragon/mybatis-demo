package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectMysqlDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动类
        Class.forName("com.mysql.jdbc.Driver");
        //获得数据库连接
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true",
                "root", "root");
        Statement statement = connection.createStatement();
        boolean b = statement.execute("insert into t_user(u_no, u_name, u_age, birth_date) " +
                "values('U00000001', '张三', 23, '1995-07-03')");
        System.out.println("b=" + b);

//        connection.commit();

    }


}
