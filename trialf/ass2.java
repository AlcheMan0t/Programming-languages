package ass2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student {
    private String fullName;
    private String yearOfStudy;
    private int id;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class demo2 {

    public static Student createStudent(String fullName, String yearOfStudy, int id) {
        Student student = new Student();
        student.setFullName(fullName);
        student.setYearOfStudy(yearOfStudy);
        student.setId(id);
        return student;
    }

    public static void print(Student student) {
        System.out.println("Full Name: " + student.getFullName());
        System.out.println("Year of Study: " + student.getYearOfStudy());
        System.out.println("ID: " + student.getId());
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> studentNames = List.of("Max Verstappen", "Jon Jones", "Will Smith", "Lebron James", "Cristiano Ronaldo");

        List<Student> students = studentNames.stream()
                .map(name -> createStudent(name, String.valueOf(new Random().nextInt(3) + 1), new Random().nextInt(9000) + 1000))
                .toList();

        System.out.println("Printing attributes for each Student:");
        students.forEach(demo2::print);

        List<Student> secondYearStudents = students.stream()
                .filter(student -> "2".equals(student.getYearOfStudy()))
                .toList();

        System.out.println("Printing attributes for second-year Students:");
        secondYearStudents.forEach(demo2::print);
    }
}
