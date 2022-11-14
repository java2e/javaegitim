package game.tr;

public class Oyuncu {

    public String oyuncuAdi;

    private int x;

    private int y;

    private int toplamPuan;

    public Oyuncu(String oyuncuAdi,int x,int y) {

        this.oyuncuAdi = oyuncuAdi;
        this.x = x;
        this.y=y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getToplamPuan() {
        return toplamPuan;
    }

    public void setToplamPuan(int toplamPuan) {
        this.toplamPuan = toplamPuan;
    }

    public void puanEkle(int puan) {
        toplamPuan = toplamPuan + puan;
    }
    public void hareketEt(char yon,int satir,int sutun) {

        if(yon == 'k') {

            if(x>0) {
                setX(this.x -1);
            }
            else{
                System.out.println("Hareket edemezsiniz!");
            }
        }
        else if(yon == 'g') {

            if(x<satir-1) {
                setX(this.x +1);
            }
            else {
                System.out.println("Hareket edemezsiniz!");
            }

        }
        else if(yon == 'd') {
            if(y<sutun-1) {
                setY(this.y+1);
            }
            else {
                System.out.println("Hareket edemezsiniz!");
            }
        }
        else if(yon == 'b') {
            if(y>0) {
                setY(this.y - 1);
            }
            else{
                System.out.println("Hareket edemezsiniz!");
            }
        }
        else {
            System.out.println("Yanlış yön seçtiniz, hareket edemezsiniz!");
        }



    }
}
