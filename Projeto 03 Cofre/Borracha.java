import java.util.Scanner;

class Ponta{
    int tamanho;
    String dureza;
    float espessura;

    public Ponta(int tamanho, String dureza, float espessura){
        this.tamanho = tamanho;
        this.dureza = dureza;
        this.espessura = espessura;
    }

    public String toString(){
        return "["+ tamanho + ":" + dureza + ":" + espessura +"]";
    }

}

public class Borracha {
    float espessura;
    Ponta ponta;

    Borracha(float espessura){
        this.espessura = espessura;
        this.ponta = null;
    }

    void colocar(){
        if(this.ponta != null){
            System.out.println("ja tem ponta aqui, lesado");
        }else if(this.espessura < ponta.espessura){
            System.out.println("não entra, pode comprar outra");
        }else{
            this.ponta = ponta;
        }
    }

    void retirar(){
        if(this.ponta != null){
            this.ponta = null;
            System.out.println("vou trocar a ponta");
        }
    }

    void apagar(int palavras){
    
    }

    public String toString(){
        return "espessura:" + espessura + "," + "ponta:" + ponta;
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Borracha borracha = new Borracha(0.5f);

        while(true){
            String line = leitor.nextLine();
            String input[] = line.split(" ");

            if(input[0].equals("end")){
                System.out.println("fim");
                break;
            }else if(input[0].equals("colocar")){
                borracha.colocar();
                System.out.println(borracha);
            }else if(input[0].equals("retirar")){
                borracha.retirar();
                System.out.println(borracha);
            }else if(input[0].equals("apagar")){
                borracha.apagar(12);
                System.out.println(borracha);

       
            }
        }
        leitor.close();
    }
}
