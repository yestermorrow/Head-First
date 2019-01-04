package StrategyPattern;

public class GreenHeadDuck extends Duck{
    public GreenHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }
    public void display() {
        System.out.println("**GreenHead**");
    }
}
