/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofila;
import modelos.classes.Fila;

/**
 *
 * @author natalle.santos
 */
public class ProjetoFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try{
              
            Fila f = new Fila(4);
            
              System.out.println( f.estaVazia());
              System.out.println(f.estaVazia());
             
              f.incluir(8);
              f.incluir(9);
              f.incluir(10);
              f.incluir(15);
              System.out.println( f.obterFila());
              System.out.println(f.acessar());
              f.retirar();
              f.retirar();
              f.incluir(-8);
              f.incluir(-7);
              System.out.println(f.acessar());
              System.out.println(f.obterFila());
              f.retirar();
              f.retirar();
              f.incluir(-6);
              System.out.println(f.obterFila());
              f.retirar();
               System.out.println(f.obterFila());
               f.retirar();
               f.retirar();
               System.out.println(f.estaVazia());
                    
                    
                      
             // f.acessar();
           // f.incluir(18);
           // f.incluir(20);
          //  f.incluir(35);
           //   System.out.println(f.acessar());
           //   f.incluir(45);
           //   System.out.println(f.obterFila());
         /// ///   f.incluir(50);
             // f.incluir(80);
           //   System.out.println(f.obterFila());
           
           
            
         
       
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
        
       
        
        
        
        
        
    }
    

