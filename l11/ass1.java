package asdasdasd;

import java.io.*;

public class ded {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = reader.readLine();
        System.out.print("Enter your year of birth: ");
        int birthYear = Integer.parseInt(reader.readLine());
        int currentYear = 2023;
        int age = currentYear - birthYear;
        System.out.print("Enter your height in meters: ");
        double height = Double.parseDouble(reader.readLine());
        System.out.print("Enter your weight in kilograms: ");
        double weight = Double.parseDouble(reader.readLine());
        double bodyMassIndex = weight / (height * height);
        System.out.println("\nResults:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Body Mass Index (BMI): " + bodyMassIndex);
        reader.close();
    }
}

