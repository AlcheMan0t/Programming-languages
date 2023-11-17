package ass1;
import java.util.Random;

interface Average {
    float average();
}

interface Scholarship {
    float rate();
}

class Person {
    String p_name;

    Person(String name) {
        this.p_name = name;
    }
}

class Employee extends Person implements Average {
    int no_salaries;
    int[] salary;

    Employee(String name, int n) {
        super(name);
        this.no_salaries = n;
        this.salary = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            this.salary[i] = rand.nextInt(30001);
        }
    }

    public float average() {
        if (no_salaries == 0) return 0;
        int sum = 0;
        for (int i = 0; i < no_salaries; i++) {
            sum += salary[i];
        }
        return (float) sum / no_salaries;
    }
}

class Student extends Person implements Average, Scholarship {
    int no_grades;
    Employee parent1, parent2;
    int[] grade;

    Student(String name, int n, Employee r1, Employee r2) {
        super(name);
        this.no_grades = n;
        this.parent1 = r1;
        this.parent2 = r2;
        this.grade = new int[6];
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            this.grade[i] = rand.nextInt(6) + 5;
        }
    }

    public float average() {
        int sum = 0;
        for (int i = 0; i < no_grades; i++) {
            sum += grade[i];
        }
        return (float) sum / no_grades;
    }

    public float rate() {
        return this.average() * 6 + (60000 - (parent1.average() + parent2.average())) * 4;
    }
}
public class ass1{
    public static void main(String[] args) {
        Employee[] parents = new Employee[6];
        for (int i = 0; i < 6; i++) {
            parents[i] = new Employee("Parent " + (i + 1), i < 4 ? 12 : 0);
        }

        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            students[i] = new Student("Student " + (i + 1), 6, parents[i * 2], parents[i * 2 + 1]);
        }

        Student maxScholarshipStudent = students[0];
        for (Student student : students) {
            System.out.println("Student Name: " + student.p_name);
            System.out.println("GPA: " + student.average());
            System.out.println("First Parent Name: " + student.parent1.p_name + ", Average Salary: " + student.parent1.average());
            System.out.println("Second Parent Name: " + student.parent2.p_name + ", Average Salary: " + student.parent2.average());
            System.out.println("Scholarship Points: " + student.rate());
            System.out.println();

            if (student.rate() > maxScholarshipStudent.rate()) {
                maxScholarshipStudent = student;
            }
        }

        System.out.println("The student who will get the scholarship is: " + maxScholarshipStudent.p_name);
    }
}
