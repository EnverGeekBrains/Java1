package ru.geekbrains.java1.dz_Enver_Eskendarov.dz5;

public class Dz_5 {

    public static void main(String[] args) {

        Personnel[] Person = new Personnel[5]; // Массив с данными сотрудников
        Person[0] = new Personnel("Васильев Андрей Анатольевич", "Кладовщик", "andrew@mail.ru", 79241234567L, 700, 27);
        Person[1] = new Personnel("Петров Сергей Иванович", "Менеджер", "serg_petrov@gmail.com", 79213342278L, 1200, 38);
        Person[2] = new Personnel("Иванова Мария Евгеньевна", "Уборщица", "ivanova_masha@list.ru", 2214400L, 500, 68);
        Person[3] = new Personnel("Михайлов Станислав Олегович", "Разнорабочий", "stasik_001@che.ru", 79125553311L, 2000, 45);
        Person[4] = new Personnel("Соколов Олег Владимирович", "Директор", "sokol@yandex.ru", 9997700L, 3000, 52);

        for (Personnel i : Person) {
            if (i.getAge() > 40) {
                i.printInfo();
            }
        }

    } // end main

} //end Dz_5


class Personnel { // создаем класс Personnel (Сотрудник)

    private String name = "no info";                        // ФИО
    private String position = "no info";                    // Должность
    private String mail = "no info";                        // Электронная почта
    private long num = 0;                                   // Тел. номер
    private int salary = 0;                                 // Зарплата
    private int age = 0;                                    // Возраст


    Personnel(String name, String position, String mail, long num, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.num = num;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println("ФИО: " + name + "\nДолжность: " + position + "\nE-mail: " + mail + "\nТел. номер: " + num + "\nЗарплата: " + salary + "$" + "\nВозраст: " + age + "\n");
    }

    int getAge() {
        return age;
    }
}    // end Personnel