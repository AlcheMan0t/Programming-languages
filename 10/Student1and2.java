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
        List<String> names = Arrays.asList("Alice", "Pob", "Charlie", "Peter", "Eve");

        List<Student> students = names.stream()
            .map(name -> createStudent(name, rand.nextInt(10000) + 1, rand.nextInt(13) + 18))
            .collect(Collectors.toList());

        students.forEach(Demo::printValues);
        List<Student> studentsWithP = students.stream()
                .filter(student -> student.name.startsWith("P"))
                .collect(Collectors.toList());
            System.out.println("Students whose names start with P:");
            studentsWithP.forEach(Demo::printValues);
            boolean allYoungerThan25 = students.stream()
                .allMatch(student -> student.age < 25);
            System.out.println("All students are younger than 25: " + allYoungerThan25);
            boolean allOlderThan25 = students.stream()
                .allMatch(student -> student.age > 25);
            System.out.println("All students are older than 25: " + allOlderThan25);
            boolean atLeastOneYoungerThan25 = students.stream()
                .anyMatch(student -> student.age < 25);
            System.out.println("At least one student is younger than 25: " + atLeastOneYoungerThan25);
        }
    }
