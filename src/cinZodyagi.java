import java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {/*Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun
Senaryo
Doğum Yılınızı Giriniz : 1990
Çin Zodyağı Burcunuz : At */
        Scanner input = new Scanner(System.in);
        System.out.println("Hosgeldiniz ");
        System.out.print("Dogum Yiliniz: ");
        int kalan;
        int dYili = input.nextInt();
        kalan = dYili % 12;
        if (kalan == 0) {
            System.out.println("Maymun");
        } else if (kalan == 1) {
            System.out.println("Horoz");
        }
        else if (kalan==2) {
            System.out.println("Kopek");
        }
        else if (kalan==3) {
            System.out.println("Domuz");
        }
        else if (kalan==4) {
            System.out.println("Fare");
        }
        else if (kalan==5) {
            System.out.println("Okuz");
        }
        else if (kalan==6) {
            System.out.println("Kaplan");
        }
        else if (kalan==7) {
            System.out.println("Tavsan");
        }
        else if (kalan==8) {
            System.out.println("Ejderha");
        }
        else if (kalan==9) {
            System.out.println("Yilan");
        }
        else if (kalan==10) {
            System.out.println("At");
        }
        else if (kalan==11) {
            System.out.println("Koyun");
        }
    }
}