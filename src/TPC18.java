import com.google.gson.Gson;
import kr.tpc.BookVO;

public class TPC18 {
    public static void main(String[] args) {
        Gson g = new Gson();
        BookVO vo = new BookVO("자바", 13000, "큐", 800);
        String json = g.toJson(vo);
        // {"title":"자바","price":13000,"company":"큐","page":800}
        System.out.println(json);
    }
}
