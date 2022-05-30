package DecoratorPattern;

class StandardBed implements Bed {

    @Override
    public String getTitle() {
        return "Standard bed";
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
