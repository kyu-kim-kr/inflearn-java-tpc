package kr.tpc;

public class Cat extends Animal {
    @Override //오버라이드라는 어노테이션기호가나오면서
    public void eat() {
        System.out.println("고양이 처럼 먹다.");
    }

    public void night() {
        System.out.println("밤에 눈에서 빛이난다");
    }
}
