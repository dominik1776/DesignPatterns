package strategy;

import strategy.behaviour.Formatter;

public class TextEditor {
    private String text;
    private Formatter formatter;

    public TextEditor(String text) {
        this.text = text;
    }

    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }

    public String makeFormat() {
        return formatter.format(text);
    }
}
