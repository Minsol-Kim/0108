package org.example.calc;

public class Calc1 {

    //f(x)=>y 에 해당
    public static int plus(int x, int y){

        // 변수가 매번 동일하게 실행 -> 변수 생성
        int result = x+y;

        return result;

    }
    //static이 붙으면 무조건 클래스

    //주사위 함수
    public static int roll(){
        int result = 0;
        result = (int)(Math.random()*6)+1;


        return result;

    }
}
