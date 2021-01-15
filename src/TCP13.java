import kr.tpc.BookDTO;

public class TCP13 {
    public static void main(String[] args) {
        // 책 -> class (BookDTO) -> 객체 -> 인스턴스
        String title = "스프링";
        int price = 25000;
        String company = "Kyu";
        int page = 890;

        BookDTO dto; // dto (객체)
        dto = new BookDTO(title, price, company, page);
// 메모리 바구니 안에 담았으니까 초기화했으니까 다른 곳으로 옮겨보자

        bookPrint(dto); // dto가 bookPrint로 넘어갔으니
        // title, price, company, page도 bookPrint로 넘어갔다는말

    }
    public static void bookPrint(BookDTO dto) { // 여기로 책을 옮겨보자
        //클래스를 메소드 안에 넣었다?
        // 왜 굳이 이렇게 사용하지? 예제를 봤으면 좋겠는데..
        System.out.println(dto.title+"\t");
        System.out.println(dto.price+"\t");
        System.out.println(dto.company+"\t");
        System.out.println(dto.page+"\t");
    }
}
