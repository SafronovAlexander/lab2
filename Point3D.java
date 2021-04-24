package com.company;


public class Point3D {

    private double XCoord, YCoord, ZCoord;


    public Point3D(double x, double y, double z){
        this.XCoord = x;
        this.YCoord = y;
        this.ZCoord = z;
    }

    public Point3D(){this (0, 0, 0); }

    public double GetX(){return XCoord;}

    public double GetY(){return YCoord;}

    public double GetZ(){return ZCoord;}

    public void setX(double val){XCoord = val;}

    public void setY(double val){YCoord = val;}

    public void setZ(double val){ZCoord = val;}

    public static boolean Equals(Point3D NewPoint, Point3D SecondPoint){
        if ((NewPoint.GetX() == SecondPoint.GetX())&&(NewPoint.GetY() == SecondPoint.GetY())&&(NewPoint.GetZ() == SecondPoint.GetZ()))
            return true;
        else return false;
    }
    public double distanceTo(Point3D NewPoint){
        double dist;
        dist = Math.sqrt(Math.pow((this.XCoord - NewPoint.XCoord), 2) + Math.pow((this.YCoord - NewPoint.YCoord), 2) + Math.pow((this.ZCoord - NewPoint.ZCoord), 2));
        return dist;
    }
}
