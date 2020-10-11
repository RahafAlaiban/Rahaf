package Msg;

import static java.util.Arrays.compare;

public class OperatorList {
     private int size = 5;
     private Operator operators[];
     private Operator [] op;
     private Operator [] op2;
    int j=0;
    int count =0;

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

     public static boolean equals(int[] list1, int[] list2){
if (compare(list1, list2)==0)
    return true;
return false;
     }

    public void countVowels (String string){
         for (int i =0;i<string.length();i++){
           char str = string.charAt(i);
             if (str == 'a'||str =='e'||str =='o'||str =='i'||str =='u')
                     count ++;
         else j++;
     }System.out.println("Number of Vowels "+ count);
        System.out.println("Number of Constant "+ j);}

   /* public void numOfOccurrence(int[] arr) {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] > 0)
                arr2[arr[i]]++;
        }

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]>0){
                System.out.println("Number of" + arr[i] + " = " + arr2[i]);
            }}
    }*/

    public void checkUpperCase(String string) {
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < string.length(); i++) {
            char str = string.charAt(i);
            if (str >= 'A' && str <= 'Z'){
                upper++;}
            else if (str >= 'a' && str <= 'z') {
                lower++;
            }
        }
        System.out.println("Num of Lower " + lower);
        System.out.println("Num of Upper " + upper);
    }

    public void countNumbers(int [] arr){
        int pos=0;
        int neg=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=0)
                pos++;
            else neg++;
        }
        System.out.println("Number of Positive numbers "+ pos);
        System.out.println("Number of Negative numbers "+ neg);
    }

    public void patterns1(int num){
        for (int i=0;i<num;i++){
            int k=1;
            for (int j=0;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println(" ");
        }}
    public void patterns2(int num){
        for (int i=num;i>=0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }}


    public void patterns3(int num){
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println(" ");
        }
    }

    public void patterns4(int num){
        for (int i=1;i<=num;i++){
            for (int j=0;j<=num;j++){
                System.out.print(" ");
            }
            for (int k=num;k>=i;k--){
                System.out.print(k);
            }
            System.out.println(" ");
        }
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
         int count = 0;
         int counter = 0;
         for (Operator operator : operators){
             if (operator.getStatus()==1)
                 count++;
             else counter++;
         }
         op = new Operator[count];
         op2 = new Operator[counter];
         count = 0;
         counter = 0;
         for (Operator operator : operators) {
             switch (operator.getStatus()) {
                 case 1:
                     op [count++]= operator;
                 case 2:
                     op2 [counter++]=operator;
                      }
         }
     }

 }

