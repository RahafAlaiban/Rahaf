package Msg;


import lombok.*;
@Getter @Setter
 public class Operator {
    String firstName;
    long id;
    String email;
    int status;
    char gender;

    public Operator(String firstName, long id, String email, int status, char gender) {
        this.firstName = firstName;
        this.id = id;
        this.email = email;
        this.status = status;
        this.gender = gender;
    }


}
