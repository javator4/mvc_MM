package pl.sda.mvc.model;

public class GiantModel {

    private Health health;
    private Fatigue fatigue;
    private Nourishment nourishment;
    private String name;

    public GiantModel(){
    }

    public GiantModel(Health health, Fatigue fatigue, Nourishment nourishment, String name) {
        this.health = health;
        this.fatigue = fatigue;
        this.nourishment = nourishment;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public Nourishment getNourishment() {
        return nourishment;
    }

    public void setNourishment(Nourishment nourishment) {
        this.nourishment = nourishment;
    }

    public String showParams() {
        return String.format("%-10s %-10s %-10s %-10s" , health, fatigue, nourishment, name);
    }
}
