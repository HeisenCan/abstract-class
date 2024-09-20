 
public class daire extends sekil{
    private int yaricap;
    
    public daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " in alani" + (Math.PI*yaricap*yaricap) +  " dir");
    } 
    
}
