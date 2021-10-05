package com.daley.maven04.demo;
import java.util.Scanner;

public class Calc {
    public static int add(int a,int b){

        return a+b;

    }
    public static int subtract( int a, int b){
            return a + b;
        }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数");

        int a = scanner.nextInt();

        System.out.println("请输入第二个数");

        int b = scanner.nextInt();

        System.out.println("和为:"+add(a,b));
        System.out.println("差为:"+subtract(a,b));

    }
//    public static void main(String[] args) {
//
//
//    public add( int a, int b){
//            return a + b;
//        }
//    public subtract( int a, int b){
//            return a + b;
//        }
    }

