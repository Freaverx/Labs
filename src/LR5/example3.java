package LR5;


class example3 {
    public static void main(String[] args) {

    }

    private int firstField;

    private int secondField;



    public example3() {

        this.firstField = 0;

        this.secondField = 0;

    }



    public example3(int firstField) {

        this.firstField = firstField;

        this.secondField = 0;

    }



    public example3(int firstField, int secondField) {

        this.firstField = firstField;

        this.secondField = secondField;

    }






    public int getFirstField() {

        return firstField;

    }



    public void setFirstField(int firstField) {

        this.firstField = firstField;

    }



    public int getSecondField() {

        return secondField;

    }



    public void setSecondField(int secondField) {

        this.secondField = secondField;

    }

}
