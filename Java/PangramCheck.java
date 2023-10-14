import java.util.*;
public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int count = 0;
        for(int i=0;i<sentence.length();i++){
            if(Character.isLetter(sentence.charAt(i))){
                count++;
            }
        }
        if(count == sentence.length()){
            System.out.println("Sentence is a Panagram");
        }else{
            System.out.println("Sentence is not a panagram");
        }
        sc.close();
    }
}
