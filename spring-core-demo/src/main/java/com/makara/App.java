package com.makara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.makara.service.Drawing;

@ComponentScan
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		Drawing shape = context.getBean(Drawing.class);
		shape.draw();
	}
}
