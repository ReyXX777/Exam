public class Count {
    public static void main(String[] args) {
        String words="ont two three four five";
        int countwords = words.split("\\s").length;
        System.out.println(countwords);
    }
}
