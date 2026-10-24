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
 * Базовий абстрактний клас для секції загальної практики (GeneralPracticalSection).
 * Надає базову структуру для всіх транспортних засобів.
 * 
 * @author Анастасія Горбунова
 * @version 5.0 23 Oct 2026
 */
public abstract class Vehicle {
    /** Модель транспортного засобу */
    protected String model;
    /** Рік випуску */
    protected int year;

    /**
     * Конструктор для ініціалізації загальних характеристик транспортного засобу.
     * 
     * @param model марка або модель
     * @param year рік виробництва
     */
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    /**
     * Абстрактний метод руху, що повертає текстовий статус поточного стану.
     * 
     * @return лаконічний опис дії транспортного засобу
     */
    public abstract String move();

    /**
     * Повертає назву моделі або марки транспортного засобу.
     * 
     * @return рядок із назвою моделі
     */
    public String getModel() {
        return model;
    }

    /**
     * Повертає рік випуску транспортного засобу.
     * 
     * @return чотиризначний рік випуску
     */
    public int getYear() {
        return year;
    }
}
