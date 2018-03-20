import com.thoughtworks.basicJavaExercise.FunctionOverloading;
import org.junit.Test;

import static com.thoughtworks.basicJavaExercise.FunctionOverloading.sum;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FunctionOverloadingTest {
    @Test
    public void sumOfTwoStrings() {
        assertThat(sum("alok","ranjan"),is("alokranjan"));
    }

    @Test
    public void sumOfTwoIntegers() {
        assertThat(sum(9,20),is(29));
    }

    @Test
    public void sumOfThreeInteger() {
        assertThat(sum(9,20,1),is(30));
    }

    @Test
    public void sumOfTwoDoubles() {
        assertThat(sum(9.2,2.8),is(12.0));
    }


    @Test
    public void sumOfTwoCharacters() {
        assertThat(sum('a','b'),is("ab"));
    }

}
