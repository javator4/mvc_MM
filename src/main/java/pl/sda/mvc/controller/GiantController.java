package pl.sda.mvc.controller;

import pl.sda.mvc.model.Fatigue;
import pl.sda.mvc.model.GiantModel;
import pl.sda.mvc.model.Health;
import pl.sda.mvc.view.GiantView;

public class GiantController {

    private GiantModel giantModel;
    private GiantView giantView;

    public void setHealth(Health health){
        giantModel.setHealth(health);
    }
    public void setFatigue(Fatigue fatigue){
        giantModel.setFatigue(fatigue);
    }


    public GiantController(GiantModel giantModel , GiantView giantView){
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public void updateView(){
        this.giantView.displayGiant(this.giantModel);
    }



}
