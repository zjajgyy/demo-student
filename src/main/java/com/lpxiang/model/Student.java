package com.lpxiang.model;

/**
 * Created by lipx on 2016/1/26.
 */
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private Integer classId;

    public Student() {}

    public Student(Integer id, String name, Integer age, Integer classId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classId = classId;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classId=" + classId +
                '}';
    }
}
