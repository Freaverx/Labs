package LR3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class example7 {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите размер массива: ");
        int arrsize = Integer.valueOf(br.readLine().trim());
        char arr[] = new char [arrsize];

        String st = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<arrsize;i++){
            arr[i]=st.charAt(i);
            System.out.print(arr[i]);
        }
        br.close();
    }
}


