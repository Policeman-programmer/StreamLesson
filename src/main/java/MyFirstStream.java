import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MyFirstStream {
    //There is function that calculate Pi sequence called  Leibniz function
    // 4/1 - 4/3 + 4/5 - 4/7 + ....

    public void endlessStream() {
        Stream.generate(() -> "I'll be a programmer!")
                .forEach(System.out::print);
    }

    public void sequencePi() {
        final int LIMIT = 20000000;
        double pi = DoubleStream.iterate(1, (i) -> ++i).limit(LIMIT).reduce(0, (sum, x) ->
                sum += (x % 2 == 0 ? -4 / (x * 2 - 1) : 4 / (x * 2 - 1)));
        System.out.println(pi);
    }
}