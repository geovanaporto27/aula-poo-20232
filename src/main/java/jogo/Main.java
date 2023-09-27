package jogo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Personagem raimundo = new Personagem("Raimundo Nonato");
       Personagem madruga = new Personagem("Seu Madruga");
       Arma peixeira = new Arma("Peixeira", 20, 0);
       Arma chinela = new Arma("Chinela havaiana", 5, 0);
       Pocao corote = new Pocao("Corote", 5);
       Armadura capaceteArmadura = new Armadura("Capacete");
       Armadura peitoralArmadura = new Armadura("Peitoral");
       Armadura calcaArmadura = new Armadura("Calça");
       Armadura botaArmadura = new Armadura("Bota");

       raimundo.setArma(peixeira);
       madruga.setArma(chinela);

       raimundo.atacar(madruga);
       madruga.recuperarVida(corote);
       madruga.atacar(raimundo);

       Scanner teclado = new Scanner(System.in);
       boolean executando = true;

       while (executando) {
           System.out.println("Menu");
           System.out.println("1 - Iniciar");
           System.out.println("2 - Opções");
           System.out.println("3 - Sair");
           System.out.print("Digite uma opção:");
           int opc = teclado.nextInt();

           switch (opc) {
               case 1:
                   System.out.println("Você escolheu Iniciar");
                   break;
               case 2:
                   System.out.println("Você escolheu Opções");
                   break;
               case 3:
                   System.out.println("Você escolheu Sair");
                   executando = false;
                   break;
               default:
                   System.out.println("Opção inválida");
                   break;
           }
        double randNum = Math.random(); // 0 >= num > 1.0
        if (randNum < 0.3) {
            System.out.println("Encontrou um inimigo");
            
        }
    
    }
}
}
