package arraylists;

import java.util.ArrayList;

public class RemoveStudents {
    public static void main(String[] args) {
        // Create an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();

        // Add some students to the list
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Jane", "Smith", 2.8));
        studentList.add(new Student("Mike", "Johnson", 3.2));
        studentList.add(new Student("Emily", "Brown", 3.8));

        // Calculate the average GPA
        double totalGPA = 0;
        for (Student student : studentList) {
            totalGPA += student.GPA;
        }
        double averageGPA = totalGPA / studentList.size();

        // Remove students with GPA less than the average GPA
        studentList.removeIf(student -> student.GPA < averageGPA);

        // Print the remaining students
        for (Student student : studentList) {
            System.out.println(student.firstName + " " + student.lastName + ", GPA: " + student.GPA);
        }
    }
}
