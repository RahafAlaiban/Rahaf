package Msg;


public class Biscuit implements Chocolate{

    public void chocolateType(){
        System.out.println( Chocolate.brand);
        System.out.println("Biscuit");
    }

    public double chocolatePrice(){
        return 20.5;
    }
}
