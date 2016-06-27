package be.nancy.myproject;


public class Fraction {
    private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    private void simplify(){

        int grootsteGemeneDeler = Utilities.greatestCommonFactor(this.numerator,this.denominator);
        numerator = this.numerator/grootsteGemeneDeler;
        denominator = this.denominator/grootsteGemeneDeler;

    }
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }




}
