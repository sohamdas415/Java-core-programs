import java.util.*;
class Happy{
    int n;
    Happy(){
        n=0;
    }
    void getnum(int nn){
        n=nn;
    }
    int sum_sq_digits(int x){
        if(x==0)
        return 0;
        int d=x%10;
        return(d*d)+sum_sq_digits(x/10);
    }
    void ishappy(){
        int num=n;
        while(num>9){
            num=sum_sq_digits(num);
        }
        if(num==1){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not Happy Number");
        }
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int z=sc.nextInt();
        Happy obj=new Happy();
        obj.getnum(z);
        obj.ishappy();
        }
    }
