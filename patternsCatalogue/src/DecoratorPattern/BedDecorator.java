package DecoratorPattern;

public class BedDecorator implements Bed {
    private Bed customBed;

    public BedDecorator(Bed customBed) {
        this.customBed = customBed;
    }

    @Override
    public String getTitle() {
        return customBed.getTitle();
    }

    @Override
    public int getPrice() {
        return customBed.getPrice();
    }
}
