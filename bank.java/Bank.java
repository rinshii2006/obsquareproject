import java.util.Scanner;
public class Bank {
   
        long accno;
        String ifsc;
        int custid;
        double minbalance;
        void displaydetails(){
            System.out.println("ACOUNT NUMBER: "+accno);
            System.out.println("IFC CODE: "+ifsc);
            System.out.println("CUSTOMER ID: "+custid);
            System.out.println("MINIMUM BALANCE: "+minbalance);
        }
    
public static void main(String []args){
Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        System.out.print("Enter Account Number: ");
        b.accno = sc.nextLong();

        System.out.print("Enter IFSC Code: ");
        b.ifsc = sc.next();

        System.out.print("Enter Customer ID: ");
        b.custid = sc.nextInt();

        System.out.print("Enter Minimum Balance: ");
        b.minbalance = sc.nextDouble();

        b.displaydetails();
    }
}

