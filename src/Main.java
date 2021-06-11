import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95 ,patlican=5.00;
        double kg,toplam;
        System.out.println("Alınan Armut Kilogramı: ");
        kg= input.nextDouble();
        armut*=kg;
        System.out.println("Alınan Elma Kilogramı: ");
        kg= input.nextDouble();
        elma*=kg;
        System.out.println("Alınan Domates Kilogramı: ");
        kg= input.nextDouble();
        domates*=kg;
        System.out.println("Alınan Muz Kilogramı: ");
        kg = input.nextDouble();
        muz*=kg;
        System.out.println("Alınan Patlican Kilogramı: ");
        kg= input.nextDouble();
        patlican*=kg;
        toplam=armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutar: "+toplam+ "Tl");
    }
}