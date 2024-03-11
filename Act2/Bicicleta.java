public class Bicicleta{
    
    public final static int MAX_PLAT=3;
    public final static int MAX_PINYO=3;
    
    private static String propietari=" ";
    private int plat= 1;
    private int pinyo= 1;
    private static double velocitat= 0;

    private static int numPlat;
    private static int numPinyo;

    public Bicicleta(String propietari, int numPlat, int numPinyo ){
        this.propietari=propietari;
        this.numPlat=numPlat;
        this.numPinyo=numPinyo;
    }

    public Bicicleta(String propietari, int plat, int pinyo, double velocitat){
        this.propietari=propietari;
        this.plat= plat;
        this.pinyo= pinyo;
        this.velocitat = velocitat;
    }
    
    public static void main(String[] args){5
        Bicicleta b1= new Bicicleta("Angelo", 3, 1);
        // b1.mostrarEstat();
        b1.canviPlat(true);
        b1.mostrarEstat();
        Bicicleta b2= new Bicicleta("Ashley", 3, 6);
        // b2.mostrarEstat();
        b2.canviPlat(true);
        b2.mostrarEstat();

        // Bicicleta bici = new Bicicleta(propietari, numPlat, numPinyo, velocitat);
        //     bici.propietari="Angelo";
        //     bici.plat= 2;
        //     bici.pinyo=1;
        //     bici.velocitat=50.0;

        // bici.mostrarEstat();
        // bici.frena(10);
        // bici.mostrarEstat();

        
    }
    public void mostrarEstat(){
        System.out.println("_____________________________________");
        System.out.println("propietari: " + propietari);        
        System.out.println("plat: " + plat + "/" + numPlat);
        System.out.println("pinyo: " + pinyo + "/" + numPlat);
        System.out.println("velocitat: " + velocitat);
    }

    public void frena( int decrement){
        System.out.println("frena: " + propietari+ " " + decrement);
        velocitat= velocitat - decrement;
        if(velocitat<0){
            velocitat=0;
        }
    }
    
    public void canviPlat(boolean aumentar){
        if(aumentar){
            if(plat<MAX_PLAT){
                plat++;
            }
        }else{
            if(plat>MAX_PLAT){
                plat--;
            }
        }
    }
}