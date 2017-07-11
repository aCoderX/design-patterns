package com.acoderx.design.strategy;

/**
 * Created by xudi on 2017/7/11.
 */
public class Client {
     public static void main(String[] args){
         Context context = new Context();
         StrategyInterface strategy1 = new ConcreteStrategyA();
         context.setStrategy(strategy1);
         context.method();
         StrategyInterface strategy2 = new ConcreteStrategyB();
         context.setStrategy(strategy2);
         context.method();
     }
}
