package kr.poly;

import java.lang.*;

public class A extends Object {

    public A() {
        super();
    }

    public void display() {
        System.out.println("나는 A이다");
    }

    //toString()재정의


    @Override
    public String toString() {
        return "재정의된 메소드입니다";
    }
}
