package kg.company.models;

public enum Elements {
        Au("Gold", 2),
        Cu("Медь", 3),
        Ra("Radium", 5),
        Be("Berillium" , 7);

        private String name;
        private int number;

    Elements(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
