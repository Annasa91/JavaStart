package ru.geekbrains.javalessons;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Петров Петр", "Заместитель директора",
                "petrovvv@mailbox.com","55-95", 1000, 50);
        empArray[1] = new Employee("Сидоров Сидр", "Заместитель заместителя директора",
                "sidorovss@mailbox.com", "55-12", 2000, 38);
        empArray[2] = new Employee("Орлов Орел", "Главный Заместитель директора",
                "orlovoo@mailbox.com", "55-00", 3000, 30);
        empArray[3] = new Employee("Соколов Сокол", "Начальников начальник",
                "sokolovss@mailbox.com", "55-33", 4000, 44);
        empArray[4] = new Employee("Котов Кот", "Казначей",
                "kotovkk@mailbox.com", "55-66", 5000, 58);
        for (Employee employee : empArray)
            if (employee.getAge()>=40)
                System.out.println(employee);

    }
}
    class Employee {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return("ФИО: " + name + "; Должность: " + position + "; Эл.почта: " + email + "; Телефон: " + phone
                + "; Зарплата " + salary + "; Возраст: " + age);
    }
}



