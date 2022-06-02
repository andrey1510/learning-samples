package BuilderPattern;

public class ClientLasagne {
    public static void main(String[] args) {

        AbstractBuilderLasagne meatLasagneBuilder = new ConcreteBuilderMeatLasagne();
        Lasagne meatLasagne = meatLasagneBuilder.addSheets().addSauce().addFiller().build();
        meatLasagne.assemble();
        meatLasagne.bake();
        meatLasagne.serve();

        AbstractBuilderLasagne vegetableLasagneBuilder = new ConcreteBuilderVegetableLasagne();
        Lasagne vegetableLasagne = vegetableLasagneBuilder.addSheets().addSauce().addFiller().build();
        vegetableLasagne.assemble();
        vegetableLasagne.bake();
        vegetableLasagne.serve();

    }
}
