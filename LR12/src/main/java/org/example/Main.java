package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Tool> toolMap = new HashMap<>();

        toolMap.put("Дрель ударная Bosch", new Drill("Дрель ударная Bosch", 101, "Сверление бетона", 12));
        toolMap.put("Дрель Makita HP1630", new Drill("Дрель Makita HP1630", 102, "Сверление дерева и металла", 8));
        toolMap.put("Дрель-шуруповерт DeWalt", new Drill("Дрель-шуруповерт DeWalt", 103, "Сборка мебели", 6));

        toolMap.put("Пила дисковая Makita", new Saw("Пила дисковая Makita", 201, "Продольный распил", "Победитовый диск"));
        toolMap.put("Лобзик электрический Bosch", new Saw("Лобзик электрический Bosch", 202, "Фигурный рез", "Пилка T101B"));
        toolMap.put("Ножовка по дереву Stanley", new Saw("Ножовка по дереву Stanley", 203, "Ручной распил", "Закалённое полотно"));

        toolMap.put("Шлифмашина ленточная Интерскол", new Sander("Шлифмашина ленточная Интерскол", 301, "Грубое шлифование", 80));
        toolMap.put("Шлифмашина эксцентриковая Metabo", new Sander("Шлифмашина эксцентриковая Metabo", 302, "Финишная полировка", 240));

        for (Map.Entry<String, Tool> entry : toolMap.entrySet()) {
            System.out.println("Ключ (название): " + entry.getKey());
            System.out.println("Значение: " + entry.getValue());
        }
    }
}