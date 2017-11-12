package com.makara.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.makara.model.Shape;

@Component
public class Drawing {

	@Autowired
	@Qualifier(value = "triangle")
	private Shape shape;

	public void draw() {
		System.out.println("Shape " + shape.getType() + " is drawing..");
	}
}
