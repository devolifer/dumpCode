/*
* helloWorld
* um teste simples ao basic I/O do java
* para compilar
* $javac helloWorld.java
* isso gera um helloWorld.class
* para correr
* $java helloWorld



* desafios
* 1 - nova função, carrega-se 'w', e ele retorna "sucesso" e muda para uma nova linha
* 2 - perceber como funciona o .read(), fazer com que seja possivel usar o 'q', fazer
* com que seja necessario escrever um '.' sozinho, carregar enter, e carregar enter novamente para sair do ciclo while
* TIP:  ".\n\n"
* 3 - escrever uma nova função, que faz reverter a ordem das letras do input recebido



* Tens o eclipse, usa-o
*/




//indica que o programa usa libs standard de Input Output
import java.io.*;


//Cada ficheiro .java consiste na definição duma classe, atenção, que <nome>.java tem de ser igual a class <nome>
public class helloWorld {

  //a main, é o ciclo principal de execução, existe uma por cada programa e é por onde inicia a execução de instruções
   public static void main(String args[]) throws IOException
   {
      //Um stream, ele vem do java.io.InputStreamReader e ele é criado quando o programa está a correr; 
      //é uma ligação direta ao buffer de entrada de dados
      InputStreamReader cin = null;
      
      
      //não ligues ao try ou ao finally por agora
      try {
      
	/*
	aqui acontecem coisas lol
	regra geral vais fazer google e tenta procurar pelas docs.oracle.com	
	*/
         cin = new InputStreamReader(System.in);
         System.out.println("Hello World!!   \:D/\nEnter characters, 'q' to quit.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q');
         
      //aqui fechamse buffers, não ligues a esta parte e deixa-a no final do programa   
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
   }
}


