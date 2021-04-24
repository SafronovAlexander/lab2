package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    	Point3D Point1 = new Point3D();

		Point3D Point2 = new Point3D();

		Point3D Point3 = new Point3D();

		System.out.println("Input x for Point1");
		Scanner x1 = new Scanner(System.in);
		Point1.setX(x1.nextDouble());

		System.out.println("Input y for Point1");
		Scanner y1 = new Scanner(System.in);
		Point1.setY(y1.nextDouble());

		System.out.println("Input z for Point1");
		Scanner z1 = new Scanner(System.in);
		Point1.setZ(z1.nextDouble());

		System.out.println("Input x for Point2");
		Scanner x2 = new Scanner(System.in);
		Point2.setX(x2.nextDouble());

		System.out.println("Input y for Point2");
		Scanner y2 = new Scanner(System.in);
		Point2.setY(y2.nextDouble());

		System.out.println("Input z for Point2");
		Scanner z2 = new Scanner(System.in);
		Point2.setZ(z2.nextDouble());

		System.out.println("Input x for Point3");
		Scanner x3 = new Scanner(System.in);
		Point3.setX(x3.nextDouble());

		System.out.println("Input y for Point3");
		Scanner y3 = new Scanner(System.in);
		Point3.setY(y3.nextDouble());

		System.out.println("Input z for Point3");
		Scanner z3 = new Scanner(System.in);
		Point3.setZ(z3.nextDouble());
		if ((Point3D.Equals(Point1, Point2))|(Point3D.Equals(Point3, Point2))|(Point3D.Equals(Point1, Point3)))
			System.out.println("Такого треугольника не существует");
		else computeArea(Point1, Point2, Point3);


    }
    public static void computeArea(Point3D Point1, Point3D Point2, Point3D Point3){
    	double h1 = Point1.distanceTo(Point2);
    	double h2 = Point2.distanceTo(Point3);
    	double h3 = Point3.distanceTo(Point1);
    	double p = (h1 + h2 + h3)/2;
    	double S = Math.sqrt(p * (p - h1) * (p - h2) * (p - h3));
    	System.out.println(S);
	}
}
