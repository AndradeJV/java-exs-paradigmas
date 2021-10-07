package exercicios.java.esporte;

import exercicios.java.atleta.Atleta;

import java.util.Arrays;
import java.util.Arrays;

public class GinasticaArtistica extends Esporte{
    private int notasRecebidas = 5;
    private float notaJogadorUm[] = new float[notasRecebidas];
    private float notaJogadorDois[] = new float[notasRecebidas];

    public GinasticaArtistica(Atleta jogadorUm, float notasPrimeiroJogador[], Atleta jogadorDois, float notasSegundoJogador[]){
        super(jogadorUm, jogadorDois);

        for (int i = 0; i < notasRecebidas; i++){
            this.notaJogadorUm[i] = notasPrimeiroJogador[i];
            System.out.println(this.notaJogadorUm);
        }

        for (int i = 0; i < notasRecebidas; i++){
            this.notaJogadorDois[i] = notasSegundoJogador[i];
            System.out.println(this.notaJogadorDois);
        }

        Arrays.sort(this.notaJogadorUm);
        Arrays.sort(this.notaJogadorDois);
    }
}
