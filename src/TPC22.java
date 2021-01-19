import kr.tpc.*;

public class TPC22 {
    public static void main(String[] args) {
        // upcasting
        //Cat ani = new Cat();
        // Object ani = new Cat();
        Animal ani = new Cat(); // upcasting
        ani.eat(); // 컴파일시점 -> Anumal, 실행시점->Dog


//        Cat c = (Cat)ani; // downcasting
//        c.night();
//        (Cat)ani.night(); 우선순위가 쩜이 더 우선순위
        ((Cat)ani).night(); //

        ani = new Dog();
        ani.eat();
        // 다형성
        // 상위클래스가 하위클래스에게 동일한 메세지로 서로 다르게 동작시키는 원리.

        Object o = new Dog();
        ((Dog)o).eat();

    }
}
