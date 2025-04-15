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
    public void inserir(T valor);//inserir
    public boolean estaVazia();
    public int peek();
    public int retirar();//retirar
    public void liberar();
}
