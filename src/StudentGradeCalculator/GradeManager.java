package StudentGradeCalculator;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return grades.size() > 0 ? sum / grades.size() : 0.0;
    }

    public String calculateLetterGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }

    public double calculateGPA(double average) {
        if (average >= 90) return 4.0;
        else if (average >= 80) return 3.0;
        else if (average >= 70) return 2.0;
        else if (average >= 60) return 1.0;
        else return 0.0;
    }

    public void displayGrades() {
        System.out.println("Grades: " + grades);
        double average = calculateAverage();
        System.out.println("Average Grade: " + average);
        System.out.println("Letter Grade: " + calculateLetterGrade(average));
        System.out.println("GPA: " + calculateGPA(average));
    }
}

public class GradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        Student student = new Student(name);

        while (true) {
            System.out.println("1. Add Grade");
            System.out.println("2. Display Grades");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    student.addGrade(grade);
                    break;
                case 2:
                    student.displayGrades();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

