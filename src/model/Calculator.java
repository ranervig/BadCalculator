package model;

public class Calculator {
	private double number1;
	private double number2;
	private double number3;
	private double solution;
	private String operation1;
	private String operation2;

	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calculator(double number1, double number2, double number3, String operation1, String operation2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
		this.operation1 = operation1;
		this.operation2 = operation2;
		this.solution = calculate();
	}

	public double calculate() {
		double answer = 0;

		if ((operation2.equals("divide") || operation2.equals("multiply")) && !operation1.equals("divide")) {
			//if second operator is higher precedence it goes first
			answer = performOperation(number2, number3, operation2);
			answer = performOperation(number1, answer, operation1);
		} else {
			answer = performOperation(number1, number2, operation1);
			answer = performOperation(answer, number3, operation2);
		}
		return answer;

	}

	private double performOperation(double firstNum, double secondNum, String operation) {
		switch (operation) {
		case "divide":
			return firstNum / secondNum;
		case "multiply":
			return firstNum * secondNum;
		case "plus":
			return firstNum + secondNum;
		case "minus":
			return firstNum - secondNum;
		}
		return 0;
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public double getNumber3() {
		return number3;
	}

	public void setNumber3(double number3) {
		this.number3 = number3;
	}

	public double getSolution() {
		return solution;
	}

	public void setSolution(double solution) {
		this.solution = solution;
	}

	public String getOperation1() {
		return operation1;
	}

	public void setOperation1(String operation1) {
		this.operation1 = operation1;
	}

	public String getOperation2() {
		return operation2;
	}

	public void setOperation2(String operation2) {
		this.operation2 = operation2;
	}

	@Override
	public String toString() {
		return "Calculator [number1=" + number1 + ", number2=" + number2 + ", number3=" + number3 + ", solution="
				+ solution + ", operation1=" + operation1 + ", operation2=" + operation2 + "]";
	}

}