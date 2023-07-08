package org.example;

import org.example.model.Student;

public class StringExample {

    public static void main(String[] args) {
        Student srivani = new Student("Srivani", "Visakhapatnam", "Vignan", "srivani@gmail.com",
                1234567890L, 20, "O+");

        Student manohar = new Student("Manohar", "visakhapatnam", "MANIT", "manohar@gmail.com",
                1234567890L, 27, "O+");
        System.out.println("Srivani: " + srivani);
        System.out.println("Manohar: " + manohar);

        System.out.println("Equal ? " + srivani.equals(manohar));
    }

}
