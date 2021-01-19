package kr.tpc;

public class Dog extends Animal {
    //이름, 나이 종: 상태정보
    //행위정보 위주로해보자
    //재정의 (OverridE)
    public void eat() {
        System.out.println("개처럼먹다.");
    }

    public Dog() {
        super(); // new Animal();;
    }
}
