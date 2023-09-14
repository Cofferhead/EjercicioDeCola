/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase9sept;

/**
 *
 * @author felix
 */
public class FilaCircular<T> {
    private int inicio;
    private int fin;
    private T[] fila;
    public FilaCircular (int max)
    {
        fila = (T[]) new Object[max];
        inicio = -1;
        fin = -1;
    }
    //push
    public void push(T nuevo)
    {
        if (isFull())
        {
            System.out.println("Desbordamiento");
        }
        else
        {
            fin += 1;
            if (fin == 0)
            {
                inicio = 0;
            }
            else if (fin == fila.length)
            {
                fin = 0;
            }
            fila[fin] = nuevo;
        }
    }
    //pop
    public T pop ()
    {
        if (isEmpty())
        {
            System.out.println("Subdesbordamiento");
            return null;
        }
        else
        {
            T aux = fila[inicio];
            if (inicio == fin)
            {
                inicio = -1;
                fin = -1;
            }
            else
            {
                inicio += 1;
                if (inicio == fila.length)
                {
                    inicio = 0;
                }
            }
            return aux;
        }
    }
    //peek
    public T peek ()
    {
        if (isEmpty())
        {
            return null;
        }
        else
        {
            return fila[inicio];
        }
    }
    //isEmpty
    public boolean isEmpty ()
    {
        if (fin == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //isFull
    public boolean isFull ()
    {
        if (fin+1 == inicio || (inicio == 0 && fin == fila.length-1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}