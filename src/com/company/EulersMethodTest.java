package com.company;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class EulersMethodTest {
    public static void method() throws AWTException, InterruptedException {

        StringSelection stringSelection;
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        Robot robot = new Robot();
        double X = 1.0;
        double Y = 1.0;
        double dX = 0.01;
        double dY ;
        double Yp;
        int steps = 100 ;
        for(int i =0; i < steps; i++){
            Yp = (Math.pow(X,2)-2*Y);
            dY = Yp * dX;
            Y = Y + dY;
            X = X + dX;
            System.out.println("Y "+ (i+1) + " = " + Y);
            if(i>10000) {
                stringSelection = new StringSelection(String.valueOf(Y));
                clipboard.setContents(stringSelection, stringSelection);


                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(10);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                Thread.sleep(10);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(80);
            }
        }
        System.out.println("At final x of "+ X + ", y is approximate to " + Y);
    }
}