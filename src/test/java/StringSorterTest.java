import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

class StringSorterTest {

    StringSorter stringsorter = new StringSorter();

    @Test
    void StringSorterTest_True() {
        List<String> unsortedStrings = List.of("apple", "banana", "grape", "avocado", "cherry");
        String exceptionChar = "a";
        List<String> expectation = List.of("banana", "cherry", "grape", "avocado", "apple");

        List<String> result = stringsorter.sortStrings(unsortedStrings, exceptionChar);

        assertThat(result).isEqualTo(expectation);
    }
}