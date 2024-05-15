package Homework_25.task1;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
    public  static void main(String[] args) {

       ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Alice");
        studentList.add("Bob");
        studentList.add("Charlie");
        studentList.add("David");
        studentList.add("Eve");

        // Выводим список студентов в обратном порядке
        System.out.println("Список студентов в обратном порядке:");
        Collections.reverse(studentList);
        for (String student : studentList) {
            System.out.println(student);
        }



        studentList.remove(2);

        System.out.println("Обновленный список студентов после удаления:");
        for (String student : studentList) {
            System.out.println(student);
        }
    }
}
