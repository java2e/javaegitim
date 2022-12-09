package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

    /*
    Verilerimizi bellek
    dizi
    collection list hashmap

    txt,excel veritabanları

    Java -> Veritabanı baglantı
    2 JDBC ---> Postgresql
    ORM Hibernate,JPA

    Driver Oracle Mysql Postgresql MSSQL

     */

    public static void main(String[] args) {

        try {

            String url ="jdbc:postgresql://localhost:5432/dvdrental";
            String userName="postgres";
            String password="root";


            Connection connection = DriverManager.getConnection(url,userName,password);

            if(connection !=null)
            {
                System.out.println("Connection is succesful!");

                String sql = "SELECT * FROM film";

                PreparedStatement statement = connection.prepareStatement(sql); // senın sql postgresql

                ResultSet resultSet = statement.executeQuery(); // kodu calıstırıyor

                while (resultSet.next()) {

                    System.out.print(resultSet.getString(1)+"  ");
                    System.out.print(resultSet.getString(3)+"  ");
                    System.out.print(resultSet.getString(4)+"  ");

                    System.out.println();

                }



            }
            else {
                System.out.println("Connection is fail!");
            }

        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
