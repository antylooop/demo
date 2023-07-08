package org.example.model;

public class Student {
    String name;
    String place;
    String college;
    String email;
    Long phone;
    Integer age;
    String bloodGroup;

    public Student(String name, String place, String college, String email, Long phone, Integer age, String bloodGroup){
        this.name = name;
        this.place = place;
        this.college = college;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " Place: " + this.place;
    }

    @Override
    public boolean equals(Object student){
        return this.place.equalsIgnoreCase(((Student)student).place) &&
                this.name.equalsIgnoreCase(((Student)student).name);
    }
}
