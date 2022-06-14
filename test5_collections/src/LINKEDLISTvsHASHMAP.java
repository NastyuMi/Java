import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.LinkedList;

public class LINKEDLISTvsHASHMAP {

    private static LocalDateTime go;
    private static LocalDateTime stop;
    public static double RESULT;

    private static void GO() {
        go = LocalDateTime.now();
    }

    private static void STOP() {
        stop = LocalDateTime.now();
    }

    private static void RESULT(String collection) {
        RESULT = ChronoUnit.MILLIS.between(go, stop);
        System.out.println(collection + " " + RESULT + " (ms)");
    }


    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        HashMap  hashMap = new HashMap();

        GO();
        for (int i=0; i<1000001; i++)
        {
            linkedList.add(i);
        }
        STOP();
        RESULT("LinkedList");

        GO();
        for (int i=0; i<1000001; i++)
        {
            hashMap.put("new",i);
        }
        STOP();
        RESULT("HashMap");

    }
}
