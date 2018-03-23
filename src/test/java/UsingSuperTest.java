import com.thoughtworks.basicJavaExercise.Orange;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UsingSuperTest {
    @Test
    public void superTest() {
        Orange orange = new Orange();
        assertThat(orange.getColor(),is("orange"));
    }
}
