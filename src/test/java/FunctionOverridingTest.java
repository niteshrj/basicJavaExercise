import com.thoughtworks.basicJavaExercise.FunctionOverriding.Apple;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FunctionOverridingTest {
    @Test
    public void isAppleTasty() {
        Apple apple = new Apple("red");
        assertThat(apple.isTasty(),is(true));
    }
}
