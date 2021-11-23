package com.myname.main;

import com.myname.exception.InvalidStudentException1;
import com.myname.student.Student;

import java.util.Scanner;

public class Student_main {
    public static void main(String[] args) throws InvalidStudentException1 {

        Student[] list = new Student[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = new Student();
            list[i].setName(sc.nextLine());
            list[i].setRollNo(sc.nextInt());
            list[i].setCpi(sc.nextDouble());
            sc.nextLine();

        }
        /*
        for (Student student : list) {
            System.out.println(student);
        }

         */
        Student_main obj = new Student_main();
        try {
            Student result = obj.search(list, 12);
            System.out.println(result);
        }
        catch (InvalidStudentException1 e){
            System.out.println(e.getMessage());

        }



    }
    public Student search(Student[] list, int rollNo) throws InvalidStudentException1{
        Student response = null;
        for (Student student : list) {
            if(student.getRollNo() == rollNo){
                response = student;
                break;
            }
        }
        if(response == null){
            InvalidStudentException1 e = new InvalidStudentException1("student not found");
            throw e;
        }
        return response;
    }
}