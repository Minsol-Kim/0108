package org.example;

import org.example.lotto.LottoBall;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     LottoBall b1 = new LottoBall(10); //값 10을 주지않으면 제대로 동작하지 않음 ->제약조건 걸어둠

    System.out.println(b1);


    }
}