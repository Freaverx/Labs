package LR3;

import java.util.Arrays;

public class example8 {
    public static void main (String[] args)
    {

        char[] arr = new char[26];

        for (int i=0; i<26; i++)
        {
            if(isVowel(i))
            {
                arr[i]=' ';
            }
            else
            {
                arr[i]= (char)(i+65);
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static boolean isVowel (int i)
    {
        String vowels = "aeiouyAEIOUY";

        return vowels.contains(String.valueOf((char)(i+65)) );
    }
}