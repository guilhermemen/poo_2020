import java.util.Scanner; 
public class Dragao {

    int energia;
    int maxenergia;
    int fogo;
    boolean voar = true;

    Dragao(int energia, int maxenergia, int fogo, Boolean voar){
        this.energia = energia;
        this.maxenergia = energia;
        this.fogo = fogo;
        this.voar = voar;
    }

    void atacar(){
        if(energia < 60){
            energia -=10;
            System.out.println("Se me atacar, eu vou atacar");
        }else{
            System.out.println("to xoxo,capengo, manco e anemmico");
        }
    }

    void cuspirFogo(){
        if(fogo > 30){
            fogo -=10;
            energia -= 10;
            System.out.println("vou queimar é tudo");
        }else{
            System.out.println("o foguinnho nao vem aí");
        }
    }

    void voar(){
        if(voar  == true){
            System.out.println("vou voar");
        }else{
            System.out.println("vou ficar pelaa terra mesmo");
        }
    }

    void descanso(int turnos){
        System.out.println("a mimir");
        energia += turnos;


    }

    public String toString(){
        return "dragão: energia:" + energia + "fogo:" + fogo + "voar" + voar; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a energia do nosso dragaozinho?");
        int energia = scanner.nextInt();
        System.out.println("Qual a força de ataque do dragaozinho?");
        int atacar = scanner.nextInt();
        System.out.println("Qual a quantidade de chamas do dragaozinho?");
        int CuspirFogo = scanner.nextInt();
        System.out.println("O nosso  dragaozinho pode voar?");
        boolean voar = scanner.nextBoolean();
        System.out.println("hora de descanso do dragaozinho");
        int descanso = scanner.nextInt();

        scanner.close();

        Dragao soluço = new Dragao(energia, fogo, voar);

        System.out.println(soluço);
        soluço.atacar();
        soluço.atacar();
        soluço.descanso(10);
        soluço.voar();
        soluço.atacar();
        soluço.cuspirFogo();
        soluço.cuspirFogo();
        soluço.descanso(10);


    }
}
