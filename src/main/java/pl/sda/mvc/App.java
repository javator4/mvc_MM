package pl.sda.mvc;

import pl.sda.mvc.controller.GiantController;
import pl.sda.mvc.model.Fatigue;
import pl.sda.mvc.model.GiantModel;
import pl.sda.mvc.model.Health;
import pl.sda.mvc.model.Nourishment;
import pl.sda.mvc.view.GiantView;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.TIRED, Nourishment.HUNGRY);

        GiantView giantView = new GiantView();

        GiantController giantController = new GiantController(giantModel,giantView);

        giantController.setHealth(Health.DEAD);
        giantController.updateView();
        giantController.setFatigue(Fatigue.NOTTIRED);
        giantController.updateView();


    }
}
