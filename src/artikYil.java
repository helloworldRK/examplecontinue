import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        //Artık Yıl Nasıl Hesaplanır Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
        int yil, kalan = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Yil Giriniz: ");
        yil = input.nextInt();
        if(yil%100==0)
        {
            if(yil%400==0)
            {
                System.out.print(yil+" Artik yildir");
            }
            else
            {
                System.out.print(yil+" Artik yil degildir");
            }
        }
        else if(yil%4==0)
        {
            System.out.print(yil+" Artik yildir");
        }
        else
        {
            System.out.print(yil+" Artik yil degildir");
        }
    }
}