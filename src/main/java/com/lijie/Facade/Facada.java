package com.lijie.Facade;

import java.sql.*;
import java.util.List;

/**
 * Created by Administrator on 2017/1/10 0010.
 */
public interface Facada {
    String driverName="oracle.jdbc.driver.OracleDriver";
    //test为数据库名称，1521为连接数据库的默认端口 
    String url="jdbc:oracle:thin:@localhost:1521:orcl";
    String user="herendh";
    String password="herendh";
    Connection getConnection() throws SQLException, ClassNotFoundException;
    List<Object> CreatQuery(String sql);
}
