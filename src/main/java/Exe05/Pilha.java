    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Exe05;

/**
 *
 * @author nklaraujo
 */
public interface Pilha<T> {
    
     void push(T info);
     T pop();
     T peek();
     boolean estaVazia();
     void liberar();
    
}
