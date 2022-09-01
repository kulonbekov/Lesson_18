package kg.company;

import kg.company.models.Elements;

public class Main {
    public static void main(String[] args) {
        for (Elements s: Elements.values())
            System.out.println("Названия: " + s.getName() + ", атомный номер:" + s.getNumber());
    }
}