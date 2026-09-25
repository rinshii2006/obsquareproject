class Student {
String name;
int age;
void study() {
System.out.println("Student is studying");
}
}
public class Main {
public static void main(String[] args) {
Student s1 = new Student();
s1.name = "Anu";
s1.age = 21;
s1.study();
}
}