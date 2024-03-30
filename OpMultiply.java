package Dz_Calculator;

public class OpMultiply implements Operation{
 
    @Override
    public double exec(double valueOne, double valueTwo ) {
        return (valueOne * valueTwo );
    }
}
