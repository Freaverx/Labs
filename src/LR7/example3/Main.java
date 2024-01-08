package LR7.example3;

class SuperClass {
 private int integerField;
 
 SuperClass(int integer) {
 this.integerField = integer;
 }
 
 public void setIntegerField(int integer) {
 this.integerField = integer;
 }
 
 @Override
 public String toString() {
 return "SuperClass{" + "integerField=" + integerField + '}';
 }
}

class SubClass extends SuperClass {
 private char characterField;
 
 SubClass(char character, int integer) {
 super(integer);
 this.characterField = character;
 }
 
 @Override
 public void setCharacterField(char character) {
 this.characterField = character;
 }
 
 @Override
 public String toString() {
 return "SubClass{" + "characterField=" + characterField + ", integerField=" + super.integerField + '}';
 }
}

class SubSubClass extends SubClass {
 private String textField;
 
 SubSubClass(String text, char character, int integer) {
 super(character, integer);
 this.textField = text;
 }
 
 @Override
 public void setTextField(String text) {
 this.textField = text;
 }
 
 @Override
 public String toString() {
 return "SubSubClass{" + "textField='" + textField + '\'', "characterField=" + characterField + ", integerField=" + super.integerField + '}';
 }
}

public class Main {
 public static void main(String args) {
 SubSubClass subSubClass = new SubSubClass("Hello World!", 'A', 42);
 System.out.println(subSubClass);
 }
}