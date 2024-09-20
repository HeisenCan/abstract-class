
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String islemler = "islemler : \n"
                          +"1. kare alani hesapla\n"
                          +"2. ucgen alani hesapla\n"
                          +"3. daire alani hesapla\n"
                          +"cikis : q";
        while(true){
            System.out.println(islemler);
            String sekilTuru = input.nextLine();
            sekil sekil = null;
            
            if(sekilTuru.equals("q")){
                System.out.println("programdan cikiliyor");
                break;
            }
            else if(sekilTuru.equals("1")){    
                System.out.println("karenin kenari :");
                int kenar = input.nextInt();
                input.nextLine();
                
                sekil = new kare("kare1",kenar);
                sekil.alan_hesapla();
            }
            else if(sekilTuru.equals("2")){    
                System.out.println("kenar 1:");
                int kenar1 = input.nextInt();
                System.out.println("kenar 2:");
                int kenar2 = input.nextInt();
                System.out.println("kenar 3:");
                int kenar3 = input.nextInt();
                input.nextLine();
                
                sekil = new ucgen("ucgen1",kenar1,kenar2,kenar3);
                sekil.alan_hesapla();
            } 
            else if(sekilTuru.equals("3")){
                System.out.println("dairenin yaricapi : ");
                int yaricap = input.nextInt();
                input.nextLine();
                
                sekil = new daire("daire1",yaricap);
                sekil.alan_hesapla();
            }
            else
                System.out.println("gecersiz islem");
        }
    }
    
}
