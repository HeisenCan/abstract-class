
public abstract class sekil {
    private String isim;
    
    public sekil(String isim){
        this.isim = isim;
    }
    
    public void ismini_söyle(){
        System.out.println("bu obje " + " objesidir");
    }
    
    abstract void alan_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
}
