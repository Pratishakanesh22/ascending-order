import java.util.*;

public class order {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int number[]= new int[size];
//input
for(int i =0; i<size; i++){
    number[i]= sc.nextInt();
}
boolean isAscending = true;

for(int i= 0; i<number.length-1; i++){
    //condition for aseending
    if(number[i]>number[i+1]){
//condition for decending
isAscending= false;
    }
}
if(isAscending){
    System.out.println("Sorted ascending");
}else{
    System.out.println("unsorted");
}
    }
}
