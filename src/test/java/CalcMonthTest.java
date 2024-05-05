import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcMonthTest {

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
}
