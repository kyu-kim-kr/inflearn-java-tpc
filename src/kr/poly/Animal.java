package kr.poly;

public abstract class Animal extends Object { // 추상클래스 (불온전한, 장애객체)
    // Animal ani = new Animal(); X

    public abstract void eat();
    public void move() { //구현메소드 넣ㅁ을수있음
        System.out.println("무리를 지어서 이동한다");
    }

}
