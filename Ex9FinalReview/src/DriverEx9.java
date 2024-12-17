/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author gmrgk
 */
public class DriverEx9 {
    public static void main (String[] args){
    Scanner scnr = new Scanner(System.in);
    PointType points = new PointType();
    
    int x2, x1, y2, y1;
    
    System.out.println("Hello user, give me the coordinates of your first point."
        + "\n Seperatethem with a space and integer values only!");
    
    x1 = scnr.nextInt();
    points.setx1(x1);
    
    y1 = scnr.nextInt();
    points.setx1(y1);
    
    System.out.println("Nice! now gie me the coordinates of the second point!");
    x2 = scnr.nextInt();
    points.setx1(x2);
    
    y2 = scnr.nextInt();
    points.setx1(y2);
    
    System.out.println("\n ***Results***");
    System.out.println("Distance between the points: " + points.distance(x2, x1, y2, y1) );
    System.out.println("Radius: " + points.radius(x2, x1, y2, y1));
    System.out.println("Area: " + points.area());
    System.out.println("Circumference: " + points.circumference());
    
    }
}
