package ru.gb;

public class Employee {
    public static final String GENDER = "male";
    //константа на пробу только мужского коллектива
    private String name;
    // это чтобы геттер прикрутить
    String position;
    String phone;
    int salary;
    int age;

    public String getName() {
        return this.name;
    }

    public Employee(String name, String position, String phone, int salary, int age) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
    }

    public void employeeInfo() {
        //наверное существует способ вывести в методе эту кучу строк более изящно, но мне неизвестен
        //System.out.printf("Our employee has name %s, ", name);
        System.out.print("his gender is " + GENDER + ", ");
        System.out.printf("his position is %s, ", position);
        System.out.printf("his phone number is %s, ", phone);
        System.out.printf("he has salary %d ", salary);
        System.out.printf("and he is %d years old", age);
    }

    // что-то не то, не могу разобраться с синтаксисом
    public void ageOver(int[] employeeArray) {
        for (int i = 0; i <= employeeArray.length; i++) {
            if (this.age > 40) {
                System.out.println("Age over 40 years old");
            }
            ;
        }
    }
}