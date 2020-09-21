package Msg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SizeTest {

    public static ArrayList<Integer> arr (int size){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(new Integer[size]));

       // for (int i =0; i<size ; i++){
   //     arr1.add(1);
//}
        return arr1;
    }

    public Set<String> testSet (int size){
        Set<String> testSet1 = new HashSet<>(size);
        testSet1.add("test");
        testSet1.add("test1");
        testSet1.add("test2");
        testSet1.add("test3");
        testSet1.add("test4");
        testSet1.add("test5");
        return testSet1;
    }
}
