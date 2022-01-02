package com.melnikov.spring.AOP.aspects;

import com.melnikov.spring.AOP.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Pointcut("execution(* getStudents*(..))")
    private void getStudsMethod(){}

//    @Before("getStudsMethod()")
//    public void beforeGetStudsLogAdvice(){
//        System.out.println("Before log advice");
//    }

    @After("getStudsMethod()")
    public void afterAdvice(){
        System.out.println("after advice");
    }

//    @AfterThrowing(pointcut = "getStudsMethod()", throwing = "e")
//    public void afterThrowingAdvice(Throwable e){
//
//        System.out.println("Exception" + e);
//    }

//    @AfterReturning(pointcut = "getStudsMethod()", returning = "students")
//    public void afterReturning(JoinPoint joinPoint, List<Student> students){
//        Student student = students.get(0);
//
//        student.setFullName("Mr." + student.getFullName());
//        student.setAvgGrade(student.getAvgGrade() + 1);
//        System.out.println(joinPoint.getSignature().getName());
//        System.out.println("After log advice");
//    }

}
