package LR7.example5;

class SuperClass {
 protected String textField;
 
 SuperClass(String text) {
 this.textField = text;
 }
 
 public void displayFields() {
 System.out.println(this.getClass().getName() + ": " + textField);
 }
}

class SubClassOne extends SuperClass {
 protected int integerField;
 
 SubClassOne(String text, int integer) {
 super(text);
 this.integerField = integer;
 }
 
 @Override
 public void displayFields() {
 System.out.println(this.getClass().getName() + ": " + textField + ", " + integerField);
 }
}

class SubClassTwo extends SuperClass {
 protected char characterField;
 
 SubClassTwo(String text, char character) {
 super(text);
 this.characterField = character;
 }
 
 @Override
 public void displayFields() {
 System.out.println(this.getClass().getName() + ": " + textField + ", " + characterField);
 }
}

public class Main {
 public static void main(String args) {
 SubClassOne subClassOne = new SubClassOne("Hello World!", 42);
 SubClassTwo subClassTwo = new SubClassTwo("Hello World!", 'A');
 
 subClassOne.displayFields();
 subClassTwo.displayFields();
 
 SuperClass superClass = subClassOne;
 superClass.displayFields();
 }
}