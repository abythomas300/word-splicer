import java.util.Scanner;
class WordSplicer{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a sentence: ");
            String word=sc.nextLine();
            for(int i=0;i<word.length();i++){
                System.out.println(word.charAt(i));
            }
        }
    }
}
