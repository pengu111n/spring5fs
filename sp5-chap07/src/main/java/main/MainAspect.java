package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap07.Calculator;
import chap07.RecCalculator;
import config.AppCtx;

public class MainAspect {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
//		Calculator cal = ctx.getBean("calculator", Calculator.class); //수정전
		RecCalculator cal = ctx.getBean("calculator", RecCalculator.class); //수정후
		long fiveFact = cal.factorial(5);
		System.out.println("cal.factorial = " + fiveFact);
		System.out.println(cal.getClass().getName());
		ctx.close();
		
		

	}

}
