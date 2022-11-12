package ru.vsu.cs.maslovaei;

public class Subject {

    private int id;
    private String name;
    private String educationForm;

    public Subject(int id, String name, String educationForm) {
        this.id = id;
        this.name = name;
        this.educationForm = educationForm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public void setEducationForm(String educationForm) {
        this.educationForm = educationForm;
    }
}
