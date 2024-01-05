package LR5;

import java.util.Arrays;
class example5 {
        private int value;

        public example5() {
            this(0);
        }

        public example5(int value) {
            if (value > 100) {
                value = 100;
            }
            this.value = value;
        }

        public void setValue(int value) {
            this.value = (value <= 100) ? value : 100;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return Integer.toString(value);
        }

    }

    class example5_1 {
        public static void main(String[] args) {
            example5 solution = new example5();
            solution.setValue(50);
            System.out.println(solution); // 50

            try {
                solution.


                setValue(-1);
            } catch (Exception e) {
                System.out.println("Out of range"); // Out of range
            }

            System.out.println(Arrays.toString(example5.class.getDeclaredConstructors()));
        }

    }
