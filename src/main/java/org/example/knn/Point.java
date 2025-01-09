package org.example.knn;

public class Point {

    public String type; // J/Z
    public int xpos;
    public int ypos;


    //생성자 함수
    public Point(String type, int xpos, int ypos) {

        System.out.println("AAAA");

        this.type = type; //this -> 객체의 인스턴스를 가르킴,
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public Point(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }


}
