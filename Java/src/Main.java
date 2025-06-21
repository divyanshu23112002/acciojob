import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();



        //write code here
        for(int i=1;i<=N;i++){
            int num=i;
            int og=num;
            int sum=0;
            //int digit=Integer.toString(num).length();
            num=og;

            while(num>0){
                int d=num%10;
                sum+=d*d*d;
                num/=10;

                //System.out.println();

            }
            if(sum==og) {System.out.println(og);}
        }

    }
}
