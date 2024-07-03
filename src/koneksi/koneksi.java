/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Berliani Risqi
 */
public class koneksi {
    public static Connection Go(){
        Connection k = null;        
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setServerName("localhost");
            m.setDatabaseName("pemrokom-topsis");
            m.setUser("root"); 
            m.setPassword(""); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            k = m.getConnection();
            System.out.println("OK");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        return k;
    }
}
