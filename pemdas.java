import java.io.*;
import java.util.*;

public class pemdas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double xdriver, ydriver, xpass, ypass, total, jarak1, harga, harga1, hargaa;
        String x1,x2;
        System.out.print("Masukkan koordinat pengojek : ");
        x1 = input.nextLine();
        xdriver = Double.parseDouble(x1.substring(2, 3));
        ydriver = Double.parseDouble(x1.substring(4, 5));
         System.out.print("Masukkan koordinat penumpang: ");
        x2 = input.nextLine();
        xpass = Double.parseDouble(x2.substring(2, 3));
        ypass = Double.parseDouble(x2.substring(4, 5));
        total = xdriver + ydriver + xpass + ypass;
        jarak1 = Math.sqrt(Math.pow(Math.abs(xdriver-xpass),2)+Math.pow(Math.abs(ydriver-ypass),2));
        if (total%2 == 0){
            harga = Math.ceil(jarak1)*2000;
            harga1 = harga * 75/100;
            hargaa = harga + harga1;
            System.out.printf("Total biaya untuk %.0fkm adalah Rp%.0f",jarak1,hargaa);
        }
        else {
            harga = Math.floor(jarak1)*2000;
            harga1 = harga * 75/100;
            hargaa = harga + harga1;
            System.out.printf("Total biaya untuk %.0fkm adalah Rp%.0f",jarak1,hargaa);
        }
    }
}
