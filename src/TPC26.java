import kr.poly.*;

public class TPC26 {
    public static void main(String[] args) {
// 인터페이스의 강력한기능은 구현된걸 몰라도 리모컨을 가지고 다 작동시킬수있따
//        RemoCon r = new RemoCon();

        RemoCon r = new TV();
        r.chUp();
        r.chDown();
        r.internet();
        //동작될지안될지 저언혀 의심할필요없다

        r = new Radio();
        r.chUp();
        r.chDown();
        r.internet();
        //동작될지안될지 저언혀 의심할필요없다

    }
}
