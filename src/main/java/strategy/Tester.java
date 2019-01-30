package strategy;

import strategy.behaviour.LowerFormatter;
import strategy.behaviour.ReverseFormater;
import strategy.behaviour.UpperFormatter;

public class Tester {
    public static void main(String[] args) {
        String testText = "Design Pattern Test";
        TextEditor myEditor = new MyEditor(testText);
        myEditor.setFormatter(new UpperFormatter());
        System.out.println(myEditor.makeFormat());
        myEditor.setFormatter(new LowerFormatter());
        System.out.println(myEditor.makeFormat());

        myEditor.setFormatter(new ReverseFormater());
        System.out.println(myEditor.makeFormat());


    }
}
