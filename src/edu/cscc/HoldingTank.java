package edu.cscc;

public class HoldingTank {
    private int currentCap, maxCap;

    public HoldingTank(int currentCap, int maxCap){
        this.currentCap = currentCap;
        this.maxCap = maxCap;
    }

   public void add(int volume){
    this.currentCap = volume + currentCap;
    if (currentCap > maxCap){
        this.currentCap = maxCap;
         }
    }

    public void drain(int volume){
        this.currentCap = currentCap - volume;
        if (currentCap < 0){
            this.currentCap = 0;
        }
    }

    public void print(){
        System.out.println("The tank volume is " + currentCap + " gallons");
    }

}