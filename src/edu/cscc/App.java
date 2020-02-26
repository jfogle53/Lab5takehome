package edu.cscc;
/*
James Fogle
Lab 5
Feb 19th 2020
this is an example of how inheritance is use among classes
did condtructors too
 */


public class App{
public static void main(String[]args){


        HoldingTank tank=new HoldingTank(600,1000);
        tank.print();
        tank.add(300);
        tank.drain(50);
        tank.print();
        tank.add(500);
        tank.drain(250);
        tank.print();
        tank.drain(1200);
        tank.add(200);
        tank.drain(25);
        tank.print();



        }
}
