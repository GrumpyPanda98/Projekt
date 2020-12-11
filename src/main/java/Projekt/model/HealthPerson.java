package Projekt.model;

public class HealthPerson {
    private String username;
    private String password;
    private String name;
    private String workplace;

public HealthPerson(String username, String password, String name, String workplace){
    this.username = username;
    this.password = password;
    this.name = name;
    this.workplace = workplace;

    
}
public String getName() {
    return name;
}
public String getPassword() {
    return password;
}
public String getUsername() {
    return username;
}
public String getWorkplace() {
    return workplace;
}





}

