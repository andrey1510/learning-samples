package hashcodeAndEquals.notOverrideInSet;

public class ElementHashOverridenForNumber {
    int number;
    char letter;


    public ElementHashOverridenForNumber(int number) {
        this.number = number;
    }

    public ElementHashOverridenForNumber(char letter) {
        this.letter = letter;
    }

    public ElementHashOverridenForNumber(int number, char letter) {
        this.number = number;
        this.letter = letter;
    }


    @Override
    public int hashCode() {
        return number;
    }


    @Override
    public String toString() {
        return "[" + number + " " + letter + "]";
    }
}
