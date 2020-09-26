package Msg;


import lombok.*;

 public class Operator {
    String firstName;
    int id;
    String email;
    int status;
    char gender;


    public Operator(String firstName, int id, String email, int status, char gender) {
       this.firstName = firstName;
       this.id = id;
       this.email = email;
       this.status = status;
       this.gender = gender;
    }

    public String getFirstName() {
       return firstName;
    }

    public void setFirstName(String firstName) {
       this.firstName = firstName;
    }

    public int getId() {
       return id;
    }

    public void setId(int id) {
       this.id = id;
    }

    public String getEmail() {
       return email;
    }

    public void setEmail(String email) {
       this.email = email;
    }

    public int getStatus() {
       return status;
    }

    public void setStatus(int status) {
       this.status = status;
    }

    public char getGender() {
       return gender;
    }

    public void setGender(char gender) {
       this.gender = gender;
    }
 }
