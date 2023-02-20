package ru.job4j.encapsulation;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mike");
        student.setStudentGroup(3);
        student.setReceiptDate("september 1, 2022");
        System.out.println("Student name " + student.getName()
                + ", student group " + student.getStudentGroup()
                + ", receipt date " + student.getReceiptDate());
    }
}
