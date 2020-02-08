package com.mycompany.app;
import java.util.Arrays;
import java.util.Scanner;
interface Newyear
{
    public void total_weight(int number,float weight);
    public void sort_with_cost(float[] mrp);
    public void count_within_range(float[] mrp,int lower, int upper);
}
class Chocolates implements  Newyear
{
	int no_of_chocolates;
	float weight_of_one_chocolate;
	float weight_of_chocolates;
	float[] mrp;
	public void total_weight(int no_of_chocolates,float weight_of_one_chocolate)
	{
		weight_of_chocolates=no_of_chocolates*weight_of_one_chocolate;
		System.out.println("Weight of chocolates is:"+weight_of_chocolates);
	}
	public void sort_with_cost(float[] mrp)
	{
		Arrays.sort(mrp);
		System.out.println("The order of chocolates based on their costs is:");
		for(int i=0;i<mrp.length;i++)
		{
			System.out.print(mrp[i]+" ");
		}
	}
	public void count_within_range(float[] mrp,int lower, int upper)
	{
		{
			int count=0;
			for(int i=0;i<mrp.length;i++)
			{
				if(mrp[i]>=lower && mrp[i]<=upper)
					count+=1;
			}
			System.out.println("Number of candies within range ("+lower+","+upper+"):"+count);
		}
	}
}
class Candies implements  Newyear
{
	int no_of_candies;
	float weight_of_one_candy;
	float weight_of_candies;
	int lower;
	int upper;
	float[] mrp;
	public void total_weight(int no_of_candies,float weight_of_one_candy)
	{
		weight_of_candies=no_of_candies*weight_of_one_candy;
		System.out.println("Weight of candies is:"+weight_of_candies);
	}
	public void sort_with_cost(float[] mrp)
	{
		Arrays.sort(mrp);
		System.out.println("The order of chocolates based on their costs is:");
		for(int i=0;i<mrp.length;i++)
		{
			System.out.print(mrp[i]+" ");
		}
	}
	public void count_within_range(float[] mrp,int lower, int upper)
	{
		int count=0;
		for(int i=0;i<mrp.length;i++)
		{
			if(mrp[i]>=lower && mrp[i]<=upper)
				count+=1;
		}
		System.out.println("Number of candies within range ("+lower+","+upper+"):"+count);
	}
}
class Sweets implements Newyear
{
	int no_of_sweets;
	float weight_of_one_sweet;
	float weight_of_sweets;
	public void total_weight(int no_of_sweets,float weight_of_one_sweet)
	{
		weight_of_sweets=no_of_sweets*weight_of_one_sweet;
		System.out.println("Weight of sweets is:"+weight_of_sweets);
	}
	public void sort_with_cost(float[] mrp)
	{
		Arrays.sort(mrp);
		System.out.println("The order of chocolates based on their costs is:");
		for(int i=0;i<mrp.length;i++)
		{
			System.out.print(mrp[i]+" ");
		}
	}
	public void count_within_range(float[] mrp,int lower, int upper)
	{
		{
			int count=0;
			for(int i=0;i<mrp.length;i++)
			{
				if(mrp[i]>=lower && mrp[i]<=upper)
					count+=1;
			}
			System.out.println("Number of candies within range ("+lower+","+upper+"):"+count);
		}
	}
}
public class App
{
    public static void main(String args[])
    {
	int number;
	float weight;
	Scanner s=new Scanner(System.in);
	int n;
	System.out.println("Enter size of mrp array");
	n=s.nextInt();
	float[] mrp=new float[n];
    int lower,upper;
	System.out.println("Enter number of chocolates");
	number=s.nextInt();
	System.out.println("Enter the weight of one chocolate");
	weight=s.nextFloat();
	System.out.println("Enter the cost of each chocolate");
	for(int i=0;i<number;i++)
	{
		mrp[i]=s.nextFloat();
	}
	System.out.println("Enter lower range");
	lower=s.nextInt();
	System.out.println("Enter upper range");
	upper=s.nextInt();
	Chocolates chocolates=new Chocolates();
	chocolates.total_weight(number,weight);
	chocolates.sort_with_cost(mrp);
	chocolates.count_within_range(mrp,lower,upper);
	System.out.println("Enter number of candies");
	number=s.nextInt();
	System.out.println("Enter the weight of one candy");
	weight=s.nextFloat();
	System.out.println("Enter the cost of each candy");
	for(int i=0;i<number;i++)
	{
		mrp[i]=s.nextFloat();
	}
	System.out.println("Enter lower range");
	lower=s.nextInt();
	System.out.println("Enter upper range");
	upper=s.nextInt();
	Candies candies=new Candies();
	candies.total_weight(number,weight);
	candies.sort_with_cost(mrp);
	candies.count_within_range(mrp,lower,upper);
	System.out.println("Enter number of sweets");
	number=s.nextInt();
	System.out.println("Enter the weight of one sweet");
	weight=s.nextFloat();
	System.out.println("Enter the cost of each chocolate");
	for(int i=0;i<number;i++)
	{
		mrp[i]=s.nextFloat();
	}
	System.out.println("Enter lower range");
	lower=s.nextInt();
	System.out.println("Enter upper range");
	upper=s.nextInt();
	Sweets sweets=new Sweets();
	sweets.total_weight(number,weight);
	sweets.sort_with_cost(mrp);
	sweets.count_within_range(mrp,lower,upper);
	float total_weight_of_gift=chocolates.weight_of_chocolates+candies.weight_of_candies+sweets.weight_of_sweets;
   System.out.println("Total weight of gift is:"+total_weight_of_gift);    
   }
    
}
