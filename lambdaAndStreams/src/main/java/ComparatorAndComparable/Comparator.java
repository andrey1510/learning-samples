package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Comparator {

    static List<String> colors = new ArrayList<>(Arrays.asList("45", "11", "2"));

    private static String sortColors1() {
        // todo
        colors.sort((o1, o2) -> {
            int comp = summarize(o1) - summarize(o2);
            if (comp == 0) {
                return o1.compareTo(o2);
            } else {
                if (comp < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }

        });

        return String.join(" ", colors);
    }

    private static int summarize(String list) {
        String[] word = list.split("");
        int j = 0;
        for (String s : word) {
            j += Integer.parseInt(s);
        }
        return j;
    }


}
