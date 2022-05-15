package com.spring.cal;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.cal.beans.Add;
import com.spring.cal.beans.Sub;
import com.spring.cal.beans.Mul;
import com.spring.cal.beans.Div;

public class MenuCal {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");

		Add add = context.getBean("add", Add.class);
		add.Display();
		System.out.println("Add of numbers = " + add.add());
		
		Sub subt = context.getBean("sub", Sub.class);
		subt.Display();
		System.out.println("Sub of numbers = " + subt.sub());

		Mul mult = context.getBean("mul", Mul.class);
		mult.Display();
		System.out.println("Mul of numbers = " + mult.mul());
		
		Div divs = context.getBean("div", Div.class);
		divs.Display();
		System.out.println("Div of numbers = " + divs.div());

		context.close();
	}

}
