import math;
public class Cylinder {
    public double r ;
    public double h;
    public static int noOfCylinder;

    public Cylinder(){
        h= 4;
        r = 3;

    }

    public Cylinder(double r, double h){
        this.r=r;
        this.h=h;
    }
    public static getNoOfCylinder(int noOfCylinder){
        noOfCylinder=noOfCylinder;
    }

    public double calculateBaseArea(){
       double BaseArea = (Math,PI)*r*(r+h);
        return BaseArea;
    }

    public double calculateVolume(){
        double volume=(Math,PI)*r*r*h;
        return volume;
    }

    public double
}
