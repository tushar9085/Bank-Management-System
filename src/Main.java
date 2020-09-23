import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ina = new Scanner(System.in);
        Bank bank = new Bank();

        int check;



        while(true){
            System.out.println("Do you have any Account?\n1.yes\n2.no");
            bank.bankStatus();
            check = ina.nextInt();
            if(check == 1){
                bank.processAccount();
            }
            else if(check == 2){
                bank.addAccount();
            }
            else if(check == 3){
                break;
            }
        }

    }

}
