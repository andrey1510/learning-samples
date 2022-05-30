package DecoratorPattern;

public class Sofa extends BedDecorator {
    public Sofa(Bed customBed) {
        super(customBed);
    }

    @Override
    public String getTitle() {
        return super.getTitle() + " with armrests and backrest";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 50;
    }
}
