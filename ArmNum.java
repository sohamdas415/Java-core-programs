import java.util.*;
public class ArmNum{
    int n;
    int l;
    ArmNum(int nn){
        n=nn;
        l=0;
    }
    int sum_pow(int i){
        if(i==0)
        return 0;
        else
        return (int)Math.pow(i%10,1)+sum_pow(i/10);
    }
    void isArmStrong(){
        if(sum_pow(n)==n)
        System.out.println("It is an Armstrong number");
        else
        System.out.println("It is not an armstrong number ");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int x=sc.nextInt();
        ArmNum obj=new ArmNum(x);
        obj.isArmStrong();
    }
}
