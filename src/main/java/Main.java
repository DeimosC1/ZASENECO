package main.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(Fraction.createNormalised(120, 12));
        System.out.println(Fraction.createNormalised(4, 12));
        System.out.println(new Fraction(2, 4).plus(new Fraction(3, 9)));
        System.out.println(new Fraction(2, 4).minus(new Fraction(3, 9)));
        System.out.println(new Fraction(2, 4).times(new Fraction(3, 9)));
        System.out.println(new Fraction(2, 4).dividedBy(new Fraction(3, 9)));
    }
}
