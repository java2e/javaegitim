package game.tr;

import java.util.Scanner;

public class Tahta {

    private int oyunMatrisi[][];

    private Oyuncu oyuncular [];

    public Tahta(int satir,int sutun) {

        oyunMatrisi = new int[satir][sutun];
        // rastegele 1 ila 9 arasında sayı matrıs verdi
        for(int i=0;i<satir;i++)
            for(int j=0;j<sutun;j++) {
                oyunMatrisi[i][j] = ((int)(Math.random()*9))+1;
            }

        oyuncular = new Oyuncu[2];
        Oyuncu oyuncu1 =new Oyuncu("A",0,0);
        oyunMatrisi[0][0] = 0;
        oyuncular[0] = oyuncu1;

        Oyuncu oyuncu2 = new Oyuncu("B",satir-1,sutun-1);
        oyunMatrisi[satir-1][sutun-1] = 0;
        oyuncular[1] = oyuncu2;

    }

    public boolean oyunBittiMi() {

        for(int i=0;i<oyunMatrisi.length;i++) {
            for(int j=0;j<oyunMatrisi[i].length;j++) {
                if(oyunMatrisi[i][j] !=0)
                {
                    return true;
                }
            }
        }

        return false;

    }


    public void tahtayiYazdir()
    {


        for(int i=0;i<oyunMatrisi.length;i++) {

            for(int j=0;j<oyunMatrisi[i].length;j++) {

                if(oyuncular[0].getX() == i && oyuncular[0].getY() == j)
                    System.out.print(oyuncular[0].oyuncuAdi+" ");
                else if(oyuncular[1].getX() == i && oyuncular[1].getY()==j)
                    System.out.print(oyuncular[1].oyuncuAdi+" ");
                else
                    System.out.print(oyunMatrisi[i][j] +" ");
            }

            System.out.println();

        }

        System.out.println(oyuncular[0].oyuncuAdi+" : "+oyuncular[0].getToplamPuan());
        System.out.println(oyuncular[1].oyuncuAdi+" : "+oyuncular[1].getToplamPuan());

    }


    public void oynuOynat() {
        Scanner scanner = new Scanner(System.in);

        boolean change = true;

        while (oyunBittiMi()) {

            if(change) {  // A oyuncusu oynacak

                System.out.println("A, Bir yön seçiniz :");
                String yon = scanner.nextLine();
                oyuncular[0].hareketEt(yon.charAt(0),oyunMatrisi.length,oyunMatrisi.length);

                oyuncular[0].puanEkle(oyunMatrisi[oyuncular[0].getX()][oyuncular[0].getY()]);

                oyunMatrisi[oyuncular[0].getX()][oyuncular[0].getY()] = 0;
                change = false;
            }
            else{ // B oynacak

                System.out.println("B, Bir yön seçiniz :");
                String yon = scanner.nextLine();
                oyuncular[1].hareketEt(yon.charAt(0),oyunMatrisi.length,oyunMatrisi.length);

                oyuncular[1].puanEkle(oyunMatrisi[oyuncular[1].getX()][oyuncular[1].getY()]);

                oyunMatrisi[oyuncular[1].getX()][oyuncular[1].getY()] = 0;

                change = true;
            }



            tahtayiYazdir();
        }

    }
}
