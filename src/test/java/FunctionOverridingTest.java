import com.thoughtworks.basicJavaExercise.Apple;
import com.thoughtworks.basicJavaExercise.Fruit;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FunctionOverridingTest {
    @Test
    public void isAppleTasty() {
        Apple apple = new Apple();
        assertThat(apple.isTasty(),is(true));
    }
}
