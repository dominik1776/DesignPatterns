package strategy.behaviour;

public class LowerFormatter implements Formatter {
    public String format(String text) {
        return text.toLowerCase();
    }
}
