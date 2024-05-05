import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcMonthTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/CalcMonth.csv")
    /*
    @CsvSource({
            "10000,3000,20000,3",
            "100000,60000,150000,2"
    })
    */
    void shouldCalculateMonth(int income, int expenses, int threshold, int expected) {
        CalcMonth service = new CalcMonth();

        // вызываем метод
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

/*
    @Test
    void shouldCalculateMonthOne() {
        CalcMonth service = new CalcMonth();

        // подготавливаем данные
        int income = 10_000;        // заработок
        int expenses = 3_000;      // обязательные работы
        int threshold = 20_000;    // порог безделья
        int expected = 3;          // ожидаемое количество месяцев отдыха

        // вызываем метод
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateMonthTwo() {
        CalcMonth service = new CalcMonth();

        // подготавливаем данные
        int income = 100_000;        // заработок
        int expenses = 60_000;      // обязательные работы
        int threshold = 150_000;    // порог безделья
        int expected = 2;          // ожидаемое количество месяцев отдыха

        // вызываем метод
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

 */
}
