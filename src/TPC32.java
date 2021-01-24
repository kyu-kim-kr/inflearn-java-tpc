import kr.tpc.Dbconnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {
    public static void main(String[] args)  {
        //Orcale, MySL -> Driver class
        Dbconnect conn = new JavaOracle();
        conn.getConnection("url", "kyu", "12345");

        conn = new JavaMySQL();
        conn.getConnection("url", "mysqlKyu", "12345");

        String str1 = "asd";
        String str2 = "asd";
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

        String str3 = new String("asd");
        String str4 = new String("asd");
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);
    }
}
