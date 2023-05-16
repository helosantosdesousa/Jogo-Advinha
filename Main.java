import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int chute=0;
        int contador=0;
        int tentativa=4;
        int numero=new Random().nextInt(100);

        Scanner entrada = new Scanner(System.in);

        System.out.println("************* Seja bem vindo ao mentalista 2.0 em Java! Escolha um número de 1 a " +
                "100 **************");



        while(contador<5 && chute!=numero){
            System.out.println("Escreva seu chute");
            chute = entrada.nextInt();

        if (numero<chute){
            System.out.println("O número é MENOR que seu chute " + "Restam " + tentativa + "/5 Jogadas");
        } else if(numero>chute) {
                System.out.println("O número é MAIOR que seu chute " + "Restam " + tentativa +"/5 Jogadas");
            }

        tentativa--;
        contador++; }

        if (chute==numero){
        System.out.println("************ Parabéns, você acertou! ***********");
        } else{
            System.out.println("********** Que pena, você perdeu. O número era: "+ numero + " *****************");
        }
}
    }