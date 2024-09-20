
public class kare extends sekil{
    private int kenar;
    
    public kare(String isim, int kenar){
        super(isim);
        this.kenar = kenar;
    }
            
    public kare(String isim) {
        super(isim);
    }

    @Override
    public void alan_hesapla() {
        System.out.println(getIsim() + " in alani" + (kenar*kenar) + " dir");
    }
    
    public void cevre_hesap(){
        System.out.println(getIsim() + " in cevresi " + (4*kenar) + " dir");
    }
    
}
