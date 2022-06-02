package BuilderPattern;

import java.util.ArrayList;

public abstract class AbstractBuilderLasagne {
    String name;
    ArrayList<String> ingredients = new ArrayList<>();
    public abstract AbstractBuilderLasagne addSheets();
    public abstract AbstractBuilderLasagne addSauce();
    public abstract AbstractBuilderLasagne addFiller();
    public Lasagne build() {
        Lasagne lasagne = new Lasagne();
        lasagne.setName(this.name);
        lasagne.addIngredients(ingredients);
        return lasagne;
    }
}
