package LR7.example2;

public class SuperClass {
    private String textField;

    SuperClass(String text) {
        this.textField = text;
    }

    public void setTextField(String text) {
        this.textField = text;
    }

    public int getLength() {
        return textField.length();
    }
}

class SubClass extends SuperClass {
    private int additionalField;

    SubClass(int additional, String text) {
        super(text);
        this.additionalField = additional;
    }

    @Override
    public void setTextField(String text) {
        super.setTextField(text);
    }

    @Override
    public void setAdditionalField(int additional) {
        this.additionalField = additional;
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    public int getAdditionalField() {
        return additionalField;
    }
}

public class Main {
    public static void main(String args) {
        SubClass subClass = new SubClass(42, "Hello World!");
        System.out.println(subClass.getLength()); // Выводит 11
        System.out.println(subClass.getAdditionalField()); // Выводит 42
    }
}
