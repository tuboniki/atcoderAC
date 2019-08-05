import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        ArrayList deta = new ArrayList<Integer>();
        deta.add(0);
        int result = 1;
        while(true){
            if(deta.indexOf(s) != -1){
                System.out.println(result);
                return;
            }else{
                if(s%2==0){
                    s = (int)(s/2);
                }else{
                    s = s*3+1;
                }
            }
            result++;
        }
    }
}