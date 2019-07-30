package pl.sda.mvc.controller;

import pl.sda.mvc.model.Fatigue;
import pl.sda.mvc.model.GiantModel;
import pl.sda.mvc.model.GiantsList;
import pl.sda.mvc.model.Health;
import pl.sda.mvc.view.GiantView;

import java.util.ArrayList;

public class GiantController {

    private GiantView giantView;
    private GiantModel giantModel;
    private GiantsList giantsList;

/************kontroler modyfikuje poszczegolne obiekty model poprzez 'wywolywanie' ich z listy modeli***********/

    public void setHealth(Health health, int index){
       giantsList.getList().get(index).setHealth(health); }        //lista <GiantMode> w klasie GiantsList jest private więc trzeba wywoływać ją metodą getList
    public void setFatigue(Fatigue fatigue, int index){            //zmiana modyfikatora dostepu na public static pozwolilaby na dostep z kazdej klasy
       giantsList.getList().get(index).setFatigue(fatigue); }
       public void setName(String name, int index){
        giantsList.getList().get(index).setName(name);
       }

    public GiantController(GiantModel giantModel, GiantView giantView, GiantsList giantsList){
        this.giantModel = giantModel;
        this.giantView = giantView;
        this.giantsList = giantsList;
    }
    public void updateView() {                      //metoda wywoluje metoda klasy GiantView jednocześnie przekazujac jej jako parametr listę z modelami
        this.giantView.displayGiant((ArrayList<GiantModel>) giantsList.getList());
    }



}
