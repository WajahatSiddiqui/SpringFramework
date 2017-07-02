package com.wajahat.learn.spring.core;

public class TrainglePoint {
	Point pointA;
	Point pointB;
	Point pointC;
	
	public TrainglePoint(Point pointA, Point pointB, Point pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public String toString() {
		return "TrainglePoint [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}
}
