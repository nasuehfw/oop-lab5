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
 * Інтерфейс, що визначає поведінку пристроїв, здатних підключатися до мережі.
 * 
 * @author Анастасія Горбунова
 * @version 5.0 23 Oct 2026
 */
public interface Connectable {
    /**
     * Абстрактний метод для встановлення мережевого з'єднання.
     */
    void connect();

    /**
     * Повертає тип мережевого інтерфейсу пристрою.
     * 
     * @return назва типу підключення (Wi-Fi, Ethernet тощо)
     */
    String getNetworkType();
}
