package org.example;

import java.util.Arrays;

public class DeclaredMethodActivity {

    public static void main(String[] args) throws NoSuchMethodException {
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass.getDeclaredMethod("getName"));
        System.out.println(studentClass.getDeclaredMethod("setName", String.class));
        System.out.println(Arrays.toString(studentClass.getDeclaredMethods()));
        /*
        Вывод в консоль:
        public java.lang.String org.example.Student.getName()
        public void org.example.Student.setName(java.lang.String)
        [public java.lang.String org.example.Student.getName(), public void org.example.Student.setName(java.lang.String), public void org.example.Student.setAge(int), public int org.example.Student.getAge()]
         */
    }
}