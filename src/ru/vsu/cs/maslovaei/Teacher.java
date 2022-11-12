package ru.vsu.cs.maslovaei;

public class Teacher {

    private String name;
    private String surname;
    private String patronymic;
    private String department;
    private int age;
    private String grade;
    private int id;

    public Teacher(String name, String surname, String patronymic, String department, int age, String grade, int id) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.age = age;
        this.grade = grade;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Teacher{"+" id " +
                ", name=" + name + '\'' +
                ", surname=" + surname + '\'' +
                ", patronymic=" + patronymic + '\'' +
                ", department=" + department + '\'' +
                ", age=" + age + '\'' +
                ", grade=" + grade + '\'' +
                '}';
    }

    public String fullName() {
        return surname + " " + name + " " + patronymic;
    }
}
