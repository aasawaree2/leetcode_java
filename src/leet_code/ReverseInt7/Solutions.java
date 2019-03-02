package leet_code.ReverseInt7;

public class Solutions {
    public int reverse(int x) {
        int result=0;
        int temp;
        while(x!=0){
            temp = result * 10 + (x%10);
            if ((temp-(x%10))/10!=result){
                return 0;
            }
            result = temp;
            x/=10;
        }
        return result;
    }

    public int reverse2(int x) {
        if(x==Integer.MIN_VALUE){
            return 0;
        }
        int result=0;
        int maxVal = Integer.MAX_VALUE;
        int sign = 1;
        if(x<0){
            sign = -1;
            x = x * -1;
        }
        while(x>=10){
            result = result * 10 + x % 10;
            x = x /10;
        }
        if ((result > maxVal/10) ||(result > maxVal/10 && x%10>7)){
            return 0;
        }
        else{
            result = result * 10 + x % 10;
        }

        return result*sign;
    }

    public static void main(String[] args)
    {
        String a = null;
        Solutions solutions = new Solutions();
        System.out.println(solutions.reverse2(-2147483648));
        System.out.println(solutions.reverse(123));
    }
}