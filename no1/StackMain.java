package week8.no1;
import java.util.Scanner;

public class StackMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Stack stk = new Stack(5);
        char pilih;

        do{

            System.out.print("Jenis: ");
            String jenis = sc.nextLine();
            System.out.print("Warna: ");
            String warna = sc.nextLine();
            System.out.print("Merk: ");
            String merk = sc.nextLine();
            System.out.print("Ukuran: ");
            String ukuran = sc.nextLine();
            System.out.print("Harga: ");
            double harga = sc.nextDouble();
            
            Clothes c = new Clothes(jenis,warna,merk,ukuran,harga);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(c);
        
        } while (pilih == 'y');

        stk.print();
        stk.pop();
        stk.peek();
        stk.print();


        stk.getMin();

    }

}
