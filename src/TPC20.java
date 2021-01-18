import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
    public static void main(String[] args) {
//Animal 부모클래스를 사용하지 않음
        //상속의 이점을 사용하지않음

       Dog d = new Dog();
       // 자동 형변환
        // Object casting
        // Upcasting
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();

        // Dog.class, Cat.class
        Animal ani = new Dog ();
        ani.eat(); // ?
        // 이부분이 신기한거다
        // Dog의 eat을 몰라도 ani를 통해서 쓸수있따
        ani = new Cat();
        ani.eat();
//        ani.night(); //불가능

        ((Cat) ani).night(); // downcasting
    }
}
