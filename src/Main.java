public  class Main {
    public static void main(String[] args) {
        System.out.println("Homework 3");
        //Задача 1
        int a = 40000;
        float c = 3.75f;
        byte b = 100;
        double d = 2.536;
        short s = 120;
        long l = 987678965549L;
        char h = 1050;
        boolean o = true;

        System.out.println("Значение переменной a с типом int равно " +a);
        System.out.println("Значение переменной c с типом float равно " +c);
        System.out.println("Значение переменной b с типом byte равно " +b);
        System.out.println("Значение переменной d с типом double равно " +d);
        System.out.println("Значение переменной s с типом short равно " +s);
        System.out.println("Значение переменной l с типом long равно " +l);
        System.out.println("Значение переменной h с типом char равно " +h);

        //Задача 2
        float F = 27.12f;
        long L = 987678965549L;
        double D = 2.786f;
        short H = 569;
        int I = -159;
        char A = 27879;
        byte T = 67;

        System.out.println(F);
        System.out.println(L);
        System.out.println(D);
        System.out.println(H);
        System.out.println(I);
        System.out.println(A);
        System.out.println(T);

        //Задача 3
        int studentsOfClass1 = 23;
        int studentsOfClass2 = 27;
        int studentsOfClass3 = 30;

        int totalSheets = 480;

        int totalStudents =studentsOfClass1 + studentsOfClass2 + studentsOfClass3;

        int sheetsPerStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика расчитано " + sheetsPerStudent + " листов бумаги ");

        //Задача 4
        int bottlesPerMinute = 16;
        int minutesInDay = 24 * 60;
        int minutesIn3Days = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;

        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesInDay = bottlesPerMinute * minutesInDay;
        int bottlesIn3Days = bottlesPerMinute * minutesIn3Days;
        int bottlesInMonth = bottlesPerMinute * minutesInMonth;

        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина производит " + bottlesInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesInMonth + " штук бутылок");

        //Задача 5
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        //Задача 6
        int bananasCount = 5;
        int bananasWeight = 80;
        int milkVolume = 200;
        double iceCreamWeight = 2 * 100;
        int eggsCount = 4;
        int eggsWeight = 70;

        int totalWeight = bananasCount * bananasWeight + milkVolume * 105 / 100 + (int) iceCreamWeight + eggsCount * eggsWeight;
        double totalWeightInKg = totalWeight / 1000.0;

        System.out.printf("Общий вес завтрака: %d грамм (%.2f кг)", totalWeight, totalWeightInKg);

        //Задача 7
        int weightLossGoal = 7;
        double dailyWeightLossLow = 0.25;
        double dailyWeightLossHigh = 0.5;

        int daysLow = (int) Math.ceil(weightLossGoal / dailyWeightLossLow);
        int daysHigh = (int) Math.ceil(weightLossGoal / dailyWeightLossHigh);
        int daysAverage = (daysLow + daysHigh) / 2;

        System.out.println("Для похудения на " + weightLossGoal + " кг при потере веса " + dailyWeightLossLow + " кг в день нужно " + daysLow + " дней");
        System.out.println("Для похудения на " + weightLossGoal + " кг при поторе веса " + dailyWeightLossHigh + " кг в день нужно " + daysHigh + " дней" );
        System.out.println("В среднем потребуется " +daysAverage + " дней для похудения на " + weightLossGoal + " кг");

        //Задача 8
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int mashaNewSalary = (int) (mashaSalary * 1.1);
        int denisNewSalary = (int) (denisSalary * 1.1);
        int kristinaNewSalary = (int) (kristinaSalary * 1.1);

        int mashaAnnualIncomeBefore = mashaSalary * 12;
        int denisAnnualIncomeBefore = denisSalary * 12;
        int kristinaAnnualIncomeBefore = kristinaSalary * 12;

        int mashaAnnualInkomeAfter = mashaNewSalary * 12;
        int denisAnnualInkomeAfter = denisNewSalary * 12;
        int kristinaAnnualInkomeAfter = kristinaNewSalary *12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход" + (mashaAnnualInkomeAfter - mashaAnnualIncomeBefore) + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход" + (denisAnnualInkomeAfter - denisAnnualIncomeBefore) + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " ублей. Годовой доход" +(kristinaAnnualInkomeAfter - kristinaAnnualIncomeBefore) + "рублей.");

        //Домашка




    }
    }