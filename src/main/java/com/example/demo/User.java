package com.example.demo;

public class User {
    private int Age;
    private String Name;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "Age=" + Age +
                ", Name='" + Name + '\'' +
                '}';
    }






}
