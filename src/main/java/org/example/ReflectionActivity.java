package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionActivity {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Class<Student> studentClass = Student.class;
        Constructor<Student> constructor = studentClass.getConstructor();
        Student student = constructor.newInstance();
        Field[] fields = student.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            String value = null;
            if (field.isAnnotationPresent(SetValue.class)) {
                value = field.getAnnotation(SetValue.class).value();
            }
            System.out.println("Для поля " + name + " значение " + value);
        }
    }
}
/*
Вывод в консоль:
Для поля name значение Оля
Для поля age значение 5
 */