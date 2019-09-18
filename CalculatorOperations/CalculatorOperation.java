package CalculatorOperations;

import Exceptions.NonDefinedOperationException;

import java.util.Scanner;

import static CalculatorOperations.Division.division;
import static CalculatorOperations.Minus.minusoperation;
import static CalculatorOperations.Multiplication.multiplication;
import static CalculatorOperations.Plus.plus;

public class CalculatorOperation  {
  public void chooseCalculatorOperation(String operation) throws UnsupportedOperationException {
      Scanner inputDevice = new Scanner(System.in);
      System.out.print("Please enter first number: ");
      double a = inputDevice.nextDouble();
      System.out.print("Please enter second number: ");
     double b = inputDevice.nextDouble();
        switch (operation)
    {
        case "+":
           plus(a, b);
            break;
        case "-":
            System.out.println(minusoperation(a, b));
            break;
        case "*":
             multiplication(a, b);
            break;
        case "/":
          division(a, b);
        default:
            throw new UnsupportedOperationException("Incorrect operation symbol. Please choose +, -, / or *");
    }
}
}
