package ru.vsu.cs.maslovaei;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Полина", "Авдеева", "Андреевна", 19, 1, "ФКН", 2);
        Student student2 = new Student(2, "Батурин", "Влас", "Андреевич", 19, 1, "ФКН", 2);
        Student student3 = new Student(3, "Березин", "Ярослав", "Алексеевич", 19, 1, "ФКН", 2);
        Student student4 = new Student(4, "Волобуева", "Алина", "Александровна", 19, 1, "ФКН", 2);
        Student student5 = new Student(5, "Долженко", "Максим", "Сергеевич", 19, 1, "ФКН", 2);
        Student student6 = new Student(6, "Зотов", "Максим", "Александрович", 19, 2, "ФКН", 2);
        Student student7 = new Student(7, "Капустин", "Максим", "Иванович", 19, 2, "ФКН", 2);
        Student student8 = new Student(8, "Карпухин", "Егор", "Дмитриевич", 19, 2, "ФКН", 2);
        Student student9 = new Student(9, "Кислова", "Ирина", "Валерьевна", 19, 2, "ФКН", 2);
        Student student10 = new Student(7, "Кунахова", "Алина", "Юрьевна", 19, 2, "ФКН", 2);

        StudentList list = new StudentList();
        list.addStudent(student1);
        list.addStudent(student2);
        list.addStudent(student3);
        list.addStudent(student4);
        list.addStudent(student5);
        list.addStudent(student6);
        list.addStudent(student7);
        list.addStudent(student8);
        list.addStudent(student9);
        list.addStudent(student10);
        list.facultyPrint("ФКН");
        list.coursePrint("ФКН", 2);
    }
}
