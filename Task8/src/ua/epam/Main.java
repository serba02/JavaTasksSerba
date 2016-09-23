package ua.epam;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        Student student = new Student(1123, "Viktor", 5);
        StudentHasDiploma studentHasDiploma = new StudentHasDiploma(2314, "Anna", 4, "Edit distance");

        String className = "ua.epam.StudentHasDiploma";
        Class clazz = Class.forName(className);
        Method[] methods = studentHasDiploma.getClass().getMethods();

        for (Method method : methods) {
            InvokeAnnotation invokeAnnotation = method.getAnnotation(InvokeAnnotation.class);
            if (invokeAnnotation != null) {
                    System.out.println(method.invoke(studentHasDiploma));
            }
        }
        System.out.println();
        for (Method method : clazz.getMethods()) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType().getName());
            Class[] paramTypes = method.getParameterTypes();
            System.out.println("Parameter`s types:");
            for (Class paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
        }
        System.out.println();
        String aclass = clazz.getName();
        Class superClassName = clazz.getSuperclass();
        System.out.println(superClassName);
        Class[] paramTypes = new Class[]{int.class, String.class};
    }

}
