import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.sql.PseudoColumnUsage;

public class Main {
    public static void main(String[] args) {
        // Переменные
        // Задача 1
var dog = 8.0;
System.out.println(dog);
var cat = 3.6;
System.out.println(cat);
var paper = 763789;
System.out.println(paper);

// Задача 2
dog = dog + 4;
cat = cat + 4;
paper = paper + 4;

System.out.println(dog);
System.out.println(cat);
System.out.println(paper);

// Задча 3
dog = dog - 3.5;
cat = cat - 1.6;
paper = paper - 7639;
System.out.println(dog);
System.out.println(cat);
System.out.println(paper);

// Задча 4
var friend = 19;
System.out.println(friend);
friend = friend + 2;
System.out.println(friend);
friend = friend / 7;
System.out.println(friend);

// Задача 5
var forg = 3.5;
System.out.println(forg);
forg = forg * 10;
System.out.println(forg);
forg = forg / 2;
System.out.println(forg);
forg = forg + 4;
System.out.println(forg);

// Задча 6
var boxer1 = 78.2;
var boxer2 = 82.7;

var totalWeight = boxer1 + boxer2;
var weightDifference = Math.abs(boxer1 - boxer2);

System.out.println("Общая масса двух боксеров " + totalWeight + " кг.");
System.out.println("Разница веса двух боксеров состовляет " + weightDifference + " кг.");

// Задача 7
var difference = boxer2 % boxer1;
        System.out.println(difference);

// Здача 8
        var totalWorkHours = 640;
        var workHoursPerOne = 8;
        var totalEmployee = totalWorkHours / workHoursPerOne;
        System.out.println("Всего работников в компании " + totalEmployee + ".");

        totalEmployee = totalEmployee + 94;
        workHoursPerOne = totalWorkHours / totalEmployee;
        System.out.println("Если в компнаии работает " + totalEmployee + " человек, то всего " + workHoursPerOne + " часов работы может быть поделено между сотрудниками.");

        // Перменные 2
// Задача 1
        byte hand = 2;
        short money = 200;
        int ticket = 42000;
        long people = 9000000000000000000L;

        System.out.println("Значение пременной hand с типом byte равно " + hand);
        System.out.println("Значение пременной money с типом short равно " + money);
        System.out.println("Значение пременной ticket с типом переменной int равно " +ticket);
        System.out.println("Значение пременной people с типом перменной long равно " +people);

// Задача 2
        float p = 27.12f;
        long l = 987678965549L;
        double m = 2.786;
        short k = 569;
        int o = -159;
        int i = 27897;
        byte j = 67;

// Задача 3
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int totalPaper = 480;
        int totalStudents = firstClass + secondClass + thirdClass;
        int paperPerOne = totalPaper / totalStudents;

        System.out.println("На каждого ученика рассчитано " + paperPerOne + " листов бумаги.");

// Задача 4
        byte bottlePer2minutes = 16;
        int bottlePerMinutes = bottlePer2minutes / 2;
        int bottlerPerDay = bottlePerMinutes * 1440;
        int bottlePer20Min = bottlePerMinutes * 20;
        int bottlerPer3Day = bottlerPerDay * 3;
        int bottlePerMouth = bottlerPer3Day * 10;

        System.out.println("За 20 минут машина произвела " + bottlePer20Min + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlerPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlerPer3Day + " штук бутылок.");
        System.out.println("За месяц машина произвела " + bottlePerMouth + " штук бутылок.");

// Задача 5
        byte totalCantPaint = 120;
        byte whitePaintOneClass = 2;
        byte brownPaintOneClass = 4;
        int paintOneClass = whitePaintOneClass + brownPaintOneClass;
        int totalClass = totalCantPaint / paintOneClass;
        int totalWhitePaint = totalClass * whitePaintOneClass;
        int totalBrownPaint = totalClass * brownPaintOneClass;

        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

// Задача 6
        byte bananaWeight = 80;
        short milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;

        int totalRecipeWeight = bananaWeight * 5 + milkWeight * 2 + iceCreamWeight * 2 + eggWeight * 4;
        float totalRecipeWeightKg = totalRecipeWeight / 1000F;

        System.out.println("Вес завтрака в граммах равне " + totalRecipeWeight + " грамм.");
        System.out.println("Вес завтрака в килограммах равен " + totalRecipeWeightKg + " килограмм");

// Задача 7
        byte unnecessaryWeight = 7;
        short weightLossOne = 250;
        short weightLossTwo = 500;
        int firstOption = unnecessaryWeight * 1000 / weightLossOne;
        int secondOption = unnecessaryWeight * 1000 / weightLossTwo;
        float averageOption = (firstOption + secondOption) / 2F;

        System.out.println("При потери 250г уйдет " + firstOption + " дней на похудение.");
        System.out.println("При потери 500г уйдет " + secondOption + " дней на похудение.");
        System.out.println("В среднем будет уходить " + averageOption + " дней на похудениеи.");

// Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristine = 76230;

        int yearSalaryMasha = salaryMasha * 12;
        int yearSalaryDenis = salaryDenis * 12;
        int yearSalaryChristine = salaryChristine * 12;

        float newSalaryMasha = salaryMasha * 1.10F;
        float newSalaryDenis = salaryDenis * 1.10F;
        float newSalaryChristine = salaryChristine * 1.10F;

        float newYearSalaryMasha = newSalaryMasha * 12;
        float newYearSalaryDenis = newSalaryDenis * 12;
        float newYearSalaryChristine = newSalaryChristine * 12;

        float differenceSalaryMasha = newYearSalaryMasha - yearSalaryMasha;
        float differenceSalaryDenis = newYearSalaryDenis - yearSalaryDenis;
        float differenceSalaryChristine = newYearSalaryChristine - yearSalaryChristine;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получчает " + newSalaryChristine + " рублей. Годовой доход вырос на " + differenceSalaryChristine + " рублей.");

        // Условный оператор
// Задача 1
        int age = 14;
        if (age > 18) {
            System.out.println("Совершеннолетен.");
        }
        else {
            System.out.println("Совершеннолетие не наступило, нужно подождать.");
        }

// Задача 2
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, шапка не нужна.");
        }

// Задача 3
        int speed = 40;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }

