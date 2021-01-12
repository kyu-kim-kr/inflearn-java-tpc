import kr.tpc.BookVO;
public class TPC11 {
    public static void main(String[] args) {
        //책 1권을 저장하기 위해 객체를 생성하시오.
        BookVO b = new BookVO();
        b.title = "동규";
        b.price = 299400;
        b.company = "Kyu";
        b.page = 900;

        System.out.print(b.title + "\t");
        System.out.print(b.price + "\t");
        System.out.print(b.company + "\t");
        System.out.println(b.page + "\t");

        BookVO b1 = new BookVO();
        b1.title = "오라클";
        b1.price = 23030;
        b1.company = "KKY";
        b1.page = 560;

        System.out.print(b1.title + "\t");
        System.out.print(b1.price + "\t");
        System.out.print(b1.company + "\t");
        System.out.println(b1.page + "\t");

    }
}
