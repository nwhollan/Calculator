package application;

public class Calculator {
	public float calculate(double num1, Double num2, String operator) {
		switch (operator) {
		case "+":
			return (float) (num1 + num2);
		case "-":
			return (float) (num1 - num2);
		case "/":
			if (num2 == 0) { return 0;}
			return (float) (num1/num2);
		case "x":
			return (float) (num1*num2);
		case "Ln()":
			return (float) java.lang.Math.log(num1);
		default:
			return 0;
		}
	}
}
