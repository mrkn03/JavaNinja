package NivelIniciante;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de Repetição: Vão repetir infinitamente ou até voce atingir o parametro desejado
        * WHILE = FOR
        * */

        //While
        //While (condicao) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
        }

        // FOR

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Naruto esta se clonando e ja se clonou " + i);
        }
    }
}
