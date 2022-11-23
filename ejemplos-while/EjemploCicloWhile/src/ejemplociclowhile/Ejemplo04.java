/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int limiteInferior = 10;
        int limiteSuperior = 20;
        int contador = 10;
        int suma = 0;

                //   10     >=   10     and     10  <=     20
                //                V     and     V
                //                       V
        
        while (contador >= limiteInferior && contador <= limiteSuperior) {
            suma = suma + contador;
            System.out.printf("Contador %d\n", contador);
            contador = contador + 5;
        }

        System.out.printf("La suma final es %d\n", suma);

    }
}
