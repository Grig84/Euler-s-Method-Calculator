package com.company;
public class EulersMethod {
    public static void method(){
        double X = 1.0;
        double Y = 1.0;
        double dX = 0.01;
        double dY = 0.0;
        double Yp = 0.0;
        int steps = 100;
        for(int i =0; i < steps; i++){
            Yp = (Math.pow(X,2)-2*Y);
            dY = Yp * dX;
            Y = Y + dY;
            X = X + dX;
        }
        System.out.println("At final x of "+ X + ", y is approximate to " + Y);
    }
}