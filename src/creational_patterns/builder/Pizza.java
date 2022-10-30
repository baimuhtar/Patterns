package creational_patterns.builder;

public class Pizza {
    private String dough = "";
    private String sauce = "";
    private String mashroom = "";

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setMashroom(String mashroom) {
        this.mashroom = mashroom;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", mashroom='" + mashroom + '\'' +
                '}';
    }
}

