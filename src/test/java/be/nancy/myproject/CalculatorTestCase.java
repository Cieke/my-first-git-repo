package be.nancy.myproject;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.Collection;
import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class CalculatorTestCase {
    private  Calculator calc;
    private int a;
    private int b;
    private int c;

    @Before
    public void init() {
        calc = new Calculator();
    }


    @Parameterized.Parameters
    public static Collection<Integer[]> values(){
        ArrayList<Integer[]> list = new ArrayList<>();
        list.add(new Integer[] {1,5,5});
        return list;
    }

    public CalculatorTestCase (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @FirstTestIt
    public void multiplicationOfTwoFactorsYieldsProductOfFactors(){

        assertEquals (c, calc.multiply(a,b));
    }

    @FirstTestIt
    public void multiplicationOfNegativeNumbersIsPositive(){


        assertEquals (84, calc.multiply(-7,-12));
    }
    @FirstTestIt
    public void zeroIsAbsorbing(){

        assertEquals (0, calc.multiply(3,0));


    }
    @FirstTestIt
    public void oneIsNeutral(){

        assertEquals (100, calc.multiply(100,1));
    }
}

