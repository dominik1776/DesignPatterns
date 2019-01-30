package strategy.behaviour;


import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseFormater implements Formatter {
    public String format(String text) {
        final String [] words = text.split(" ");
        final Object [] arr = IntStream.rangeClosed(1, words.length)
                .mapToObj(i -> words[words.length - i])
                .toArray();
        return String.join(",",Arrays.copyOf(arr, arr.length, String[].class));

    }
}
