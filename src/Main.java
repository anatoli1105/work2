// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*Задача 1
Объявите переменные типа int, byte, short, long, float, double.

Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.

Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».*/
        int valueInt=123;
        byte valueByte=5;
        short valueShort=1;
        long valueLong=-666L;
        float valueFloat=3.1F;
        double valueDouble=3.14;
        System.out.println("Значение переменной valueInt, с типом int, = "+valueInt+
                "\nЗначение переменной valueByte, с типом byte, = "+valueByte+
                "\nЗначение переменной valueSort, с типом short, = "+valueShort+
                "\nЗначение переменной valueLong, с типом long, = "+valueLong+
                "\nЗначение переменной valueFloat, с типом float = "+valueFloat+
                "\nЗначение переменной valueDooble, с типом dooble, = "+valueDouble);
        System.out.println("==================================================");
        /*Задача 2
Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
Значения:
27.12
987 678 965 549
2,786
569
-159
27897
67  */
        float valueFloat2=27.12F;
        long  valueLong2=987678965549L;
        double valueDouble2=2.786;
        short valueShort2=569;
        int valueInt2=-159;
        long valuesLong2=27897L;
        byte valueByte2=67;
        /*в консоль ,вроде, не надо выводить.*/
        System.out.println("=====================================================");
        /*Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько
        достанется листов каждому ученику.
        Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».*/

        int studentsClassA=23;
        int studentsClassB=27;
        int studentsClassG=30;
        int countSheetsPaper=480;
        int countStudents=studentsClassA+studentsClassB+studentsClassG;
        int countSheetsForStudent=countSheetsPaper/countStudents;
        System.out.println("На каждого ученика рассчитано "+countSheetsForStudent+" листов бумаги");
        System.out.println("=====================================================");
        /*Задача 4
Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
Какая производительность машины будет:

за 20 минут,
в сутки,
за 3 дня,
за 1 месяц?
Рассчитывайте производительность работы машины в том случае,
если она работает без перерыва заданный промежуток времени.

Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».*/
        byte countBottles=16;
        int bottleMinetes=countBottles/2;
        int bottleDay=bottleMinetes*1440;
        long bottleMonth=bottleMinetes*43200L;
        System.out.println("за "+ 20 +" мин. машины для изготовления бутылок производит - "+bottleMinetes*20+" шт"+
                "\nЗа сутки машина для изготовления бутылок производит "+bottleDay+"шт." +
                "\nза три дня машина по изготовлению бутылок производит"+bottleDay*3+"шт."+
                "\nза месяц(30 дней)машина по изготовлению бутылок производит"+bottleMonth+"шт.");
        System.out.println("=====================================================");


        /*На ремонт школы нужно 120 банок краски двух цветов:
         белой и коричневой. На один класс уходит 2 банки белой и
         4 банки коричневой краски. Сколько банок каждой краски было куплено?
        Выведите результат задачи в консоль в формате: «В школе, где … классов,
        нужно … банок белой краски и … банок коричневой краски».
        * */
        int countPot=120;
        int whitePotForClass=2;
        int brownPotForClass=4;
        int countPotForClass=whitePotForClass+brownPotForClass;
        int countClass=countPot/countPotForClass;
        int countPotWhite=countClass*whitePotForClass;
        int countPotBrown=countClass*brownPotForClass;
        System.out.println("В школе, где "+countClass+" классов,нужно "+
                countPotWhite+" банок белой краски и "+countPotBrown+" банок коричневой краски");
        System.out.println("=====================================================");
        /*Задача 6
Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.

Вот один из рецептов, по которому спортсмен готовит себе завтрак:

Бананы — 5 штук (1 банан — 80 грамм).
Молоко — 200 мл (100 мл = 105 грамм).
Мороженое-пломбир — 2 брикета по 100 грамм.
Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
Смешать всё в блендере — и готово.

Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.

Результат в граммах и килограммах напечатайте в консоль.*/
        int  bananaWightGram=80;
        int milkWightGram=105;
        int plombirWightGram=100;
        int eggsWightGram=70;
        int breakfastWightGram=(bananaWightGram*5)+(milkWightGram*2)+(plombirWightGram*2)+(eggsWightGram*4);
        float breakfastWightKilo=breakfastWightGram/1000F;
        System.out.println("вес завтрака составляет ->"+breakfastWightGram+"грамм,это "
                +breakfastWightKilo+" килограмм");
        System.out.println("=====================================================");
        /*Задача 7
Правила соревнований обновились, и спортсмену, чтобы оставаться в
своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так,
 чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
а сколько — если каждый день будет худеть на 500 грамм.
Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.*/
        int excessWightKilo=7;
        int wightInDayGram=250;
        float wightInDayKilo=wightInDayGram/1000F;
        float countDay=excessWightKilo/wightInDayKilo;
        int countDay1=(int)countDay;
        int wightInDayGr=500;
        float wightInDayKg=wightInDayGr/1000F;
        float countDays=excessWightKilo/wightInDayKg;
        int countDays1=(int)countDays;
        System.out.println(countDay1+" дней уйдет на похудение," +
                " если спортсмен будет терять каждый день по "+wightInDayGram+" грамм," +
                "\na если будет терять по "+wightInDayGr+"грам в день," +
                "то на похудание уйдет "+countDays1+" дней");
        System.out.println("=====================================================");
        /*Задача 8
Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
 Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
 Каждый год повышение составляет 10% от текущей зарплаты.

К вам пришел руководитель с задачей автоматизировать повышение зарплаты,
а также провести расчет для следующих сотрудников:

Маша получает 67 760 рублей в месяц.
Денис получает 83 690 рублей в месяц.
Кристина получает 76 230 рублей в месяц.
Каждому нужно увеличить зарплату на 10% от текущей месячной.
Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.

Посчитайте, сколько будет получать каждый из сотрудников,
 а также разницу между годовым доходом до и после повышения.*/
        int salaryWorkerM=67760;
        int salaryWorkerD=83690;
        int salaryWorkerK=76230;
        int newSalaryWorkerM=salaryWorkerM/10*11;
        int newSalaryWorkerD=salaryWorkerD/10*11;
        int newSalaryWorkerK=salaryWorkerK/10*11;
        int differenceSalaryM=newSalaryWorkerM-salaryWorkerM;
        int differenceSalaryD=newSalaryWorkerD-salaryWorkerD;
        int differenceSalaryK=newSalaryWorkerK-salaryWorkerK;
        System.out.println("Маша получает "+ salaryWorkerM+" рублей в месяц.\n"+
                "после повышения будет ->"+newSalaryWorkerM+",разница составит->"+differenceSalaryM+
                "\n Денис получает " +salaryWorkerD+" рублей в месяц.\n"+
                "после повышения будет ->"+newSalaryWorkerD+",разница составит->"+differenceSalaryD+
                "\nКристина получает"+salaryWorkerK+" рублей в месяц.\ns"+
                "после повышения будет ->"+newSalaryWorkerK+",разница составит->"+differenceSalaryK);


    }
}