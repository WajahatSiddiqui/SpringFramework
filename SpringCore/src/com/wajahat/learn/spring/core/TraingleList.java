package com.wajahat.learn.spring.core;

import java.util.List;

public class TraingleList {
	
	List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		for (Point p : points) {
			System.out.println(p);
		}
	}
}
