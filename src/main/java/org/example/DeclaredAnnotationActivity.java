package org.example;

import jdk.jfr.Name;

public class DeclaredAnnotationActivity {

    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass.getDeclaredAnnotation(Name.class));
        /*
        Вывод в консоль:
        @jdk.jfr.Name("test")
         */
    }
}