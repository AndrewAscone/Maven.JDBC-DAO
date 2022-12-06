package daos;

import com.mysql.cj.jdbc.Driver;
import models.BandMember;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static final String URL = "jdbc:mysql://localhost:3306/GratefulDead";
    public static final String USER = "testuser";
    public static final String PASS = "testpass";

    public static Connection getConnection() {
        try{
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Connecting to database . . .");
//        Connection connection = getConnection();
//        if(connection != null) System.out.println("Successfully connected to database!");
//
//        //TODO Testing findByID method and using getters to print out details from accessed row
//        BandMembers test = new BandMembers();
//        BandMember found = test.findByID(1);
//
//        System.out.println(found.getFirstName() + " " + found.getLastName() + " was born in " +
//                found.getBirthYear() + " and played " + found.getInstrument() + " in the Grateful Dead");
//
//        //TODO Testing findAll method and iterating through created list to print details
//        for(BandMember i : test.findAll()){
//            System.out.println(i.getFirstName() + " " + i.getLastName());
//        }
//
//        //TODO Testing create method passing in a new band member to add to database
//        test.create(new BandMember("Brent", "Mydland", 1952, "keyboards"));
//        BandMember createFound = test.findByID(7);
//        System.out.println(createFound.getFirstName() + " " + createFound.getLastName());


    }
}
