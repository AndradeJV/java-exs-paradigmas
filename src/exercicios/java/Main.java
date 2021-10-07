package exercicios.java;

import exercicios.java.atleta.Atleta;
import exercicios.java.esporte.ArremessoDePeso;
import exercicios.java.esporte.GinasticaArtistica;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Atleta jogadorUm = new Atleta(19,"br","João");
        Atleta jogadorDois = new Atleta(19,"br","Murillo");

        float umaDistanciaObtidaUm[] = {(float)Math.random() * 100, (float)Math.random() * 100 , (float)Math.random() * 100};
        float umaDistanciaObtidaDois[] = {(float)Math.random() * 100 , (float)Math.random() * 100, (float)Math.random() * 100};
        ArremessoDePeso arremessoDePeso = new ArremessoDePeso(jogadorUm, umaDistanciaObtidaUm, jogadorDois, umaDistanciaObtidaDois);
        arremessoDePeso.defineArremeco();

        //float notasJogadorUm[] = new float[5];
        //float notasJogadorDois[] = new float[5];

        //GinasticaArtistica ginasticaArtistica = new GinasticaArtistica(jogadorUm, notasJogadorUm,jogadorDois, notasJogadorDois);
        Scanner scanner = new Scanner(System.in);
        int escolherJogo;
        System.out.println("Olá jogadores, sejam bem vindos as Olímpiadas de Chernobil");
        System.out.println("Digite a opção que deseja jogar");
        System.out.println("\t1-Arremeso de peso \n\t2-Ginástica Artística");

        escolherJogo = scanner.nextInt();

        do {



            if (escolherJogo == 1){
                System.out.println("Arremesso de peso");


            }

            else if(escolherJogo == 2){
                System.out.println("Ginástica artística");

                Random geradorDeNotas = new Random();

                for (int i = 1; i <= 5; i++) {
                    System.out.printf("Nota do juíz Nº " + i);
                    System.out.println("");
                    System.out.println(geradorDeNotas.nextInt(11));
                }


            }

            else{
                System.out.println("Opção não encontrada, digite novamente");
                escolherJogo = scanner.nextInt();
            }



        }while (escolherJogo != 1 || escolherJogo != 2);

    }
}
