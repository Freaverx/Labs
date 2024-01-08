package LR7.example1;

class SuperClass {
    public String textField;

    SuperClass(String text) {
        this.textField = text;
    }

    @Override
    public String toString() {
        return "SuperClass{" + "textField='" + textField + '\'' + '}';
    }
}

class SubClass extends SuperClass {
    public String additionalTextField;

    SubClass(String text) {
        super(text);
        this.additionalTextField = text;
    }

    SubClass(String text1, String text2) {
        super(text1);
        this.additionalTextField = text2;
    }

    @Override
    public String toString() {
        return "SubClass{" + "additionalTextField='" + additionalTextField + '\'' + ", textField='" + super.textField + '\'' + '}';
    }
}

