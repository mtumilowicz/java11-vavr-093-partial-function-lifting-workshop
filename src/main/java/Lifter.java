import io.vavr.PartialFunction;
import io.vavr.control.Option;

import java.util.function.Function;

/**
 * Created by mtumilowicz on 2019-03-05.
 */
class Lifter {
    static <T, R> Function<T, Option<R>> lift(PartialFunction<T, R> function) {
        return a -> Option.none();
    }    
    
    static <T, R> Function<T, Option<R>> lift(Function<T, R> function) {
        return a -> Option.none();
    }
}