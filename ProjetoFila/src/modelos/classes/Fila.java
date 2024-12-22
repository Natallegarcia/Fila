/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.interfaces.IFila;

/**
 *
 * @author natalle.santos
 */
public class Fila implements IFila {

   private int inicio = -1;
   private int fim = -1;
   private int [] array;
   private int tamanho; 
   private int quantidadeElementos = 0;

public Fila (int tamanho)throws Exception{ 

        this.tamanho = 0;
        this.inicio = -1;
        this.fim = -1;
        this.quantidadeElementos = 0;
    if(tamanho <=0 ) throw new Exception ("Tamanho da Filha não pode ser <=0");
    // se o tamanho for maior que 0 segue 
    array = new int [tamanho]; // criando o array
        if (array == null) throw new Exception ("Filha não será criada"); // pensando em uma exceção caso dê errado a criação do array
    this.tamanho = tamanho; // armazenando o valor do tamanho no array.
}                
    
    
    
    @Override
    public void incluir(int dado) throws Exception {
       if (estaCheia()) {
            throw new Exception("Fila está cheia");
        }
        if (estaVazia()) {
            inicio = 0;
          //  inicio++;
        }
        if (fim == tamanho - 1) {
            fim = 0;
        } else {
            fim++;
        }
        array[fim] = dado;
        quantidadeElementos++;
        }

    @Override
    public void  retirar() throws Exception {

         if (estaVazia()) {
           throw new Exception("Fila está vazia");
       }
       int i = array[inicio]; // Pegamos o valor na posição do início
       
       if (inicio == tamanho - 1) {
           inicio = 0; // Se o início chegou ao final do array, voltamos para o início (comportamento circular)
       } else {
           inicio++;
       }
       quantidadeElementos--;
       
       if (estaVazia()) {
           inicio = fim = -1; // Resetamos a fila caso esteja vazia
       }
            
        }

    @Override
    public int acessar() throws Exception {
            if (estaVazia()) {
            throw new Exception("Fila está vazia");
        }
        return array[inicio];
    }

    @Override
    public boolean estaVazia() {
               return (quantidadeElementos == 0);
        }

    @Override
    public boolean estaCheia() {
              return (quantidadeElementos == tamanho);    
    }    

    @Override
    public String obterFila() {
           if(estaVazia()){
               try {
                   throw new Exception("Fila vazia, não há elementos");
               } catch (Exception ex) {
                   Logger.getLogger(Fila.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
        
        StringBuilder elementos = new StringBuilder();
        for(int i = 0; i < quantidadeElementos; i++){
            int pos = (inicio + i) % tamanho;
            elementos.append(array[pos]).append(" ");
    }
        return elementos.toString().trim();
    
         
    }



    
   
    
    
}
