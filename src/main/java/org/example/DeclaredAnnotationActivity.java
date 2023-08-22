package org.example;

public class DeclaredAnnotationActivity {

    public static void main(String[] args) throws NoSuchFieldException {
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass.getDeclaredField("name").getDeclaredAnnotation(DeclarationTest.class));
        /*
        Вывод в консоль:
        @org.example.DeclarationTest("hello")
         */
    }
}