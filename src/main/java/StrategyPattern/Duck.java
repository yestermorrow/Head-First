package StrategyPattern;

public class Duck {
    QuackBehavior quackBehavior;// 每只鸭子都会引用实现QuackBehavior

    public void performQuack() {
        quackBehavior.quack(); // 鸭子对象不亲自处理呱呱叫行为，而是委托给quackBehavior引用的对象
    }
}
