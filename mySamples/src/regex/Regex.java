package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Regex {


    public static void main(String[] args) {



        //////////// Creating list of regex matches 1 //////////////

        String input = "input";
        List<String> allMatches1 = new ArrayList<String>();
        Matcher m = Pattern.compile("regex")
                .matcher(input);
        while (m.find()) {
            allMatches1.add(m.group());
        }

        //////////// Creating list of regex matches 2 //////////////

        List<String> allMatches2 = Pattern.compile("regex")
                .matcher("input")
                .results()
                .map(MatchResult::group)
                .collect(Collectors.toList());
    }

}
