import com.thoughtworks.basicJavaExercise.BasicPrograms;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class BasicProgramsTest {

    private BasicPrograms basic;

    @Before
    public void setUp() throws Exception {
        basic = new BasicPrograms();
    }

    @Test
    public void checkIsEvenForEvenNumbers() {
        assertTrue(basic.isEven(10));
        assertTrue(basic.isEven(-8));
        assertTrue(basic.isEven(-6));
        assertTrue(basic.isEven(4));
    }

    @Test
    public void checkIsEvenForOddNumbers() {
        assertFalse(basic.isEven(1));
        assertFalse(basic.isEven(3));
        assertFalse(basic.isEven(-5));
        assertFalse(basic.isEven(-7));
    }
}
