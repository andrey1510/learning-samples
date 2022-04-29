package Models;
import java.util.Comparator;

public class RatingComparator implements Comparator<Staff> {

    @Override
    public int compare(Staff staff1, Staff staff2) {

        return (int) (staff2.getRating() - staff1.getRating());
    }
}
