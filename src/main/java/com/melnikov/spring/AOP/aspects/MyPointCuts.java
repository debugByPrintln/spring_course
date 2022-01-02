package com.melnikov.spring.AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    //For all set methods with any params
    @Pointcut("execution(* set11*(..))")
    public void allSetMethods(){}

    //For all get methods with any params
    @Pointcut("execution(* add11*(..))")
    public void allAddMethods(){}
}
