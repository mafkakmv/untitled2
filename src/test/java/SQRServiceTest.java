import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource (files = "src/test/java/resources/one.csv")
    public void shouldCalcOne(int expected, int a, int b) {
        SQRService service = new SQRService();

        //int expected = 5;
        int actuel = service.calcSQR(a, b);

        Assertions.assertEquals(expected, actuel);
    }

    @ParameterizedTest
    @CsvFileSource (files = "src/test/java/resources/one.csv")
    public void shouldCalcTwo(int expected, int a, int b) {
        SQRService service = new SQRService();

        //int expected = 3;
        int actuel = service.calcSQR(a, b);

        Assertions.assertEquals(expected, actuel);
    }
}
