package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI extends Item {

    public static void main(String[] args) {
        Item item = new Item();
        Item item1 = new Item(1, "Mike");
        LocalDateTime created = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String createdDateTimeFormat = created.format(formatter);
        System.out.println("Текущее дата и время " + createdDateTimeFormat);
        System.out.println(item1);
    }
}
