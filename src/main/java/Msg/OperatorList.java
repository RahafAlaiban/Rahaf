package Msg;

 public class OperatorList {

    Operator  operators[] = new Operator[1];


     public OperatorList(String firstName, long id, String email, int status, char gender) {
         for (int i =0; i< operators.length; i++){
             operators[i] = new Operator (firstName,id, email, status, gender);
         }
     }

     public Operator [] OperatorList () {

        for (int i =0;i< operators.length; i++){
            System.out.println(operators[i].firstName + " " + operators[i].id + " " + operators[i].email + " " + operators[i].status + " "+ operators[i].gender);
        }
        return operators ;

    }
}
