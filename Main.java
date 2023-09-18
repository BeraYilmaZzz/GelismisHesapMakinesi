import java.util.Scanner;
public class Main {
    static int plus(int a, int b) {
        int result = a + b;
        System.out.print("Toplama sonucu =" + result);
        return result;
    }
    static int mines(int a,int b){
        int result = a- b;
        System.out.print("Çıkarma sonucu =" +  result);
        return result ;
    }
    static int times(int a, int b){
        int result = a*b;
        System.out.print("Çarpma sonucu =" + result );
        return result;
    }
    static int divided(int a, int b){
        if ( b == 0){
            System.out.print("Lütfen böleni 0 ' dan farklı bir sayı olarak giriniz !!");
            return 0 ;
        }
        int result = a / b ;
        System.out.print("Bölme sonucu = " + result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for ( int i =1 ; i<=b ; i++ ) {
            result *= a;
        }
        return result;
    }
    static int mod(int a, int b){
        int result = a % b;
        System.out.println("MOD sonucu = "+  result);
        return result;
    }
    static int calculate(int a, int b){
        System.out.println("ALAN = " + a*b);
        System.out.println("ÇEVRE = " + 2 * (a+b));
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select ,firstvalue,secondvalue;
        String menu = " 1 - Toplama\n "
                + "2 - Çıkarma\n "
                + "3 - Çarpma\n "
                + "4 - Bölme\n "
                + "5 - Üslü sayı\n "
                + "6 - Mod alma\n "
                + "7 - Dikdörtgen alan ve çevre\n "
                + "0 - Çıkış " ;
        System.out.println(menu);
        while(true){
            System.out.print("\nBir işlem seçiniz =");
            select = scan.nextInt();
            if(select == 0){
                System.out.println("ÇIKIŞ YAPILMIŞTIR");
                break;
            }
            System.out.print("İşlem yapmak istediğiniz ilk değeri giriniz =");
            firstvalue = scan.nextInt();
            System.out.print("İşlem yapmak istediğiniz ikinci değeri giriniz =") ;
            secondvalue=scan.nextInt();
            switch(select){
                case 1 :
                    plus(firstvalue,secondvalue);
                    break;
                case 2 :
                    mines(firstvalue,secondvalue);
                    break;
                case 3 :
                    times(firstvalue,secondvalue);
                    break;
                case 4 :
                    divided(firstvalue,secondvalue);
                    break;
                case 5 :
                    power(firstvalue,secondvalue);
                case 6 :
                    mod(firstvalue,secondvalue);
                    break;
                case 7 :
                    calculate(firstvalue,secondvalue);
                    break;
            }
        }
    }
}

