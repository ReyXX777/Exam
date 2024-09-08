public class Format {
    public static void main(String[] args) {
        String str =" hello %s! one kilobyte is %d bytes";
        String result = String.format(str, "world",1024);
        System.out.println(result);
        String result1 = String.format("%2$,3.2f %1$s","metres",1260.45254);
        System.out.println(result1);

    }
}
