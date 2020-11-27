package dk.kaspersoerensen.persons;

import java.sql.ResultSet;
import java.sql.SQLException;

import dk.kaspersoerensen.database.Queryable;

/**
 * Simple example of a Person Class with first and last name
 */
public class Person implements Queryable {

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
     * @param CPRnr First name
     * @param Dato  Last name
     */
    public Person(String CPRnr, String Dato) {
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
    @Override
    public String toString() {
        return "CPRnr:" + " " + this.CPRnr + " Dato: "+ " " + this.Dato;
    }

    /**
     * Method that sets the First and Last Name of the person
     * based on the resultset from the database
     */
    @Override
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
    @Override
    public String returnSqlQuery() {
        String sqlQuery = "SELECT FirstName, LastName FROM Persons";
        return sqlQuery;
    }

    /**
     * Method that updates the Person entry in the database
     */
    @Override
    public String returnSqlUpdate() {
        
        String sqlQuery = "UPDATE Persons SET FirstName='" + this.CPRnr + "', LastName='" + this.Dato;
        return sqlQuery;

    }

}