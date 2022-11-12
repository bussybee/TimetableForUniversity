package ru.vsu.cs.maslovaei;

public class Student {

    private int id;
    private static int nextId = 0;
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private int groupId;
    private String faculty;
    private int course;

    public Student(int id, String name, String surname, String patronymic, int age, int groupId, String faculty, int course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        id = nextId++;
        this.groupId = groupId;
        this.faculty = faculty;
        this.course = course;
        setName(name);
        setSurname(surname);
        setPatronymic(patronymic);
        setAge(age);
        setGroupId(groupId);
        setCourse(course);
        setFaculty(faculty);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String toString() {
        return "Student{" + " id " + id +  //можно объединить
                ", name=" + name + '\'' +
                ", surname=" + surname + '\'' +
                ", patronymic=" + patronymic + '\'' +
                ", age=" + age + '\'' +
                ", faculty=" + faculty + '\'' +
                ", course=" + course + '\'' +
                ", groupId=" + groupId + '\'' +
                '}';
    }

    public String fullName() {
        return surname + " " + name + " " + patronymic;
    }
}
