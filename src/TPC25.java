import kr.poly.*;

public class TPC25 {
    public static void main(String[] args) {
        // eat() ---override--> eat()
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
        ((Cat)ani).night();
    }
}
