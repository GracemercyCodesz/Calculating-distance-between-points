/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gmrgk
 */
public class PointType {
    private final double pi = 3.141592653;
    private int x2, x1, y2, y1;
    
    public PointType() { //default
        x2 = 0;
        x1 = 0;
        y2 = 0;
        y1 = 0;
    }
    
    public PointType(int x2,int x1,int y2,int y1) { //overloaded
        this.x2 = x2;
        this.x1 = x1;
        this.y2 = y2;
        this.y1 = y1;
    }
    
    //acessor
    public double getx2(){return x2;}
    public double getx1(){return x1;}
    public double gety2(){return y2;}
    public double gety1(){return y1;}
    
    
    //mutator
    public void setx2(int xpoint2){x2= xpoint2;}
    public void setx1(int xpoint1){x1 = xpoint1;}
    public void sety2(int ypoint2){y2= ypoint2;}
    public void sety1(int ypoint1){y1 = ypoint1;}
    
    public double distance(int x2,int x1,int y2,int y1){
    double distSquared = (y2-y1)^2-(x2-x1)^2;
    double distance = Math.sqrt(distSquared);
    
    
    return distance;
    }
    
    public double radius(int x2,int x1,int y2,int y1){   
        //actually not sure if distance = radius or diameter im assuming its diameter
        double radius = distance(x2,x1,y2,y1)/2;
        
        return radius;
    }
    
    public double circumference(){

        double circumeference = pi *distance(x2,x1,y2,y1);
        
        return circumeference;
        
    }
    
    public double area(){
        double radius = radius(x2,x1,y2,y1);
        
        //insert code here
        double area = pi*radius*radius;
        
        return area;
    }
    
    
}
