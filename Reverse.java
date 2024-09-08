public class Reverse {
    public static void main(String[] args) {
        String originalString="hello";
        String reversedString="";
        System.out.println(" originalstring = " + originalString);
        for(int i=0;i<originalString.length();i++)
        {
            reversedString= originalString.charAt(i) + reversedString;}
            System.out.println("reversedString =" + reversedString);
        

    }
    
}
