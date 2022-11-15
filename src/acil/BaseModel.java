package acil;

public class BaseModel {

    public BaseModel(){
        System.out.println("BaseModel nesnesi üretildi!");
    }

    private long id;

    private String adi;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}
