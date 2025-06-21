package Forecasting;

public class FinancialForecasting implements Forecasting{
	public Double CalculateForcasting(Double presentvalue,int year,float rate) {
		if(year==0) {
			return presentvalue;
		}
		
		return CalculateForcasting(presentvalue*(1-rate),year-1,rate);
	}
}
