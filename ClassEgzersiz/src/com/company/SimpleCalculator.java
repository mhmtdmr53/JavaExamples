package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private  double secondNumber;
    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber=secondNumber;
    }
    public double getFirstNumber()
    {
        return this.firstNumber;
    }
    public double getSecondNumber()
    {
        return this.secondNumber;
    }
    public double getAdditionResult()
    {
        double sum=this.firstNumber+this.secondNumber;
        return sum;
    }
    public double getSubtractionResult()
    {
        double sub=this.firstNumber-this.secondNumber;
        return sub;
    }
    public double getMultiplicationResult()
    {
        double mul=this.firstNumber*this.secondNumber;
        return mul;
    }
    public double getDivisionResult()
    {
        double div=this.firstNumber/this.secondNumber;
        if(this.secondNumber==0)
            div=0;
        return div;
    }
}
