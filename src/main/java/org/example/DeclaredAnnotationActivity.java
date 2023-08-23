package org.example;

import sun.reflect.ReflectionFactory;

import java.lang.reflect.Field;

public class DeclaredAnnotationActivity {

    public static void main(String[] args) throws IllegalAccessException {
        Class<Student> studentClass = Student.class;
        Student student = new Student();
        student.setName("Оля");
        student.setAge(5);
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(DeclarationTest.class)) {
                field.setAccessible(true);
                System.out.println(field.getDeclaredAnnotation(DeclarationTest.class));
                System.out.println("Для поля " + field.getName() + " значение " + field.get(student));
            }
        }
        /*
        Вывод в консоль:
        @org.example.DeclarationTest("hello")
        Для поля name значение Оля
        @org.example.DeclarationTest("by maxsex")
        Для поля age значение 5
         */
    }
}