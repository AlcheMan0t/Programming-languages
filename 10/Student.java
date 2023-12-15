package nacas1;
import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int indexNo;
    int age;

    Student(String name, int indexNo, int age) {
        this.name = name;
        this.indexNo = indexNo;
        this.age = age;
    }
}

public class Demo {
    static Random rand = new Random();

    static Student createStudent(String name, int indexNo, int age) {
        return new Student(name, indexNo, age);
    }

    static void printValues(Student student) {
        System.out.println("Name: " + student.name);
        System.out.println("Index Number: " + student.indexNo);
        System.out.println("Age: " + student.age);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

        List<Student> students = names.stream()
            .map(name -> createStudent(name, rand.nextInt(10000) + 1, rand.nextInt(13) + 18))
            .collect(Collectors.toList());

        students.forEach(Demo::printValues);
    }
}
