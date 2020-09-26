package Msg;


import lombok.*;

 public class Operator {
    @Getter @Setter String firstName;
    @Getter @Setter long id;
    @Getter @Setter String email;
    @Getter @Setter int status;
    @Getter @Setter char gender;

    public Operator(String firstName, long id, String email, int status, char gender) {
        this.firstName = firstName;
        this.id = id;
        this.email = email;
        this.status = status;
        this.gender = gender;
    }


}
