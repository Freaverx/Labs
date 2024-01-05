package LR5;

import java.lang.StringBuilder;
public class example2 {
    public static void main(String args[]) {
        Character start = 'A';
        Character end = 'D';

        System.out.println(betweenChars(start, end));

    }

    public static String betweenChars(Character start, Character end) {
        StringBuilder sb = new StringBuilder();

        for (char c = start.charValue(); c <= end.charValue(); ++c) {
            sb.append(c);
        }

        return sb.toString();

    }
}

