package LR5;

import java.util.Arrays;
public class example6 {

        private int max;
        private int min;

        public example6(int max, int min) {
            this.max = max;
            this.min = min;
        }

        public void swap(int a, int b) {
            int temp = a;
            a = b;
            b = temp;
        }

    public void update(int a) {
        update(a, 0);
    }

    public void update(int a, int b) {
            update(this.max, a);
            update(this.min, b);
        }

    public void show() {
            System.out.

            print("Max: " + max);
            System.out.print(", Min: " + min);
            System.out.println("");
        }

        public static void main(String[] args) {
            try{
                example6 s1 = new example6(-5, 10);
                s1.show();

                int a = -10;
                int b = 30;
                s1.update(a, b);
                s1.show();
            }catch(Exception e){
                System.out.println("Invalid Input");
            }
        }

    }

