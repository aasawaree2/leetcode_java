package leet_code.PalindromeNumber9;

public class Solutions {
    public boolean isPalindrome(int x) {
        int reverse=0;
        if((x%10==0 && x!=0) || x<0){
            return false;
        }
        while(x>reverse){
            reverse = reverse *10 + x%10;
            x/=10;
        }
        return x==reverse || x==reverse/10;
    }

    public static void main(String[] args){
        Solutions solutions = new Solutions();
        System.out.println(solutions.isPalindrome(12321));
        System.out.println(solutions.isPalindrome(123));
    }
}
