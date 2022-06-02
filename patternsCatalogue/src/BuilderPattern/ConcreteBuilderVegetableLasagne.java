package BuilderPattern;

public class ConcreteBuilderVegetableLasagne extends AbstractBuilderLasagne {

    public ConcreteBuilderVegetableLasagne() {
        this.name = "Vegetable Lasagne";
    }

    @Override
    public AbstractBuilderLasagne addSheets() {
        this.ingredients.add("flat sheets");
        return this;
    }

    @Override
    public AbstractBuilderLasagne addSauce() {
        this.ingredients.add("bechamel");
        return this;
    }

    @Override
    public AbstractBuilderLasagne addFiller() {
        this.ingredients.add("vegetable ragu");
        return this;
    }
}
