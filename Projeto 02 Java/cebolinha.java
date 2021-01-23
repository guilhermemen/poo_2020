public class cebolinha {
    int energy;
    int nfios;
    boolean capturado;

    cebolinha(int energy, int nfios){
        this.energy = energy;
        this.nfios = nfios;
        this.capturado = true;
    }

    void fugir(){
        if(nfios < 1){
            System.out.println("A mônica vai me pegar");
            return;
        }
        if(energy > 0){
            System.out.println("fugindo da mônica");
            energy -=1;
        }else{
            System.out.println("cansaço da molestia, coli  demais");
        }
    }

    void amarrarOcoelho(){
        if(nfios > 0){
            nfios -=1;
            System.out.println("peldi meu cabelinhooooo");
        }else{
            System.out.println("ave malia, fiquei caleca agola");
        }
    }

   void fiosdevolta(){
       if(nfios > 3){
           System.out.println("meu cabelinho voltou");
       }else{
           System.out.println("minha cabeleila está de volta");
       }
   }

   void descanso(int turnos){
        System.out.println("tem calma cascão, to bolano um plano");
        energy += turnos;
   }

   public String toString() {
    return "Cebolinha : energia:" + energy + " fios de cabelo:" + nfios;
    }

    public static void main(String[] args) {
        cebolinha careca =  new cebolinha(8,1);
        System.out.println(careca);

        for(int i = 0; i < 5; i++)
            careca.fugir();
            careca.fugir();
        System.out.println(careca);
        careca.descanso(1);
        careca.amarrarOcoelho();
        careca.amarrarOcoelho();
        careca.amarrarOcoelho();
        System.out.println(careca);

        careca.fiosdevolta();
        careca.fiosdevolta();
        careca.fiosdevolta();
        System.out.println(careca);
    }
}
