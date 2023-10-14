import java.util.*;
public class Roman_Number_To_Integer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String romanNumber = sc.nextLine().toUpperCase();
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        int preValue = 0;
        for(int i=0;i<romanNumber.length();i++){
            int value = romanMap.get(romanNumber.charAt(i));
            if(value < preValue){
                result = result - value;
            }else{
                result = result + value;
            }
            preValue = value;
        }
        System.out.println(result);
        sc.close();

    }
}
