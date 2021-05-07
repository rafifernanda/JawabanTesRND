package com.example.programmingtest;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
    Connection con;
    String uname, pass, ip, port, database;
    @SuppressLint("NewApi")

    public Connection connectionclass(){
        ip = "172.17.0.1";
        database = "DBCoba";
        uname = "sa";
        pass = "sqlServer532!";
        port = "1433";

        StrictMode.ThreadPolicy policy =
                new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectionURL = null;

        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectionURL = "jdbc:jtds:sqlserver://"+ ip + ":"
                    + port + ";" + "databasename=" + database + ";user="
                    + uname + ";password=" + pass + ";";
            connection = DriverManager.getConnection(ConnectionURL);
        }catch (Exception ex){
            Log.e("Error", ex.getMessage());
        }

        return connection;
    }
}
