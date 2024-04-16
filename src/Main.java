//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задание 1");
        int int_first = 320000;
        byte byte_first = 32;
        short short_first = 32000;
        long long_first = 3200000000L;
        float float_first = 32.32f;
        double double_first = 32.32323232;
        System.out.println("Значение переменной int_first с типом int равно " + int_first);
        System.out.println("Значение переменной byte_first с типом byte равно " + byte_first);
        System.out.println("Значение переменной short_first с типом short равно " + short_first);
        System.out.println("Значение переменной long_first с типом long равно " + long_first);
        System.out.println("Значение переменной float_first с типом float равно " + float_first);
        System.out.println("Значение переменной double_first с типом double равно " + double_first);
        System.out.println("Задание 2");
        float float_second = 27.12f;
        long long_second = 987678965549L;
        float float_third = 2.786f;
        short short_second = 569;
        short short_third = -159;
        short short_fourth = 27897;                 //Стойкое ощущение, что во втором задании вообще не то делаю - слишком много повторяются одни и те же типы переменных
        byte byte_second = 67;
        System.out.println("Задание 3");
        byte students_1 = 23;
        byte students_2 = 27;
        byte students_3 = 30;
        short paper = 480;
        int paper_perStudent = paper / ((short)students_1 + (short)students_2 + (short)students_3);  // Можно ли каким-нибудь образом данную перменную изначально задать типом byte? Или придется в дальнейшем её всегда прописывать через (byte)paper_perStudent?
        System.out.println("На каждого ученика рассчитано " + (byte)paper_perStudent + " листов бумаги");
        System.out.println("Задание 4");
        byte kpd = (byte) (16 / 2);
        short timing_1 = (short) (kpd * 20);
        short timing_2 = (short) (timing_1 * 3 * 24);
        int timing_3 = timing_2 * 3;
        int timing_4 = timing_3 * 10;
        System.out.println("За 20 минут машина произвела " + timing_1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + timing_2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + timing_3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + timing_4 + " штук бутылок");
        System.out.println("Задание 5");
        byte allAmount = 120;
        byte white_perRoom = 2;             // Нужно ли вообще сохранять постоянно тип byte и пр., как сделал здесь или же можно спокойно переходить на int?
        byte brown_perRoom = 4;
        byte roomAmount = (byte)(allAmount / (white_perRoom + brown_perRoom));
        byte whiteAmount = (byte)(roomAmount * white_perRoom);
        byte brownAmount = (byte)(roomAmount * brown_perRoom);
        System.out.println("В школе,где " + roomAmount + " классов,нужно " + whiteAmount + " банок белой краски и " + brownAmount + " банок коричневой краски");
        System.out.println("Задание 6");
        byte bananas = 5;
        byte weight_perBanana = 80;
        short bananasWeight = (short)(bananas * weight_perBanana);
        short milk = 200;
        short weight_perMilk = (short)(105 / 100);
        short milkWeight = (short)(milk * weight_perMilk);
        byte plombir = 2;
        byte weight_perPlombir = 100;
        short plombirWeight = (short)(plombir * weight_perPlombir);
        byte egg = 4;
        byte weight_perEgg = 70;
        short eggWeight = (short)(egg + weight_perEgg);
        short mealWeightGr = (short)(bananasWeight + milkWeight + plombirWeight + eggWeight);
        System.out.println("Вес завтрака составляет " + mealWeightGr + " грамма");
        float mealWeightKg = (float)(mealWeightGr * 0.001);
        System.out.println("Вес завтрака составляет " + mealWeightKg + " килограмма");
        System.out.println("Задание 7");
        byte weightKg = 7;
        short weightGr = (short)(weightKg * 1000);
        short perDay_1 = 250;
        short perDay_2 = 500;
        byte case_1 = (byte)(weightGr / perDay_1);
        byte case_2 = (byte)(weightGr / perDay_2);
        System.out.println("При ежедневной потере веса в 250 гр срок похудения составит " + case_1 + " дней");
        System.out.println("При ежедневной потере веса в 500 гр срок похудения составит " + case_2 + " дней");
        byte middle = (byte)((case_1 + case_2) / 2);
        System.out.println("В среднем спортсмен похудеет за " + middle + " день");
        System.out.println("Задание 8");
        byte monthPerYear = 12;
        int monthMashaPast = 67760;
        int yearMashaPast = monthMashaPast * monthPerYear;
        int monthDenisPast = 83690;
        int yearDenisPast = monthDenisPast * monthPerYear;
        int monthKristinaPast = 76230;
        int yearKristinaPast = monthKristinaPast * monthPerYear;
        float koefNadbavki = 0.1f;
        int monthMashaNew = (int)(monthMashaPast + (monthMashaPast * koefNadbavki));                // Задаюсь вопросом, верно ли я вообще использую эти типы переменных
        int yearMashaNew = monthMashaNew * monthPerYear;
        int monthDenisNew = (int)(monthDenisPast + (monthDenisPast * koefNadbavki));
        int yearDenisNew = monthDenisNew * monthPerYear;
        int monthKristinaNew = (int)(monthKristinaPast + (monthKristinaPast * koefNadbavki));
        int yearKristinaNew = monthKristinaNew * monthPerYear;
        System.out.println("Маша теперь получает " + monthMashaNew + " рублей." + " Годовой доход вырос на " + (yearMashaNew - yearMashaPast) + " рублей");
        System.out.println("Денис теперь получает " + monthDenisNew + " рублей." + " Годовой доход вырос на " + (yearDenisNew - yearDenisPast) + " рублей");
        System.out.println("Кристина теперь получает " + monthKristinaNew + " рублей." + " Годовой доход вырос на " + (yearKristinaNew - yearKristinaPast) + " рублей");


    }
}