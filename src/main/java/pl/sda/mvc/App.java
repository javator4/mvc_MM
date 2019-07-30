package pl.sda.mvc;

import pl.sda.mvc.controller.GiantController;
import pl.sda.mvc.model.*;
import pl.sda.mvc.view.GiantView;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        GiantController giantController = new GiantController(new GiantModel(), new GiantView(), new GiantsList());

        giantController.setHealth(Health.HEALTHY, 2);
        giantController.setFatigue(Fatigue.TIRED, 2);
        giantController.setFatigue(Fatigue.TIRED, 0);
        giantController.setName("ksieciunio", 1);
        giantController.updateView();
    }
}
