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
 * Базовий абстрактний клас, що описує обчислювальну комп'ютерну техніку
 * для секції індивідуального завдання. Варіант 7. (IndividualAssignment).
 * 
 * @author Анастасія Горбунова
 * @version 5.0 23 Oct 2026
 */
public abstract class ComputerDevice {
    /** Торгова марка (бренд) пристрою */
    protected String brand;
    /** Конкретна модель пристрою */
    protected String model;

    /**
     * Конструктор абстрактного класу для ініціалізації базових полів.
     * 
     * @param brand бренд виробника
     * @param model назва моделі
     */
    public ComputerDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    /**
     * Абстрактний метод для ініціалізації завантаження операційної системи.
     * 
     * @return лаконічний статус завантаження ОС у вигляді рядка
     */
    public abstract String bootUp();

        /**
     * Повертає торгову марку (бренд) обчислювального пристрою.
     * 
     * @return рядок із назвою бренду виробника
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Повертає конкретну модель обчислювального пристрою.
     * 
     * @return рядок із назвою моделі техніки
     */
    public String getModel() {
        return model;
    }
}
