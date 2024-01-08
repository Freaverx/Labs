package LR7.example4;

class BaseClass {
 private char field;
 
 BaseClass(char field) {
 this.field = field;
 }
 
 BaseClass(BaseClass base) {
 this.field = base.field;
 }
 
 @Override
 public String toString() {
 return "BaseClass{" + "field=" + field + '}';
 }
}

class MiddleClass extends BaseClass {
 private String text;
 
 MiddleClass(String text, char field) {
 super(field);
 this.text = text;
 }
 
 MiddleClass(MiddleClass middle) {
 super(middle);
 this.text = middle.text;
 }
 
 @Override
 public String toString() {
 return "MiddleClass{" + "text='" + text + '\'', "field=" + super.field + '}';
 }
}

class TopClass extends MiddleClass {
 private int number;
 
 TopClass(int number, String text, char field) {
 super(text, field);
 this.number = number;
 }
 
 TopClass(TopClass top) {
 super(top);
 this.number = top.number;
 }
 
 @Override
 public String toString() {
 return "TopClass{" + "number=" + number + ", text='" + super.text + '\'', "field=" + super.field + '}';
 }
}

public class Main {
 public static void main(String args) {
 TopClass topClass = new TopClass(42, "Hello World!", 'A');
 System.out.println(topClass);
 }
}