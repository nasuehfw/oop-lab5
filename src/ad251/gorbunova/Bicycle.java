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
 * Дочірній клас Bicycle, що розширює Vehicle (Extends).
 * Представляє велосипед.
 * 
 * @author Анастасія Горбунова
 * @version 5.0 23 Oct 2026
 */
public class Bicycle extends Vehicle {
    /**
     * Конструктор класу Bicycle. Передає параметри базовому класу.
     * 
     * @param model марка велосипеда
     * @param year рік випуску
     */
    public Bicycle(String model, int year) {
        super(model, year);
    }

    /**
     * Перевизначений метод руху велосипеда.
     * 
     * @return рядок із описом руху велосипедною доріжкою
     */
    @Override
    public String move() {
        return "Рухається велосипедною доріжкою.";
    }
}

