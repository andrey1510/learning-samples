package BuilderPattern;

import java.util.ArrayList;

public class Lasagne {
    String name;
    ArrayList<String> ingredients;

    void addIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    void assemble() {
        System.out.printf("Adding ingredients for %s:", this.name);
        for (int i=0; i < ingredients.size(); i++) {
            if (i < ingredients.size()-1) {
                System.out.print(" " + ingredients.get(i) + ",");
            } else {
                System.out.println(" " + ingredients.get(i) + ".");
            }
        }
    }

    void bake() {
        System.out.println(this.name + " is baking.");
    };

    void serve() {
        System.out.println(this.name + " is ready.");
        System.out.println("");
    };

    public void setName(String name) {
        this.name = name;
    }


}
