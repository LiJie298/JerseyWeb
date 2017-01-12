package com.lijie.Facade;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/10 0010.
 */
public class BaseFacada implements Facada {

    protected Connection connection;

    public BaseFacada() {
        try {
            this.connection = getConnection();
        }catch (ClassNotFoundException e2){
            System.out.println(e2.getMessage()+"\n"+e2.getCause());
        }catch (SQLException e1){
            System.out.println(e1.getMessage()+"\n"+e1.getCause());
        }catch (Exception e){
            System.out.println(e.getMessage()+"\n"+e.getCause());
        }
    }

    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(this.driverName);
        Connection connection = DriverManager.getConnection(this.url,this.user,this.password);
        return connection;
    }

    @Override
    public List<Object> CreatQuery(String sql) {
        List<Object> objects = new ArrayList<Object>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if(resultSet!= null){
                if(!resultSet.isLast()){
                }

            }
        }catch (SQLException e1){
            System.out.println(e1.getMessage()+"\n"+e1.getCause());
        }catch (Exception e){
            System.out.println(e.getMessage()+"\n"+e.getCause());
        }

        return objects;
    }
}
