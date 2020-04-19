package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        Integer [] n = {number%10,(number%100)/10,(number-number%10)/100};
        String s = n[0].toString()+n[1].toString()+n[2].toString();
        int reverse = Integer.parseInt(s);
        return reverse;


    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(576));
    }
}
