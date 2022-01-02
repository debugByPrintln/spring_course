package com.melnikov.spring.IoCandDI.springWithJavaCode;

import com.melnikov.spring.IoCandDI.Cat;
import com.melnikov.spring.IoCandDI.Person;
import com.melnikov.spring.IoCandDI.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestConfig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
    }


    public static int diagonalDifference(List<List<Integer>> arr) {
        int mainD = 0;
        int reverseD = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j){
                    mainD+=arr.get(i).get(j);
                }
            }
        }
        for (int i = arr.size()-1; i != 0; i--) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == ((arr.get(i).size() - 1) - i)){
                    reverseD+=arr.get(i).get(j);
                }
            }
        }
        return Math.abs(mainD - reverseD);

    }


}
