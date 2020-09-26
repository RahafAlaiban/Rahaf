package Msg;

 public class OperatorList {

    Operator  operators[] ;


    public Operator [] OperatorList (String firstName, long id, String email, int status, char gender) {

        for (int i =0;i< operators.length; i++){
            Operator operator = new Operator(firstName,id, email, status, gender);
            operators[i] = operator;
            System.out.println(operators[i]);
        }
        return operators ;

    }
}
