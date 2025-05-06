/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Exe06;

/**
 *
 * @author nklaraujo
 */
public interface Fila<T> {

    public void inserir(T valor);
    public boolean estaVazia();
    public T peek();
    public T retirar();//retirar
    public void liberar();
}
