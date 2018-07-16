package ru.geekbrains.java1.dz.dz1.Enver_Eskendarov;

public class MainDz {
    public static void main(String[] args) {
        byte a = 10;
        short b = 10000;
        int c = 300002200;
        long d = 875491865394213L;
        float e = 21345631.0F;
        double f = 65456.456;
        boolean g = true, h = false;
        char i = '@';
        System.out.println("g = " + g);
        System.out.println("i = " + i);
        System.out.println("d = " + d);

        vir(2,3,10,2);
        sum(5,6);
        posneg(-23);
        name("Энвер");
        vis( 2018);

    };

    public static void vis(int year) {
        if (((year % 4)== 0)&&(year % 100 !=0) || (year % 400 ==0)) {
            System.out.println( year + " год является високосным");
        }
        else System.out.println( year + " год не является високосным");

    }

    public static void name ( String a) {
        System.out.println("Привет, " + a +"!!!");
    }

    public static void posneg(int a) {
        if (a < 0) {
            System.out.println("Число a, отрицательное");
        } else {
            System.out.println("Число a, положительное");
        }
    }

    public static void vir (int a, int b, int c, int d){

        if (d == 0)
        {
            System.out.println("Делить на ноль нельзя");
        }  else {
           int e = a * (b + (c / d));
           System.out.println("выражение = " + e);
           }
        };
        else {
            System.out.println(false);
        }
    }
}