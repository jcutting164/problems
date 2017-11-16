import java.util.Scanner;
import java.util.ArrayList;
public class Triangular {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int input = 0;
        while(input<1 || input>2000000000){
            System.out.println("Enter a valid number: ");
            input = scan.nextInt();
        }
        ArrayList<Integer> num = new ArrayList<Integer>();
        int sum=0;
        while(sum<input){
            sum++;
            num.add(sum);
            int temp = 0;
            for(int i=0; i<num.size(); i++){
                temp = temp+ num.get(i);
            }
            if(temp==input){
                System.out.println("Amount of rows: "+num.size());
                break;
            }if(temp>input){
                System.out.println("Not a triangular number");
                break;
            }
        }

    }


}
