package be.nancy.myproject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

//@RunWith(Parameterized.class)

public class FractionTestCase {


    @Test
    public void fractionSetsNumCorreclty(){
        Fraction f = new Fraction(1, 3);
        assertEquals(1, f.getNumerator());}

    @Test
    public void fractionSimplfifiesItsResults(){
        Fraction f = new Fraction(24, 48);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void grootsteGemeneDelerVindenOpNoemer(){
        assertEquals(5, new Fraction(3,5).getDenominator());
    }

    @Test
    public void testToString(){
        assertEquals("1/5", new Fraction(1, 5).toString());
    }

}
