import java.util.ArrayList;
import java.util.Scanner;


class Conta{

    public int rg;
    public String acao;
    public float valor;
    public float saldo;

    public Conta(int rg, String acao, float valor, float saldo){
        this.rg = rg;
        this.acao = acao;
        this.valor = valor;
        this.saldo = saldo;

    }

    public String toString(){
        return "seu rg" + rg + "ação" + acao + "seu valor" + valor + "seu saldo" + saldo;
    }

 }

public class banco {

    Conta op;
    int nextRg;
    private float saldo;
    private int num;
    ArrayList <Conta> extrato;

    public banco(int num){
        this.num = num;
        this.nextRg = 0;
        extrato = new ArrayList<>();
    }

    public void setSaldo(float valor){
        this.saldo = valor;
    }

    private float getSaldo(){
        return saldo;
    }

    public void setNumConta(int num){
        if(num == this.num){
            System.out.println("Conta Existente, tente novamente");
        }else{
            this.num = num;
        }
    }

    public int getNum(){
        return num;
    }

    public void inicioOperar(String acao, float valor){
        op = new Conta(nextRg, acao, valor, getSaldo());
        nextRg += 1;
        extrato.add(op);
    }

    public ArrayList<Conta> getExtrato(){
        for(int i = 0; i < extrato.size(); i++){
            System.out.println(extrato.get(i));
        }
        return extrato;
    }

    public ArrayList<Conta> getExtratoLast(int quantia){
        for(int i = extrato.size() - quantia; i < extrato.size(); i++){
            System.out.println(extrato.get(i));
        }
        return extrato;
    }

    public boolean deposito(float valor){
        if(valor > 0){
            float num = getSaldo();
            this.setSaldo(num + valor);
            inicioOperar("deposito", valor);
            return true;
        }
        return false;
    }

    public boolean sacar(float valor){
        if(valor > 0){
            float num = getSaldo();
            this.setSaldo(num - valor);
            inicioOperar("saque", -valor);
            return true;
        }else{
            System.out.println("dinheiro insuficiente");
            return false;
        }
    }

    public boolean tafifar (float valor){
        float num = getSaldo();
        this.setSaldo(num - valor);
        this.inicioOperar("tarifa", -valor);
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta criar = new Conta(2132, "deposito", 300, 500);

        while (true) {
            String line = scanner.nextLine();
            String ai[] = line.split(" ");
            
            if (ai[0].equals("end")) {
                break;
            }else if(ai[0].equals("show")){
                System.out.println(criar);
            }else if(ai[0].equals("deposito")){
                criar.deposito(criar);
            }else if(ai[0].equals("tarifar")){
                criar.tarifar(criar);
            }else if(ai[0].equals("sacar")){
                criar.sacar(criar);
            }
        }
        scanner.close();
    }
}
