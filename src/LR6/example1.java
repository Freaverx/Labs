package LR6;

import java.util.Arrays;

public class example1 {
    private char symbol;
    private String text;

    public void setValue(String value) {
        if (value.length() == 1) {
            symbol = value.charAt(0);
        } else {
            text = value;
        }
    }

    public void setValue(char[] value) {
        setValue(Arrays.toString(value));
    }


    public static void main(String[] args) {
        example1 example1 = new example1();
        example1.setValue("A");
        example1.setValue("Hello, World!");
    }

}

