public class CalcMonth {
    public int calculate(int income, int expenses, int threshold) {

        int count = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money < threshold) {

                money = money + income - expenses;           // зарабатываем деньги
            } else {
                money = (money - expenses) / 3;             // проматываем деньги
                count++;                                    // увеличиваем счетчик месяцев года
            }
        }
        return count;
    }
}
