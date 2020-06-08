package ru.gb;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Employee employee = new Employee("John", "CEO", "89211234567", 50000, 50);

        //здесь я подцепляю вывод геттера (по своей инициативе) к вызову метода (по заданию)
        System.out.print("Our employee has name " + employee.getName() + ", ");
        employee.employeeInfo();
        employeeArray.ageOver();//почему-то не видит массив ниже и метод из конструктора

        //не смог завернуть массив в отдельный метод, чтобы вызвать его по имени

        public static void employeeArray () {
            Employee[] employeeArray = new Employee[5];
            employeeArray[0] = new Employee("Ken", "CTO", "892312313", 40000, 50);
            employeeArray[1] = new Employee("Roy", "VP", "892312314", 36000, 40);
            employeeArray[2] = new Employee("Rob", "Sales", "892312315", 37000, 47);
            employeeArray[3] = new Employee("Ron", "Builder", "892312316", 38000, 36);
            employeeArray[4] = new Employee("Jack", "Security", "892312317", 20000, 25);

            //не выводит
            System.out.println(Arrays.toString(employeeArray));
        }

    }
}



