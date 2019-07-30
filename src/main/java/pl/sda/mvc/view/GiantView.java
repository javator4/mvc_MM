package pl.sda.mvc.view;

import pl.sda.mvc.model.GiantModel;
import java.util.ArrayList;

public class GiantView {

    public void displayGiant(ArrayList<GiantModel> list) {
        for (GiantModel model : list) {
            System.out.println(model.showParams());
        }
    }
}