// Задача 4
        int ageViktor = 17;
        if (ageViktor >= 2 && ageViktor < 6) {
            System.out.println("Если возрат человека равен " + ageViktor + ", то ему нудно ходить в детский сад.");
        }
        else if (ageViktor >= 7 && ageViktor <= 17) {
            System.out.println("Если возраст человека равен " + ageViktor + ", то ему нужно ходить в школу.");
        }
        else if (ageViktor >= 18 && ageViktor < 24) {
            System.out.println("Есди возраст человека равен " + ageViktor + ", то ему нужно ходить в ВУЗ");
        }
        else if (ageViktor > 24) {
            System.out.println("Есди возраст человека равен " + ageViktor + ", то ему нужно ходить на работу");
        }

// Задча 5
        int ageKid = 5;
        if (ageKid < 5) {
            System.out.println("Если возрат ребенка равен " + ageKid + ", то ему запрещено кататься на атракционе.");
        }
        else if (ageKid >= 5 && ageKid < 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему разрешено кататься в сопровождении взрослого.");
        }
        else if (ageKid > 14) {
            System.out.println("Если возраст ребенка равне " + ageKid + ", то ему разрешено кататься без сопровождения взрослых.");
        }

// Задача 6
        int totalCapacity = 102;
        int totalSeating = 60;
        int passengers = 60;

        if (totalCapacity > passengers && passengers < totalSeating) {
            System.out.println("В вагоне есть сидячие и стоячие места.");
        }
        else if (totalCapacity > passengers && passengers >= totalSeating) {
            System.out.println("В вагоне остались только стоячие места.");
        }
        else if (totalCapacity <= passengers) {
            System.out.println("Вагон полность забит.");
        }

// Задача 7
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        }
        else if (two > one && two > three) {
            System.out.println("Наибольшое число " + two);
        }
        else if (three > one && three > two) {
            System.out.println("Наибольшое число " + three);
        }
    }
}