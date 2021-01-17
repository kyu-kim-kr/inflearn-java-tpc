import kr.tpc.OverLoad;

public class TPC16 {
    public static void main(String[] args) {
        OverLoad ov = new OverLoad();
        ov.hap(20, 50); // hap_int_int
        ov.hap(20f, 50); // hap_float_int
        ov.hap(20f, 50f); // hap_float_float
    }

}
