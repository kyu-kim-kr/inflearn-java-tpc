import kr.tpc.BookVO;

public class TPC12 {
    public static void main(String[] args) {
        // 생성자 -> 생성+초기화 - > 중복정의
        BookVO b1 = new BookVO();
        System.out.print(b1.title+"\t");
        System.out.print(b1.price+"\t");
        System.out.print(b1.company+"\t");
        System.out.println(b1.page+"\t");

        BookVO b2 = new BookVO();
        System.out.print(b1.title+"\t");
        System.out.print(b1.price+"\t");
        System.out.print(b1.company+"\t");
        System.out.println(b1.page+"\t");

        BookVO b3 = new BookVO("Python", 18000, "큐큐", 920);
        System.out.print(b1.title+"\t");
        System.out.print(b1.price+"\t");
        System.out.print(b1.company+"\t");
        System.out.println(b1.page+"\t");
    }
}
