package BuilderPattern;

public class ConcreteBuilderMeatLasagne extends AbstractBuilderLasagne {

    public ConcreteBuilderMeatLasagne() {
        this.name = "Meat Lasagne";
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
        this.ingredients.add("meat ragu");
        return this;
    }
}
