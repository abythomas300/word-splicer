import java.util.Scanner;
public class BestFan{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String name[]=new String[5];
        int position[]=new int[5]; 
        System.out.println("Enter the names of  fans:\n(REMINDER:You are only allowed to enter the names of 5 fans.)");
        for(int i=0;i<name.length;i++){
         name[i]=sc.nextLine(); 
        }
        for(int b=0;b<position.length;b++){
            System.out.println("Enter the position of "+name[b]+":");
            position[b]=sc.nextInt();
        }
        //(bubble sorting 'position' array.)
        //(strings inside 'name' is array also sorted.)
        for(int k=0;k<name.length-1;k++){
            for(int l=0;l<name.length-1-k;l++){
                if(position[l]>position[l+1]){
                    int tempN=position[l+1];     //(swapping 'position' array vlaues.)
                    position[l+1]=position[l];
                    position[l]=tempN;

                    String tempS=name[l+1];
                    name[l+1]=name[l];
                    name[l]=tempS;
                }
            }
        }
        System.out.println("SORTED ORDER: ");
        for(int p=0;p<name.length;p++){
            System.out.print(name[p]+" ");
            System.out.print(position[p]+"  ");
        }
    int largest_pos=position[position.length-1];
    String largest_name=name[name.length-1];
    System.out.print("\n\nThe best fan is ");
    System.out.print(largest_name+" who has a fan point of "+largest_pos+".");
    sc.close();
}
//[This program is written as a solution to the problem sited below.]
//https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/the-best-player-1/
}
