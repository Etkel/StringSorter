import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorter {
    /**
     * The StringSorter class defines the contract for sorting strings based on
     * alphabetical order while skipping words that start with a specific prefix.
     *
     * Example:
     *  Input: ["apple", "banana", "grape", "avocado", "cherry"], Exception prefix: "a"
     *  Output: ["banana", "cherry", "grape", "avocado", "apple"]
     *
     *  Here, "banana", "cherry", and "grape" are sorted in alphabetical order
     *  whereas "avocado" and "apple" (that start with 'a') are sorted in reverse alphabetical order
     *  at the end of the list.
     */
    public List<String> sortStrings(List<String> unsortedStrings, String exceptionChar) {
        List<String> startsWithException = new ArrayList<>();
        List<String> otherStrings = new ArrayList<>();
        for (String str : unsortedStrings) {
            if (str.startsWith(exceptionChar)) {
                startsWithException.add(str);
            } else {
                otherStrings.add(str);
            }
        }
        startsWithException.sort(Collections.reverseOrder());
        Collections.sort(otherStrings);
        otherStrings.addAll(startsWithException);
        return otherStrings;
    }
}
