package com.goodrobot.misc;

import com.goodrobot.annotation.Metadata;
import com.goodrobot.domain.CMEmployee;
import com.goodrobot.domain.Employee;

import java.lang.reflect.Field;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Employee employee = new Employee();

        employee.setEmpId("1123");
        employee.setName("Amit");
        employee.setCategory("House");
        employee.setLegalEntity("0865");

        getMetadata(employee);

    }

    private static void getMetadata(Employee employee) {

        Field[] fields = employee.getClass().getDeclaredFields();
        for (Field field : fields) {
            Metadata annotation = field.getAnnotation(Metadata.class);
            if (annotation != null) {
                boolean isVisibleForCategory = Arrays.asList(annotation.visibleFor().category()).contains(employee.getCategory());
                boolean isVisibleForLegalEntity = Arrays.asList(annotation.visibleFor().legalEntity()).contains(employee.getLegalEntity());
                System.out.println("Field :: " + field.getName());
                System.out.println(" with Label :: " + annotation.label());
                if (isVisibleForLegalEntity) {
                    System.out.println(" is visible for LE :: " + employee.getLegalEntity());
                } else {
                    System.out.println(" is NOT visible for LE :: " + employee.getLegalEntity());
                }
                if (isVisibleForCategory) {
                    System.out.println(" is visible for Category :: " + employee.getCategory());
                } else {
                    System.out.println(" is NOT visible for Category :: " + employee.getCategory());
                }
            }
        }

    }

    private static CMEmployee convert(Employee employee) throws Exception {
        CMEmployee cmEmployee = new CMEmployee();
        Field[] fields = employee.getClass().getDeclaredFields();
        for (Field field : fields) {
            Metadata annotation = field.getAnnotation(Metadata.class);
            if (annotation != null) {
                String cmAttribute = annotation.cmAttribute();
                Field declaredField = cmEmployee.getClass().getDeclaredField(cmAttribute);
                declaredField.setAccessible(true);
            }
        }
        return cmEmployee;
    }

}
