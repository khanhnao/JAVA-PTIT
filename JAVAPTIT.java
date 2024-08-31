package com.mycompany.java.ptit;

import java.util.Scanner;

class Point {
    private double x, y;
    
    Point() {
        x = 0;
        y = 0;
    }
    
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    Point(Point P) {
        this.x = P.x;
        this.y = P.y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double distance(Point p2) {
        return Math.sqrt((this.x - p2.x) * (this.x - p2.x) + (this.y - p2.y) * (this.y - p2.y));
    }
    
    public double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
}  

public class JAVAPTIT {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.printf("%.4f", a.distance(b));
            System.out.println("");
        }
    }
        
}