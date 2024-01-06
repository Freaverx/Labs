package LR6;

public class example2 {
    private static int count = 0;


    public static void showAndIncrementCount() {
        System.out.println(count);
        count++;
    }

}

class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            example2.showAndIncrementCount();
        }
    }

}
