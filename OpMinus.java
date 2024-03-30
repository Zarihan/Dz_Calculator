package Dz_Calculator;

public class OpMinus implements Operation{
 
    @Override
    public double exec(double valueOne, double valueTwo ) {
        return (valueOne - valueTwo );
    }
}