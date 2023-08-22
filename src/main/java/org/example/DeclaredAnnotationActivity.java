package org.example;

import java.lang.reflect.Field;

public class DeclaredAnnotationActivity {

    public static void main(String[] args) throws NoSuchFieldException {
        Class<Student> studentClass = Student.class;
        Field[] fields = studentClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].isAnnotationPresent(DeclarationTest.class)) {
                System.out.println(fields[i].getDeclaredAnnotation(DeclarationTest.class));
                System.out.println(fields[i]);
            }
        }
        /*
        Вывод в консоль:
        @org.example.DeclarationTest("hello")
        private java.lang.String org.example.Student.name
        @org.example.DeclarationTest("by maxsex")
        private int org.example.Student.age
         */
    }
}