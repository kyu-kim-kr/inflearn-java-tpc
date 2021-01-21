package kr.tpc;

public class JavaMySQL implements Dbconnect {

    @Override
    public void getConnection(String url, String user, String passwd) {
        System.out.println("MySQL DB가 접속이 됩니다.");
        //각벤더에서 각드라이버를 다운받아야한다 이런클래스를 자바에서 드라이버클래스라고 한다.
        //하나가아니고 여러개의 클래스로 jar파일로 배포가 된다.
    }
}
