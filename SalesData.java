package M4_ClassExercise8;

import java.util.Scanner;

public class SalesData {
	
	private double sales2;
	private double average;

	double[] sales;
	
	public void getScanner()
	{
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i<sales.length; i++)
		{
			System.out.println("Enter the sales for day " + (i + 1) + " ");
			sales[i] = scan.nextDouble();
		}
		
	}
	
	public SalesData(double[]s)
	{
		sales = new double[s.length];
		
		for(int i = 0; i<s.length; i++)
		{
			sales[i] = s[i];
		}
	}
	
	public void getTotal()
	{
		sales2 = 0;
		
		for(int i = 0; i<sales.length; i++)
		{
			sales2 += sales[i];
		}
	
	}
	
	public void getAverage()
	{
		
		average = sales2/sales.length; 
	
	}
	
	public void displayData()
	{
		System.out.print("the total sales is: " + sales2);
		System.out.print("the average sales is: " + average);
	}

	
		
	
}
