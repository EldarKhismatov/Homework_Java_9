import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetMinStation(){
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 90;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }
}
