package pl.sda.mvc.model;

public enum Nourishment {

    HUNGRY("hungry"),
    NOTHUNGRY("nothungry");

    private String title;

    Nourishment(String title){
        this.title = title;
    }
}
