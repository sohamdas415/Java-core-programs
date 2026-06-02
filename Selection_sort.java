import java.util.*;
public class Selection_sort{
    public static void main(String args[]){
        int i,j,t,min;
        int num[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number in the array");
        for(i=0;i<10;i++){ 
            num[i]=sc.nextInt();
        }
        for(i=0;i<9;i++){
            min=i;
            for(j=i+1;j<10;j++){
                if(num[j]<num[min])
                min=j;
            }
            t=num[i];
            num[i]=num[min];
            num[min]=t;
        }
        System.out.println("numbers arranged in ascending order :");
        for(i=0;i<10;i++)
        System.out.println(num[i]);
    }
}
