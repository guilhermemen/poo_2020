import java.util.Scanner;

public class tamagochi{

    private int energia;
    private int energiaMx;
    private int fome;
    private int fomeMx;
    private int limpo;
    private int limpoMx;
    int age;
    int diamonds;
    boolean alive;

   public tamagochi(int energiaMx, int fomeMx, int limpoMx){
        this.energia = energiaMx;
        this.energiaMx = energiaMx;
        this.fome = fomeMx;
        this.fomeMx = fomeMx;
        this.limpo = limpoMx;
        this.limpoMx = limpoMx;
        this.age = 0;
        this.diamonds = 0;
        this.alive =  true;
    }



private void setEnergia(int value){
    this.energia = value;
    if(energia < 0){
        this.energia = 0;
        this.alive = false;
        System.out.println("Morreu pela falta de energia");
    }if(this.energia > energiaMx){
       this.energia = energiaMx;
    }
}

int getEnergia(){
    return this.energia;
}

private void setfome(int value){
    this.fome = value;
    if(fome < 0){
        this.fome = 0;
        this.alive = false;
        System.out.println("Morreu por nao ser alimentado");
    }if(this.fome > this.fomeMx){
        this.fome = this.fomeMx;
    }
}

int getfome(){
    return this.fome;
}

private void setlimpo(int value){
    this.limpo = value;
    if(this.limpo < 0){
        this.limpo = 0;
        this.alive = false;
        System.out.println("não me deram banho e eu morri");
    }if(this.limpo > limpoMx){
        this.limpo = limpoMx;
    }
}

int getlimpo(){
    return this.limpo;
}

boolean taVivo(){
    if(!alive){
        System.out.println("eu morri, me deixa em paz");
        return false;
    }
    return true;
}

void brincar(){
    if(!alive){
        return;
    }
    setEnergia(energia -2);
    setlimpo(limpo -1);
    setfome(fome -2);
    age -=1;
    diamonds +=1;
}

void banhar(){
    if(!alive){
        return;
    }
    setEnergia(energia +1);
    setlimpo(limpo +1);
    setfome(fome -2);
    this.diamonds +=2;
    this.age +=1;
}

void alimentar(){
    if(!alive){
        return;
    }
    setEnergia(energia +1);
    setlimpo(limpo -2);
    setfome(fome +1);
    this.diamonds +=1;
    this.age +=1;
}

void mimir(){
    if(!alive){
        return;
    } 
    if(energia <= 5){
        return;
    }
        System.out.println("estou sem sono");
    }



public String toString(){
    return "energia:" + energia + "/" + energiaMx + "fome:" + fome + "/" + fomeMx + "limpo:" + limpo + "/" + limpoMx;
}

    public static void main(String[] args) {
        Scanner avaliar = new Scanner(System.in);
        tamagochi pikachu = new tamagochi(15, 15, 15);

        while(true){ 
            String line = avaliar.nextLine();
            String ai[] = line.split(" ");

            if(ai[0].equals("end")){
                break;
            }else if(ai[0].equals("valores")){
                pikachu = new tamagochi(15, 15, 15); 
            }else if(ai[0].equals("show")){
                System.out.println(pikachu);
            }else if(ai[0].equals("brincar")){ 
                pikachu.brincar();
            }else if(ai[0].equals("banhar")){
                pikachu.brincar();
            }else if(ai[0].equals("alimentar")){
                pikachu.brincar();
            }else if(ai[0].equals("mimir")){
                pikachu.mimir();
            }
        }
        avaliar.close();
    }
}