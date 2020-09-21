package Msg;

import java.util.ArrayList;
import java.util.Set;

public class SizeTestCaller {
    SizeTest s = new SizeTest();
    public ArrayList<Integer> arr (int size){
        return s.arr(size);
    }

    public Set<String> testSet (int size){
        return s.testSet(size);
    }
}
