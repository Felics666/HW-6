import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in); ///Создаем обьект, даем понять от куда запрашивать данные.
        /// Задача 1
        System.out.println("Задача 1");

        double deposit = 15000.00; //сумма которую ложат на счет ежемесячно
        double total = 0; // переменная где будет храниться нсумма накоплений
        double rate = 0.12; ///Годовая процентная ставка
        int month = 0; // переменная для вывода количества месяцев

        while (total < 2_459_900) {
            month++;
            total += deposit;
            total += deposit * (rate / 12);
            System.out.println("Месяц - " + month + " сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Для накопления 2.459.000, потребуется " + month + " месяцев.");

        ////Задача 2
        System.out.println();
        System.out.println("Задача 2");

        int a = 1;

        //// вывод чисел от 1 до 10
        System.out.print("Отработал цикл while: ");
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        ///Вывод чисел от 10 до 1
        System.out.println();
        System.out.print("Отработал цикл for: ");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        ///// Задача 3
        System.out.println();
        System.out.println("Задача 3");

        int populationOfTheCountry = 12_000_000; /// Общая численность населения
        int birthRate = 17; /// раждаемость на 1000
        int mortalityRate = 8; /// смертность на 1000

        for (int year = 1; year <= 10; year++) {
            int levelOfFertility = birthRate * populationOfTheCountry / 1000;  //// узнали сколько родилось за год
            int levelOfMortality = mortalityRate * populationOfTheCountry / 1000; //// узнали сколько погибло за год
            int growth = levelOfFertility - levelOfMortality;  //// Выяснили какой прирост населения за год
            populationOfTheCountry += growth; ////выводим на сколько растет численость в год
            System.out.println("Год " + year + ", численность населения сотавляет " + populationOfTheCountry);
        }

        /// Задача 4
        System.out.println();
        System.out.println("Задача 4");

        //double deposit2 = 15000.00; ///певоначальный вклад
        double total2 = deposit; /// переменная которая хранит сумму вклада
        double amountOfSavings = 12000000.0; ///желаемая сумма накоплений
        int month2 = 0;

        while (total2 < amountOfSavings) {
            total2 *= 1.07;///Вычисляем сумму ежемесячного накопления с учетом процентной ставки
            month2++; /// считаем кол-во месяцев
            System.out.format("Месяц %d: сумма накоплений составляет %.2f рублей %n", month2, total2);

            ///String msg = String.format("Месяц %d: сумма накоплений составляет %.2f рублей ", month2, total2); ///Делаем красивый вывод c спользованием строки
            ///System.out.println(msg);
        }
        System.out.format("Для накопления суммы в %.2f руб., при первоначальном взносе %.2f руб. - потребуется %d месяцев. %n", amountOfSavings, deposit, month2);

        ////Задача 5
        System.out.println();
        System.out.println("Задача 5");

        double total3 = deposit;
        double amountOfSavings2 = 12000000.0;
        int month3 = 0;

        while (total3 < amountOfSavings2) {
            total3 *= 1.07; //// + 7% ежемесячно от суммы на счету
            month3++;
            if (month3 % 6 == 0) { /// необходим каждый 6 месяц, следовательно все что делится на 6 без остатка
                System.out.format("Месяц %d: сумма накоплений равна - %.2f рублей. %n", month3, total3);
            }
        }
        System.out.format("Для достижения цели в %.2f руб., при первоначальном взносе %.2f руб. - потребуется %d месяцев %n.", amountOfSavings2, deposit, month3);

//        //////также можно решить через цикл for
//       for (int month3 = 1; total3 < amountOfSavings2; month3++) {
//           total3 *= 1.07; ///Вычисляем сумму ежемесячного накопления с учетом процентной ставки
//           if(month3 % 6 == 0){
//                System.out.format("Месяц %d: сумма накоплений равна - %.2f рублей. %n", month3, total3);
//            }
//        }

        ////Задача 6
        System.out.println();
        System.out.println("Задача 6");

        double total4 = deposit;

        for (int month4 = 1; month4 <= (9 * 12); month4++) { ///(9 * 12) - переводим года в месяцы
            total4 *= 1.07;  //// + 7% ежемесячно от суммы на счету
            if (month4 % 6 == 0) {// необходим каждый 6 месяц , следовательно все что делится на 6 без остатка
                System.out.format("Месяц %d: сумма накоплений равна - %.2f рублей. %n", month4, total4);
            }
        }
        System.out.format("Итоговая сумма накоплений по иистечению 9 лет составит - %.2f рублей. %n", total4);

        ////Задача 7
        System.out.println();
        System.out.println("Задача 7");

        System.out.println("Введите число первой пятницы: ");
        int firstFriday = read.nextInt(); ////первая пятница в месяце, значение от 1 до 7
        int day = 0;

        if (firstFriday > 7) {
            System.out.println("Error - число не может быть больше 7");
            return;
        }
        System.out.println("Введите колличесво дней в месяце: ");
        int daysPerMonth = read.nextInt(); ////кол-во дней в месяце 30, 31, 28, 29

        if (daysPerMonth <= 27 || daysPerMonth > 31) {
            System.out.println("Error - колличество дней в месяце не может быть больше 31 или меньше 28");
            return;
        }

        for (day = firstFriday; day <= daysPerMonth; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо пдготовить отчет.");
        }

        ////Задача 8
        System.out.println();
        System.out.println("Задача 8");

        System.out.println("Введите год ");
        int year = read.nextInt();

        int lastYear = year - 200; /////точка входа 200 лет назад
        int nextYear = year + 100; //// точка выхода 100 лет вперед
        int year2 = 0;

        for (year2 = lastYear; year2 <= nextYear; year2++) { //// берем диапазон от -200 от текущего года до + 100, так как знаем что комета летит каждые 79 лет, берем остаток от деления на 79 = 0, выводим результат.
            if (year2 % 79 == 0) {
                System.out.format("Год %d: пролетит комета. %n", year2);
            }
        }

    }
}