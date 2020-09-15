package Msg;

import java.util.Objects;

public interface Consumer <T>{

void accept(T t);

default Consumer<T> andThen(Consumer<T> after){
    Objects.requireNonNull(after);
    return (T t)->{accept(t);
    after.accept(t);};

}
}
