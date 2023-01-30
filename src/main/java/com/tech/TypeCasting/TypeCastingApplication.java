package com.tech.TypeCasting;
// 1. Widening = convert small datatype to large datatype (Automatic)
// 2.Narrowing -convert large to  smaller (Manual)
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TypeCastingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TypeCastingApplication.class, args);
		int val1 = 10;
		double doubleVal = val1;
		System.out.println(val1+"doubleVal");

		//Narrowing
		double doubleVal1 =20.0;
		int val2 = (int) doubleVal1;
		System.out.println(doubleVal1+" "+val2);



		int num = 10;
		System.out.println(" int value is: " + num);

		// converts int to string

		String data = String.valueOf(num);
		System.out.println(" string value is: " + data);


		String str= "10";
		System.out.println("The string value is: " + str);

		// convert string  to int
		int Num = Integer.parseInt(str);
		System.out.println("The integer value is: " + Num);

	}

}
