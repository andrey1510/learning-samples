package hashcodeAndEquals.notOverrideInSet;

public class ElementAllOverriden {
    int number;
    char letter;

    public ElementAllOverriden(int number, char letter) {
        this.number = number;
        this.letter = letter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElementAllOverriden that = (ElementAllOverriden) o;

        if (number != that.number) return false;
        return letter == that.letter;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (int) letter;
        return result;
    }

    @Override
    public String toString() {
        return "[" + number + " " + letter + "]";
    }

}
