package Forecasting;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Double presentvalue=sc.nextDouble();
		int year = sc.nextInt();
		float rate=sc.nextFloat();
		Forecasting forecasting = new FinancialForecasting();
		System.out.println("The future value after "+year+" is "+forecasting.CalculateForcasting(presentvalue, year, rate));
		
		sc.close();
	}
}
