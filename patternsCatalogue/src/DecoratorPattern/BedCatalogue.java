package DecoratorPattern;

public class BedCatalogue {
    public static void main(String[] args) {

        Bed bed1 = new StandardBed();
        System.out.println(bed1.getTitle() + " costs " + bed1.getPrice());

        Bed bed2 = new Sofa(new StandardBed());
        System.out.println(bed2.getTitle() + " costs " + bed2.getPrice());

    }

}
