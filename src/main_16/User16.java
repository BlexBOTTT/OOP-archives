package main_16;

public class User16 {

    private int userID;
    private String userName;
    private String firstName, lastName;

    User16(int userID, String userName, String firstName, String lastName){
        this.userID = userID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void setUserID(int userID){
        this.userID = userID;
    }

    int getUserID(){
        return this.userID;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    String getFirstName(){
        return firstName;
    }

    String getLastName(){
        return lastName;

    }

}