package dk.kaspersoerensen.persons;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dk.kaspersoerensen.database.Queryable;

/**
 * Class for handeling the persons. 
 */
public class PersonsHandler implements Queryable {

    /**
     * ArrayList with Person objects
     */
    private ArrayList<Person> personList = new ArrayList<>();

    /**
     * Method for adding a person to the list of persons.
     * @param p The Person to add
     */
    public void addPersonToList(Person p) {
        this.personList.add(p);
    }

    /**
     * Get the list of all persons
     * @return The list with person objects
     */
    public ArrayList<Person> getPersonList() {
        return this.personList;
    }

    /**
     * Method for processing the ResultSet.
     * This will add Person-objects to the list of persons 
     */
    @Override
    public void processResultSet(ResultSet rs) throws SQLException {
        while (rs.next()){
            this.addPersonToList(new Person(rs.getString("CPRnr"), rs.getString("dato")));
        }
    }

    /**
     * Return SQL Query as String for selecting all Persons in the Database
     */
    @Override
    public String returnSqlQuery() {
        String sqlStatement = "SELECT CPRnr, dato FROM XMO";
        return sqlStatement;
    }


    @Override
    public String returnSqlUpdate() {
        
        System.out.println("This method is not implemented for this Class");
        return null;
    }


}