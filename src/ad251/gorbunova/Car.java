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
 * Дочірній клас Car, що розширює Vehicle (Extends).
 * Представляє класичний автомобіль.
 * 
 * @author Анастасія Горбунова
 * @version 5.0 23 Oct 2026
 */
public class Car extends Vehicle {
    /**
     * Конструктор класу Car. Передає параметри базовому класу.
     * 
     * @param model марка авто
     * @param year рік випуску
     */
    public Car(String model, int year) {
        super(model, year);
    }

    /**
     * Перевизначений метод руху автомобіля.
     * 
     * @return рядок із описом руху автомобіля
     */
    @Override
    public String move() {
        return "Рухається загальною дорогою.";
    }
}

