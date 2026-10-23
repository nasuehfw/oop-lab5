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
 * Дочірній клас Desktop. Поєднує успадкування ComputerDevice (extends)
 * та реалізує інтерфейс Connectable (implements).
 * 
 * @author Анастасія Горбунова
 * @version 5.0 23 Oct 2026
 */
public class Desktop extends ComputerDevice implements Connectable {
    /** Потужність блоку живлення в Ватах */
    private final int powerSupply;

    /**
     * Конструктор класу Desktop. Передає параметри базовому класу.
     * 
     * @param brand бренд пристрою
     * @param model модель системного блоку
     * @param powerSupply потужність БП
     */
    public Desktop(String brand, String model, int powerSupply) {
        super(brand, model);
        this.powerSupply = powerSupply;
    }

    /**
     * Перевизначений метод завантаження стаціонарного ПК.
     * 
     * @return скорочений статус повного старту
     */
    @Override
    public String bootUp() {
        return "Повне завантаження (Перевірка живлення)";
    }

    /**
     * Реалізація методу інтерфейсу Connectable для кабельного підключення.
     */
    @Override
    public void connect() {
        // Логіка дротового підключення об'єкта
    }

    /**
     * Повертає дротовий тип мережі десктопа.
     * 
     * @return рядок "Ethernet"
     */
    @Override
    public String getNetworkType() {
        return "Ethernet";
    }

    public int getPowerSupply() {
        return powerSupply;
    }
}