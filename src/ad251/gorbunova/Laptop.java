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
 * Дочірній клас Laptop. Поєднує успадкування ComputerDevice (extends)
 * та реалізує інтерфейс Connectable (implements).
 * 
 * @author Анастасія Горбунова
 * @version 5.0 23 Oct 2026
 */
public class Laptop extends ComputerDevice implements Connectable {
    /** Ємність вбудованої акумуляторної батареї у мАг */
    private final int batteryCapacity;

    /**
     * Конструктор класу Laptop. Викликає конструктор суперкласу через super().
     * 
     * @param brand бренд пристрою
     * @param model модель ноутбука
     * @param batteryCapacity ємність батареї
     */
    public Laptop(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * Переозначений метод завантаження ноутбука.
     * 
     * @return скорочений статус швидкого старту
     */
    @Override
    public String bootUp() {
        return "Швидкий запуск (Режим сну)";
    }

    /**
     * Реалізація методу інтерфейсу Connectable для підключення.
     */
    @Override
    public void connect() {
        // Логіка підключення об'єкта (внутрішній стан)
    }

    /**
     * Повертає бездротовий тип мережі ноутбука.
     * 
     * @return рядок "Wi-Fi"
     */
    @Override
    public String getNetworkType() {
        return "Wi-Fi";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
