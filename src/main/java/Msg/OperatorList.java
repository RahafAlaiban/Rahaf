package Msg;

 public class OperatorList {
     private int size = 5;
     private Operator operators[];
     private Operator [] op;


     public OperatorList(Operator[] operators) {
         this.operators = getOperators();
     }

     public OperatorList() {
         this.operators = getOperators();
     }

     public void OperatorList() {
         StringBuilder stringBuilder = new StringBuilder();
         for (Operator operator : operators) {
             stringBuilder.append(operator.getFirstName()).
                     append(" ").
                     append(operator.getId()).
                     append(" ").append(operator.getEmail()).
                     append(" ").
                     append(operator.getStatus()).
                     append(" ").
                     append(operator.getGender()).
                     append("\n");
         }
         System.out.println(stringBuilder.toString());

     }


     public Operator[] getOperators() {
         Operator[] operators = new Operator[size];
         operators[0] = new Operator("Rahaf", 1, "Rahaf@gmail.com", 1, 'F');
         operators[1] = new Operator("Sara", 2, "Sara@gmail.com", 2, 'F');
         operators[2] = new Operator("Abdulaziz", 3, "Aziz@gmail.com", 1, 'M');
         operators[3] = new Operator("Yara", 4, "Yara@gmail.com", 1, 'F');
         operators[4] = new Operator("Shoug", 5, "Shoug@gmail.com", 2, 'F');
         return operators;
     }

     public void OperatorList1() {
         StringBuilder stringBuilder = new StringBuilder();
         for (Operator operator1 : op) {
             stringBuilder.append(operator1.getFirstName()).
                     append(" ").
                     append(operator1.getId()).
                     append(" ").append(operator1.getEmail()).
                     append(" ").
                     append(operator1.getStatus()).
                     append(" ").
                     append(operator1.getGender()).
                     append("\n");
         }
         System.out.println(stringBuilder.toString());

     }

     public void Operators() {
         for (Operator operator : operators) {
             switch (operator.getStatus()) {
                 case 1:
                     op = new Operator[size];
                    //for (int i = 0;i<this.size;i++)
                         op [0] = new Operator(operator.firstName, operator.id, operator.email, operator.status, operator.gender);
                 case 2:
                     Operator [] op2 = new Operator[size];
                     for (int j = 0;j<this.size;j++)
                     op2[j] = new Operator(operator.firstName, operator.id, operator.email, operator.status, operator.gender);
             }
         }
OperatorList1();

     }

 }

