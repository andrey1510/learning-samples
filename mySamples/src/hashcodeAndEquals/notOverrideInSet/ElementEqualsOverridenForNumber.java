package hashcodeAndEquals.notOverrideInSet;

public class ElementEqualsOverridenForNumber {
    int number;
    char letter;


    public ElementEqualsOverridenForNumber(int number) {
        this.number = number;
    }

    public ElementEqualsOverridenForNumber(char letter) {
        this.letter = letter;
    }

    public ElementEqualsOverridenForNumber(int number, char letter) {
        this.number = number;
        this.letter = letter;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElementEqualsOverridenForNumber that = (ElementEqualsOverridenForNumber) o;

        return number == that.number;
    }



    @Override
    public String toString() {
        return "[" + number + " " + letter + "]";
    }

}
