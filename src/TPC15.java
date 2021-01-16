import kr.tpc.MemberVO;

public class TPC15 {
    public static void main(String[] args) {

        MemberVO m = new MemberVO("홍갈동", 40, "010-1111-1111", "서울");
        // setter methood - X -> 생성자에서 바로 정했기떄문에

        System.out.println(m.toString());

        MemberVO m1 = new MemberVO();
        m1.setName("나길동");
        m1.setAge(34);
        m1.setTel("010-2222-2222");
        m1.setAddr("광주");
        System.out.println(m1.getName()+"\t");
        System.out.println(m1.getAge()+"\t");
        System.out.println(m1.getTel()+"\t");
        System.out.println(m1.getAddr()+"\t");

        System.out.println(m1);
    }
}
