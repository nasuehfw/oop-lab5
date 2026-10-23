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
 * Клас Електромобіль. Поєднує успадкування Vehicle (extends)
 * та реалізацію Chargeable (implements).
 * 
 * @author Анастасія Горбунова
 * @version 5.0 23 Oct 2026
 */
public class ElectricCar extends Vehicle implements Chargeable {
    /**
     * Конструктор класу ElectricCar. Передає параметри базовому класу.
     * 
     * @param model модель електромобіля
     * @param year рік випуску
     */
    public ElectricCar(String model, int year) {
        super(model, year);
    }

    /**
     * Перевизначений метод руху електромобіля.
     * 
     * @return рядок із описом руху через електродвигун
     */
    @Override
    public String move() {
        return "Рухається за допомогою електродвигуна.";
    }

    /**
     * Реалізація методу інтерфейсу Chargeable.
     * Виконує контракт інтерфейсу без зміни повертаємого типу.
     */
    @Override
    public void charge() {
        // Контрактний метод інтерфейсу
    }
}
