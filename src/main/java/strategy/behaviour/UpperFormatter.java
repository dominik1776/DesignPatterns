package strategy.behaviour;

public class UpperFormatter implements Formatter {
    public String format(String text) {
        return text.toUpperCase();
    }
}