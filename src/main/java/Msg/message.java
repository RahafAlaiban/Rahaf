package Msg;

//import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class message {
    private long id;
    private String message;
    private Date created;
    private String author;

    public message(){

    }
    public message(long id, String message, String author) {
        this.id = id;
        this.message = message;
        this.created = new Date();
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void getMsg(){
    System.out.println("Message Test");
}

    public static void main(String[] args) {
        Msg.message m = new message();
        m.getMsg();
        System.out.println("Test");

        List<Integer> integerList = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
    //    List<String> stringList = Arrays.asList("zero","one","two","three","four","five");
      //  List<Object> objectList = Arrays.asList(new String ("zero"),new String ("one"),new StringBuffer("two"));

        PredicateTest predicateTest = new PredicateTest();

        System.out.println("all:" + predicateTest.testPredicate(x-> true, integerList));
     //   System.out.println("even:" + predicateTest.testPredicate(x-> (x & 1) == 0 , integerList));
       // System.out.println("odd:" + predicateTest.testPredicate(x-> (x & 1) == 1 , integerList));
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println(function.apply("test2222"));

Consumer<Integer> t = (i)-> System.out.println(i);
        integerList.forEach(t);

        Supplier<String> name = new Supplier<String>() {
            @Override
            public String get() {
                return new String("Test Supplier");
            }
        };
        System.out.println(name.get());

Biscuit b = new Biscuit();
        b.chocolateType();
        Weaver w = new Weaver();
        System.out.println(w.chocolatePrice());

        SizeTestCaller s = new SizeTestCaller();
        System.out.println(s.arr(3));
        System.out.println(s.testSet(2));
        OperatorList op = new OperatorList();
        op.OperatorList("Rahaf",2, "test", 1, 'F');

    }
}
