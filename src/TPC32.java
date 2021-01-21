import kr.tpc.Dbconnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {
    public static void main(String[] args) {
        //Orcale, MySL -> Driver class
        Dbconnect conn = new JavaOracle();
        conn.getConnection("url", "kyu", "12345");

        conn = new JavaMySQL();
        conn.getConnection("url", "mysqlKyu", "12345");
    }
}
