/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos.interfaces;

/**
 *
 * @author natalle.santos
 */
public interface IFila {
     public void incluir (int dado ) throws Exception;
    public void retirar ()throws Exception;
    public int  acessar()throws Exception;
    public  boolean estaVazia();
    public boolean estaCheia();        
    public String obterFila(); // quase um get
}
