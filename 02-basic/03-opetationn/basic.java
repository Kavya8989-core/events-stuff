import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int totalBill;
        int totalPpls=7;
        System.out.println( "Total bill ");
        totalBill = kb.nextInt();
        System.out.println("Each frnd will pay "+(double)totalBill/totalPpls);

    }
}