package com.kq.entity;

import java.util.Optional;

public class Student {

    private int id;
    private String name;
    private int age;

    private Optional<Teacher> optionalTeacher;
    private Teacher teacher;

    public Optional<Teacher> getOptionalTeacher() {
        return optionalTeacher;
    }

    public void setOptionalTeacher(Optional<Teacher> optionalTeacher) {
        this.optionalTeacher = optionalTeacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", optionalTeacher=" + optionalTeacher +
                ", teacher=" + teacher +
                '}';
    }
}
