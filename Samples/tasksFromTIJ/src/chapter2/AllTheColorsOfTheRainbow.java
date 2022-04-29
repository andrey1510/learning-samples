package chapter2;

// TiJ Ch.2, Task 11

public class AllTheColorsOfTheRainbow {

    static int anIntegerRepresentingColors = 1;
    public AllTheColorsOfTheRainbow() {
    }

    void changeTheHueOfTheCol(int newHue) {
        anIntegerRepresentingColors = anIntegerRepresentingColors + newHue;
    }

    public static void main(String[] args) {

        AllTheColorsOfTheRainbow red = new AllTheColorsOfTheRainbow();

        System.out.println("Red color integer is now " + anIntegerRepresentingColors);
        red.changeTheHueOfTheCol(1);
        System.out.println("Red color integer is now " + anIntegerRepresentingColors);
    }


}
