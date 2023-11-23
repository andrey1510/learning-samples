package hashcodeAndEquals.notOverrideInSet;

public class ElementNoOverride {
    int number;
    char letter;

    public ElementNoOverride(int number, char letter) {
        this.number = number;
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "[" + number + " " + letter + "]";
    }

}
