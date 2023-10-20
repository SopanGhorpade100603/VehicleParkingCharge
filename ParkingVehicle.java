import java.util.Scanner;
public class ParkingVehicle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("*** WELCOME ***\nEnter your Vehicle Number");
        String ch=sc.next();
        int num=sc.nextInt();
        System.out.println(ch+" "+num);
        System.out.println("Choose your vehicle");
        System.out.println("1.Two Wheeler");
        System.out.println("2.Three Wheeler");
        System.out.println("3.Four Wheeler");
        System.out.println("4.Eight Tyres");
        System.out.println("5.Ten Tyres");
        System.out.println("6.Twelve Tyres");
        System.out.println("7.Fourteen tires");

        int Choose=sc.nextInt();

        switch(Choose){
            case 1:
                System.out.println("you choose Two Wheeler \n parking fees is 20$");
                break;
            case 2:
                System.out.println("you choose Three Wheeler \n parking fees is 30$");
                break;
            case 3:
                System.out.println("you choose Four Wheeler \n parking fees is 50$");
                break;
            case 4:
                System.out.println("you choose Eight tyre \n parking fees is 80$");
                break;
            case 5:
                System.out.println("you choose Ten Tyre \n parking fees is 100$");
                break;
            case 6:
                System.out.println("you choose Twelve tyre \n parking fees is 120$");
                break;
            case 7:
                System.out.println("you choose Fourteen tyre \n parking fees is 150$");
                break;
            default:
                System.out.println("Invalid choose");

        }
    }
}
