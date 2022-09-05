package kg.company.models;

public enum District {
        Ik("Issyk-Kul", 9),
        Ta("Talas",5),
        Ba("Batken", 3);

    private String name;
    private int regionNum;

    District(String name, int regionNum) {
        this.name = name;
        this.regionNum = regionNum;
    }

    public String getName() {
        return name;
    }
}
