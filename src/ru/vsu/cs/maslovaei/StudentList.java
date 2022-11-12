package ru.vsu.cs.maslovaei;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student a) {
        studentList.add(a);
    }

    public void facultyPrint(String faculty) {
        System.out.println("Список студентов факультета " + faculty);
        for (Student st : studentList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st);
            }
        }
    }

    public void coursePrint(String faculty, int course) {
        System.out.println("Список студентов факультета " + faculty + " курса " + course);
        for (Student st : studentList) {
            if (st.getFaculty().equals(faculty) & (st.getCourse() == course)) {
                System.out.println(st);
            }
        }
    }

    public void groupPrint(int group) {
        System.out.println("Список студентов группы " + group);
        for (Student st : studentList) {
            if (group == st.getGroupId()) {
                System.out.println(st);
            }
        }
    }
}
