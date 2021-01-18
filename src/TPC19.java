import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
    public static void main(String[] args) {
        // Dog, Cat --> Animal

        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();

        //만약에 dog와 cat의 api를 나한테줬따
        //Dog.java(X), Dog.class(o)

        Dog dd = new Dog();
        dd.eat();

        // IDE의 도움을 받아서 클래스파일만으로도 도움을 받아서
        // 써먹을수있찌만 터미널이나 메모장에서 한다면? 모른다.
        // 그러니까 제약사항이 많다.
        // 그러면 소스파일을 주면 기밀사항이 다 노출되니까..
        // 리모컨을 만들어줘야한다

        //Aniamal <----[Dog.class, Cat.class]

        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();


    }
}
