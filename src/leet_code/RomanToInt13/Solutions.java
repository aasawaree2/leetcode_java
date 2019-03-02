package leet_code.RomanToInt13;

import java.util.HashMap;

public class Solutions {
    public int romanToInt(String s) {
        HashMap<Character,Integer> romans = new HashMap<Character,Integer>();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);
        char[] input = s.toCharArray();
        int result = 0, i;
        for(i=0;i<input.length-1;i++){
            if(romans.get(input[i])<romans.get(input[i+1])){
                result -= romans.get(input[i]);
            }
            else{
                result += romans.get(input[i]);
            }
        }
        return result+romans.get(input[input.length-1]);
    }
    public static void main(String[] args){
        Solutions solutions = new Solutions();
        solutions.romanToInt("LVIII");
    }
}
