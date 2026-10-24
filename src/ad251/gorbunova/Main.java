/*
 * Copyright (c) 2026. Anastasiia Gorbunova
 * National University "Odesa Polytechnic"
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://apache.org
 */
package ad251.gorbunova;

/**
 * Головний керуючий клас програми (Точка входу).
 * Виконує координацію роботи обох секцій лабораторної роботи та демонструє
 * побудову динамічних CLI-таблиць на основі об'єктних моделей.
 * 
 * @author Анастасія Горбунова
 * @version 5.0 23 Oct 2026
 */
public class Main {

    /**
     * Точка входу в систему. Формує структурований псевдотабличний лог.
     * 
     * @param args аргументи командного рядка CLI
     */
    public static void main(String[] args) {
        System.out.print("=== Лабораторна робота №5 ===\n");
        System.out.print("Тема: Особливості призначення інтерфейсів "
                                +"та принципу успадкування.\n\n");

        // =====================================================================
        // 1. ЗАГАЛЬНА ПРАКТИЧНА ЧАСТИНА (Транспортні засоби)
        // =====================================================================
        System.out.print("--- 1. Демонстрація загального прикладу (Транспортні засоби). ---\n");
        // Генерація рядка-роздільника фіксованої довжини
        String vSeparator = "+------------"
                            +"+--------------"
                            +"+------"
                            +"+----------"
                            +"+---------------------------------------------------------------------+";
        
        // Поліморфний масив: зберігає посилання на базовий абстрактний клас Vehicle,
        // але ініціалізований конкретними об'єктами дочірніх класів                    
        Vehicle[] vehicles = {
            new Car("Toyota", 2022),
            new Bicycle("Trek", 2023),
            new ElectricCar("Tesla", 2024)
        };

        // Виведення шапки першої таблиці
        System.out.println(vSeparator);
        // Специфікатори типу %-10s задають ширину колонки та вирівнювання по лівому краю
        System.out.printf("| %-10s | %-12s | %-4s | %-8s | %-67s |%n", 
                         "Тип", "Марка/Модель", "Рік", "Зарядка", "Поточний стан / Дія");
        System.out.println(vSeparator);

        // Ітерація по масиву транспортних засобів
        for (Vehicle v : vehicles) {
            // Визначення текстового маркера типу на основі RTTI (Run-Time Type Information)
            String type = "Автомобіль";
            if (v instanceof Bicycle) type = "Велосипед";
            if (v instanceof ElectricCar) type = "Електрокар";

            // Безпечна перевірка реалізації інтерфейсу Chargeable без виклику void-методу.
            // Якщо об'єкт підтримує інтерфейс — виводимо "+", інакше "-"
            String chargeStatus = (v instanceof Chargeable) ? "+" : "-";

            // Поліморфний виклик методу v.move(). Точна реалізація визначається JVM 
            // динамічно під час виконання програми
            System.out.printf("| %-10s | %-12s | %-4d | %-8s | %-67s |%n", 
                    type, v.getModel(), v.getYear(), "   " + chargeStatus, v.move());
        }
        // Закриття таблиці
        System.out.println(vSeparator);
        System.out.print("\n");

        // =====================================================================
        // 2. ІНДИВІДУАЛЬНЕ ЗАВДАННЯ: ВАРІАНТ №7 (Комп'ютерна техніка)
        // =====================================================================
        System.out.print("--- 2. Демонстрація індивідуального завддання. Варіант №7"
                        +" (Комп'ютерна техніка). ---\n");
        //Генерація лінійного роздільника для другої таблиці
        String dSeparator = "+------------"
                            +"+-------------"
                            +"+-----------------"
                            +"+------------"
                            +"+---------------------------------------------------------+";

        // Створення масиву обчислювальної техніки. Демонстрація абстракції:
        // ми працюємо з абстрактним типом ComputerDevice, приховуючи деталі реалізації
        ComputerDevice[] devices = {
            new Laptop("Lenovo", "ThinkPad T470s", 4600),
            new Desktop("ASUS", "ROG Strix", 750),
            new Laptop("Apple", "MacBook Pro", 5800)
        };

        // Виведення шапки другої таблиці
        System.out.println(dSeparator);
        System.out.printf("| %-10s | %-11s | %-15s | %-10s | %-55s |%n",
                         "Тип", "Виробник", "Модель", "Мережа", "Статус ОС (bootUp)");
        System.out.println(dSeparator);

        // Поліморфний обхід масиву комп'ютерних пристроїв
        for (ComputerDevice cd : devices) {
            // Тернарний оператор для визначення базового типу пристрою
            String typeLabel = (cd instanceof Laptop) ? "Ноутбук" : "Десктоп";
            String netLabel = " ";
            
            // Низхідне приведення після обов'язкової безпечної перевірки instanceof.
            // Потрібно для доступу до методу getNetworkType(), якого немає в 
            // абстрактному ComputerDevice
            if (cd instanceof Connectable) {
                netLabel = ((Connectable) cd).getNetworkType();
            }

            // Формуємо розширений статус з полями [АКБ], [БЖ]
            String statusWithDetails = cd.bootUp();
            if (cd instanceof Laptop) {
                statusWithDetails += " [АКБ: " + ((Laptop) cd).getBatteryCapacity() + " мАг]";
            } else if (cd instanceof Desktop) {
                statusWithDetails += " [БЖ: " + ((Desktop) cd).getPowerSupply() + " Вт]";
    }

            // Динамічне зв'язування: виклик cd.bootUp() виконає метод конкретного 
            // Laptop або Desktop
            System.out.printf("| %-10s | %-11s | %-15s | %-10s | %-55s |%n", 
                    typeLabel, cd.getBrand(), cd.getModel(), netLabel, statusWithDetails);
        }

        // Демонстрація поліморфізму через інтерфейсне посилання.
        //Створення об'єкта, де типом посилання є інтерфейс Connectable, 
        // а типом об'єкта в кучі (Heap) — конкретний Laptop.
        // Це обмежує видимість об'єкта виключно методами самого інтерфейсу.
        Connectable officeLaptop = new Laptop("HP", "EliteBook", 5000);
        // Для включення цього об'єкта в загальну таблицю комп'ютерної техніки,
        // ми перевіряємо, чи є він спадкоємцем базового класу ComputerDevice
        if (officeLaptop instanceof ComputerDevice) {
            ComputerDevice polyDevice = (ComputerDevice) officeLaptop;
            Laptop polyLaptop = (Laptop) officeLaptop; // для доступа к батарее
    
            String statusWithDetails = polyDevice.bootUp() + " [АКБ: " 
                                                           + polyLaptop.getBatteryCapacity() 
                                                           + " мАг]";
            
            System.out.printf("| %-10s | %-11s | %-15s | %-10s | %-55s |%n", 
                    "* Ноутбук", polyDevice.getBrand(), polyDevice.getModel(), 
                    officeLaptop.getNetworkType(), statusWithDetails);
        }
        
        // Закриття таблиці та виведення академічної сноски-аннотації
        System.out.println(dSeparator);
        System.out.println("[АННОТАЦІЯ] * — Об'єкт створено через інтерфейсний тип посилання "
                                            +"(Connectable dev = new Laptop(...)).");
        System.out.println("                Демонстрація динамічного поліморфізму та доступу "
                                            +"виключно до методів інтерфейсу.");
    }
}
