package com.melnikov.spring.AOP.aspects;

import com.melnikov.spring.AOP.Book;
import com.melnikov.spring.AOP.Magazine;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* com.melnikov.spring.AOP.UniversityLibrary.*(..))")
//    private void allMethodsFromUniLib(){}
//
//    @Pointcut("execution(public void com.melnikov.spring.AOP.UniversityLibrary.returnMagazine())")
//    private void returnMagazineFromUniLib(){}
//
//    @Pointcut("allMethodsFromUniLib() && !returnMagazineFromUniLib()")
//    private void allMethodsFromUniLibExceptReturnMagazine(){}
//
//    @Before("allMethodsFromUniLibExceptReturnMagazine()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: log#10");
//    }

//    @Pointcut("execution (* com.melnikov.spring.AOP.UniversityLibrary.get* ())")
//    private void allGetMethodsFromUniLib(){}
//
//    @Pointcut("execution (* com.melnikov.spring.AOP.UniversityLibrary.return* ())")
//    private void allReturnMethodsFromUniLib(){}
//
//    @Pointcut("allGetMethodsFromUniLib() || allReturnMethodsFromUniLib()")
//    private void allGetAndReturnMethodsFromUniLib(){}
//
//
//
//    @Before("allGetMethodsFromUniLib()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: log#1");
//    }
//
//    @Before("allReturnMethodsFromUniLib()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: log#2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLib()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: log#3");
//    }

    @Around("execution(* returnBook(..))")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around before");

        Object targetMethodResult = null;

        try {
            targetMethodResult = joinPoint.proceed();
        }

        catch (Exception e){
            System.out.println(e);
            throw e;
        }

        System.out.println("Around after");
        return targetMethodResult;
    }


//    @Before("com.melnikov.spring.AOP.aspects.MyPointCuts.allAddMethods()")
//    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//
//        if (signature.getName().equals("addBook")){
//            Object[] args = joinPoint.getArgs();
//            for(Object arg: args){
//                if (arg instanceof Book){
//                    Book tmpBook = (Book) arg;
//                    System.out.println("Book info: name - " + tmpBook.getName() + ", author - " + tmpBook.getAuthor() + ", year of pub - " + tmpBook.getYearOfPub());
//                }
//                else if (arg instanceof String){
//                    System.out.println("Adder: " + arg);
//                }
//            }
//            System.out.println("beforeGetBookAdvice: log of an attempt to get a book");
//        }
//
//        else if (signature.getName().equals("addMagazine")){
//            Object[] args = joinPoint.getArgs();
//            for(Object arg: args){
//                if (arg instanceof Magazine){
//                    Magazine tmpMagazine = (Magazine) arg;
//                    System.out.println("Magazine info: name - " + tmpMagazine.getName() + ", author - " + tmpMagazine.getAuthor());
//                }
//                else if (arg instanceof String){
//                    System.out.println("Adder: " + arg);
//                }
//            }
//            System.out.println("beforeGetBookAdvice: log of an attempt to get a magazine");
//        }
//
//        System.out.println("-----------------------------------------");
//    }






//    //Write in log.txt
//    @Before("allAddMethods()")
//    public void beforeGetLoggingAdvice(){
//        try {
//            Path logPath = Path.of("src", "main", "logs", "mainLog.txt");
//            Files.writeString(logPath, "beforeGetBookAdvice: log of an attempt to get a book/magazine. At date and time: "
//                    + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n", StandardOpenOption.APPEND);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


}
