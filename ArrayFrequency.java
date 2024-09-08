import java.util.Scanner;
public class ArrayFrequency {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] arr = new int[size];
        int [] fr = new int[size];
        int visited = -1;
        System.out.println("enter the elements of the array");
        for (int i=0;i<size;i++){
            arr[i]= in.nextInt();

        }
        for (int i = 0; i<size;i++){
int count = 1;
for (int j = i+1;j<size;j++){
    if (arr[i]==arr[j]){
        count ++;
        fr[j]=visited;
    }
}
if (fr[i]!=visited){
    fr[i]=count;
}
        }

    
System.out.println(".......................");
System.out.println(" elements | frequency");
for (int i =0;i<size;i++){
    if (fr[i]!=visited){
        System.out.println(arr[i] + " |" + fr[i]);
    }
}



        System.out.println("........................");
        in.close();
    }
    
    
}
