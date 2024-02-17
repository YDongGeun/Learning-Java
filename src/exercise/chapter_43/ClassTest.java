package exercise.chapter_43;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) {
        Customer cs = new Customer("민철");
        Class clazz = cs.getClass();

        // 생성자
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        // 메소드
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        // 필드
        Field[] fields = clazz.getFields();
        for (Field field: fields) {
            System.out.println(field);
        }
    }
}
