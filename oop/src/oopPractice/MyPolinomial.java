package oopPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MyPolinomial {

	private double[] coefss;

	public MyPolinomial(double... coefss) {
		
		super();
		this.coefss = coefss;
		
	}
	
	public MyPolinomial(String filename) {
		
		super();
		Scanner in = null;
		
		try{
			in = new Scanner(new File(filename));
		}catch(FileNotFoundException fe){
			fe.printStackTrace();
		}
		
		int degree = in.nextInt();
		coefss = new double[degree+1];
		
		for(int i=0; i<coefss.length; i++){
			coefss[i] = in.nextDouble();
		}
	}
	
	public int getDegree(){
		return coefss.length;
	}

	@Override
	public String toString() {
		return "MyPolinomial [coefss=" + Arrays.toString(coefss) + "]";
	}	
	
	public double evaluate(double x){
		
		double result = 0.0;
		for(int i = 0; i < coefss.length; i++){			
			result = coefss[i] * Math.pow(x, i);			
		}
		
		return  result;
		
	}
	
	public MyPolinomial add(MyPolinomial another){
		
		double[] holder = this.getDegree() > another.getDegree() ?
				this.coefss : another.coefss;
		
		for(int i = 0; i < holder.length; i++){
			
			double a;
			double b;
			
			if(i < this.coefss.length)
				a = this.coefss[i];
			else
				a = 0.0;
			
			if(i < another.coefss.length)
				b = another.coefss[i];
			else
				b = 0.0;
			
			holder[i] = a+b;					
		}
		
		return new MyPolinomial(holder);
		
	}
	
	public void multiply(MyPolinomial another){
		
	}
		
}


