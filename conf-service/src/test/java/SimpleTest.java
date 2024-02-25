import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class SimpleTest {
    @Test
    public void shouldNotThrowAnyExeption(){
        assertDoesNotThrow(Main::sayHi);
    }
}
