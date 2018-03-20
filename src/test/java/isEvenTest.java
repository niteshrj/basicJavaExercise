import com.thoughtworks.basicJavaExercise.BasicPrograms;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class isEvenTest {
    @Test
    public void checkIsEvenForEvenNumbers() {
        BasicPrograms basic = new BasicPrograms();
        assertTrue(basic.isEven(10));
        assertTrue(basic.isEven(-8));
        assertTrue(basic.isEven(-6));
        assertTrue(basic.isEven(4));
    }

    @Test
    public void checkIsEvenForOddNumbers() {
        BasicPrograms basic = new BasicPrograms();
        assertFalse(basic.isEven(1));
        assertFalse(basic.isEven(3));
        assertFalse(basic.isEven(-5));
        assertFalse(basic.isEven(-7));
    }
}
