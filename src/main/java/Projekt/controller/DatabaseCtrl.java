package Projekt.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import Projekt.model.Patient;


/**
 * Class for manipulating with the database
 */
public class DatabaseCtrl {
    
    public static String username = "hst_2020_20gr5403";
    public static String password = "eesorisohtougeojaish";
    public static String host = "jdbc:mysql://db.course.hst.aau.dk:3306/hst_2020_20gr5403?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    /**
     * Method for connecting to the database. The method will return a connection
     * object if connection is established or null if no connection could be made
     * 
     * @return A connection object or null
     * @throws SQLException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static String DatabaseHanddlerCtrl(String sqlStatement) throws SQLException {
        String name = "et eller andet";
        Connection conn = null;
        ResultSet rs = null;
         
        // Try to load the Driver. This is done for compatibility reasons
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(host, username, password);
            rs = conn.prepareStatement(sqlStatement).executeQuery();
            rs.next();
            name = rs.getString("navn");
                
            
        }
        catch (ClassNotFoundException ex){
            System.out.println("hello"); //ex.getMessage()
        }
        return name;
        
    }
    
    /**
     * Overloading method for execute query with result set. 
     * This method only uses the Queryable object
     * @param queryable A Queryable object
     */
    //public static void executeQueryWithResultSet(Queryable queryable){
    //    executeQueryWithResultSet(queryable.returnSqlQuery(), queryable); 
    // }


    
    /**
     * Overloading method for execute UPDATE query with result set. 
     * This method only uses the Queryable object
     * @param queryable A Queryable object
     */
   // public static void executeUpdateQuery(Queryable queryable){
     //   executeUpdateQuery(queryable.returnSqlUpdate(), queryable); 
    // }

    /**
     * Method for executing a INSERT query for a Queryable object
     * @param queryable A Queryable object 
     */
    
    //public static void executeInsertQuery(Queryable queryable){
     //   executeUpdateQuery(queryable.returnSqlQuery(), queryable); 
    //}
    
    public String returnSqlQuery() {
        String sqlStatement = "SELECT `navn` FROM `Patientinfo` WHERE `CPR` = 1111111111";
        return sqlStatement;
    }


    
/**
 * Simple example of a Person Class with first and last name
 */


    /**
     * First name of the person
     */
    public String CPRnr;
    /**
     * Last name of the person
     */
    public String Dato;
    /**
     * ID of the person
     */

    /**
     * Constructor with input for first and last name and ID
     * 
     * @param CPRnr First name
     * @param Dato  Last name
     * @return
     */
    
    public void Patient(String CPRnr, String Dato) {
        this.CPRnr = CPRnr;
        this.Dato = Dato;

    }

    /**
     * Constructor with input for first and last name
     * @param firstName First name
     * @param lastName Last name
     */

    /**
     * Constructor for Person with only ID
     * @param ID ID of the Person
     */
    /**
     * Return a String with the persons ID, First and Last name
     */
   
    public String toString() {
        return "CPRnr:" + " " + this.CPRnr + " Dato: "+ " " + this.Dato;
    }

    /**
     * Method that sets the First and Last Name of the person
     * based on the resultset from the database
     */
  
    public void processResultSet(ResultSet rs) throws SQLException {
        rs.next();
        this.CPRnr = rs.getString("CPRnr");
        this.Dato = rs.getString("dato");
    }

    /**
     * Method for inserting a Person object into the database
     * NOTE: The Person will be added with no ID number. This will be
     * assigned by the database.
     */
 
 

    /**
     * Method that updates the Person entry in the database
     */
   



}
     