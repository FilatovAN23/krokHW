package HW;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class KonvertB {
	
	private static void print(double t) {
		System.out.println(t);
	}
	private static void print(String t) {
		System.out.println(t);
	}
	private static void print(String t,double s) {
		System.out.printf("%.1f",s);
	}
	
	private static String round(double t) {
		BigDecimal result = new BigDecimal(t);
		result = result.setScale(2, RoundingMode.DOWN);
		String g = result.toString();
		return g;
	}

	public static void main(String[] args) {
		System.out.println("Enter bytes... ");
		Scanner scan = new Scanner(System.in);
		String data = scan.next();
		
		double conData;
		try{
			conData = Double.parseDouble(data);

			}
		catch(Exception e) {
			print("Exception, enter new data");
			data=scan.next();
		}
		
		conData = Double.parseDouble(data);
		print("What units do you want to convert? "
				+ "\n1. B"
				+ "\n2. KB"
				+ "\n3. MB"
				+ "\n4. GB"
				+ "\n5. TB"
				+ "\n6. PB"
				+ "\n7. EB");
		
		
		String n= Double.toString(conData);
		
		
		
		int k =scan.nextInt();
		switch(k){
			case 1://B
				print(Double.toString(conData)+" B");
				break;
				
			case 2://KB
				if(conData>=Math.pow(2,10)) {
					System.out.println(round(conData*0.000977)+" KB");
				}else {
					print(Double.toString(conData*0.000977)+" KB");
				}
				break;
				
			case 3://MB
				if(conData>=Math.pow(2,20)) {
					System.out.println(round(conData*9.537E-7)+" MB");
				}else {
					print(Double.toString(conData*9.537E-7)+" MB");
				}
				break;
				
			case 4://GB
				if(conData>=Math.pow(2,30)) {
					System.out.println(round(conData*9.31E-10)+" GB");
				}else {
					print(Double.toString(conData*9.31E-10)+" GB");
				}
				break;
				
			case 5://TB
				if(conData>=Math.pow(2,40)) {
					System.out.println(round(conData*9.095E-13)+" TB");
				}else {
					print(Double.toString(conData*9.095E-13)+" TB");
				}
				break;
				
			case 6://PB
				if(conData>=Math.pow(2,50)) {
					System.out.println(round(conData*8.9E-16)+" PB");
				}else {
					print(Double.toString(conData*8.9E-16)+" PB");
				}
				break;
				
			case 7://EB
				if(conData>=Math.pow(2,60)) {
					System.out.println(round(conData*8.7E-19)+" EB");
				}else {
					print(Double.toString(conData*8.9E-19)+" EB");
				}
				break;
		}
	}

}
