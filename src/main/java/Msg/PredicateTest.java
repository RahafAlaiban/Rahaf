package Msg;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest<T> {

    public List<T> testPredicate(Predicate<T> p, List<T> list){
        List<T> returnList = new ArrayList<>();
        for(T test1: list){
            if (p.test(test1))
returnList.add(test1);
        }
        return returnList;
    }
}

