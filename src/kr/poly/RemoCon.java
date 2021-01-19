package kr.poly;

public interface RemoCon { // 객체생성 X RemoCon r = new RemonCon(); XXXXX
    //final static 상수를 사용가능
    public static final int MAXCH = 100; // RemoCon.MAXCH
    public int MINCH = 1; // RemoCon.MINCH

    public abstract void chUp();
    public void chDown(); // abstract 묵시적으로 생략가능
    public void internet(); // 전혀 클래스가 없음
}
