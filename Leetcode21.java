import java.util.Scanner;
public class Leetcode21 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        System.out.println("enter the num of rows");
        int rows = in.nextInt();
        String modified = modify(str,rows);
        System.out.println("the modified string is" + modified);

    }
    public static String modify(String str,int rows){
        if(rows == 0 ) return str;
        StringBuilder[] entry = new StringBuilder[rows];
        for(int i=0;i<rows;i++) entry[i] = new StringBuilder();
int index = 0;
boolean goingdown = false;
for(char c : str.toCharArray()){
    entry[index].append(c);
    if(index==0||index ==rows - 1) goingdown = !goingdown;
    index += goingdown?1:-1;



}
StringBuilder string = new StringBuilder();
for(StringBuilder row:entry) string.append(row);
return string.toString();
    }
}
