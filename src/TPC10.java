import kr.tpc.BookDTO;

public class TPC10 {
    public static void main(String[] args) {
        // int, float, char, boolean -> PDT
        int a;
        a = 10;
        // 책(BookDTO)이라는 자료형을 만들자. --> class
        BookDTO b = new BookDTO();
        b.title="자바";
        b.price=17000;
        b.company="Kyu";
        b.page=952;

        System.out.print(b.title+"\t");
        System.out.print(b.price+"\t");
        System.out.print(b.company+"\t");
        System.out.print(b.page+"\t");



    }//b는 만들어졌고 b는 그 메모리를 가르켜야한다
}
