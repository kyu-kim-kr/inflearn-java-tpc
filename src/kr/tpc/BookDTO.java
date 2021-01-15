package kr.tpc;

public class BookDTO {
    public String title;
    public int price;
    public String company;
    public int page;

    public BookDTO(String title, int price, String company, int page) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.page = page;
    }
    // 디폴트 생성자 메소드(생략)

//        super(); 이것두 생략
    //생성자에서 객체를 생성하는 작업을 한다 (기계어코드)
}

