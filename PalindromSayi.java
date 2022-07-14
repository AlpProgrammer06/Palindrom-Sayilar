package com.company;

public class Main {

    static boolean isPalindrom(int number) {

        int temp = number, reserveNumber = 0, lastNumber;


        while (temp != 0) {

            System.out.println("=============");
            System.out.println("sayý => " + temp);

            lastNumber = temp % 10;
            System.out.println("son basamak " + lastNumber);

            reserveNumber = (reserveNumber * 10) + lastNumber;
            System.out.println("yeni sayý " + reserveNumber);
            temp /= 10;
        }
        if (number == reserveNumber) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        isPalindrom(247);
    }
}


//247   ==>   742       


