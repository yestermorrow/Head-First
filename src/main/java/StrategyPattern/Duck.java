package StrategyPattern;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() {}
    public void Fly () {
        flyBehavior.fly();
    }
    public void Quack(){
        quackBehavior.quack();
    }
    public abstract void display();
}
