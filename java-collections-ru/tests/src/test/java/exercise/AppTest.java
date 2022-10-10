package exercise;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() throws Exception {
        // BEGIN
        List<Integer> wrong1Elements = new ArrayList<>();
        assertThat(App.take(wrong1Elements, 5)).hasSize(0);

        List<Integer> numbers2 = Arrays.asList(2, 4, 5, 6, 2);
        List<Integer> takeNumbers2 = App.take(numbers2, 3);
        ;
        assertThat(takeNumbers2).hasSize(3);

        List<Integer> wrong2Elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        assertThat(App.take(wrong2Elements, 100)).hasSize(wrong2Elements.size());

        // END
    }
}
