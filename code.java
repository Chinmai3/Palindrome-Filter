//program to filter out palindrome numbers using filter method in stream ArithmeticException
import java.util.*;
import java.util.stream.Collectors; 
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(sc.hasNextInt())
        {
            al.add(sc.nextInt());
        }
        System.out.println(al.stream().filter(ele->isref(ele)).map(ele->ele).collect(Collectors.toList()));
    }
    static boolean isref(int ele)
    {
        int temp=ele;
        int rev=0,rem;
        while(ele>0)
        {
            rem=ele%10;
            rev=(rev*10)+rem;
            ele/=10;
        }
        if(rev==temp)
        {
            return true;
        }
        else{
            return false;
        }
    }
        
    }
