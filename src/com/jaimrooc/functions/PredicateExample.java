package com.jaimrooc.functions;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Student> isApproved = student -> student.getGrade() >= 3.0;

        Student jaime = new Student(2.9, "Jaime");
        Student daniela = new Student(4.2, "Daniela");

        System.out.println(jaime.name + " is approved: " + isApproved.test(jaime));
        System.out.println(daniela.name + " is approved: " + isApproved.test(daniela));
    }

    static class Student {
        private double grade;
        private String name;

        public Student(double grade, String name) {
            this.grade = grade;
            this.name = name;
        }

        public double getGrade() {
            return grade;
        }

        public String getName() {
            return name;
        }
    }
}
