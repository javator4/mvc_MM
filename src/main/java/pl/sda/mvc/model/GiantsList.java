package pl.sda.mvc.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GiantsList {

  private List<GiantModel> list = new ArrayList<>(Arrays.asList(
            new GiantModel(Health.DEAD, Fatigue.SLEEPING, Nourishment.HUNGRY, "toldi"),
            new GiantModel(Health.HEALTHY, Fatigue.NOTTIRED, Nourishment.NOTHUNGRY, "gargamel"),
            new GiantModel(Health.DEAD, Fatigue.TIRED, Nourishment.HUNGRY, "szkieletor")));

    public List<GiantModel> getList() {
        return list;
    }

}
