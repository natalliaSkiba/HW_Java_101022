package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        First level:
// 1

        System.out.println("Пожалуйста введите слово  ");
        Scanner scanner1 = new Scanner(System.in);

        String Line = scanner1.nextLine();
        int lot = Line.length();
        System.out.println("количество букв в слове = " + lot);
        String half = Line.substring(0,lot/2);
        System.out.println("первая половина слова :  " + half);
        String half_end = Line.substring(lot/2);
        System.out.println("вторая половина слова :  " + half_end);

//2
        Math m = new Math();
        m.getSum(4, 5);
        System.out.println(m.getResult());

        m.getSub(15, 5);
        System.out.println(m.getResult());

        m.getMul(5, 5);
        System.out.println(m.getResult());

        m.getDel(41, 2);
        System.out.println(m.getResult());

//3
        System.out.println("Пожалуйста введите сумму в евро :  ");
        Scanner scanner2 = new Scanner(System.in);
        double SumEvr = scanner2.nextDouble();

        Calc calc1 = new Calc();
        System.out.println("Ваша сумма в долларах по курсу на 10.10.22 :   " + calc1.getSumDol(SumEvr));

    }

}
