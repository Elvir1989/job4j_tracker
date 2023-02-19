package ru.job4j.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }

    public static void main(String[] args) {
        JSONReport js = new JSONReport();
        String text = js.generate("name", "body");
        System.out.println(text);
    }
}