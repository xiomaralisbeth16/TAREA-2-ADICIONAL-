/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosXiomara;

import javax.swing.*;
import java.io.*;

/**
 *
 * @author Lisbeth
 */
public class Semana_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        int a[]=new int[17];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*17);                    
        }
        System.out.print("a = [");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");       */        
        int number = 0;
        int Decision = 0;
        do {
            do {
                try{
                    number=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la Cantidad de Datos: \n"
                        +"1.- 1000000             5.- 100000 \n"
                        +"2.- 750000               6.- 50000 \n"
                        +"3.- 500000               7.- 25000 \n"
                        +"4.- 250000               8.- 1000 \n"));           
                }catch(NumberFormatException a){
                    JOptionPane.showMessageDialog(null, "Ingrese nuevamente");
                }
            } while (number>=9);      
        } while (number<=0 );
        switch(number){
            case 1:
                Decision=1000000;
                break;
            case 2:
                Decision=750000;
                break;
            case 3:
                Decision=500000;
                break;
            case 4:
                Decision=250000;
                break;
            case 5:
                Decision=100000;
                break;
            case 6:
                Decision=50000;
                break;
            case 7:
                Decision=25000;
                break;
            case 8:
                Decision=1000;
                break;
        }      
        int nCantidadDatos=Decision;
        int nValorMinimo=0;
        int nValorMaximo=1000000;
        int a[]=new int [nCantidadDatos];
        Ordenamiento o=new Ordenamiento ();
        int[] oArreglo = o.DevuelveArreglo(nCantidadDatos, nValorMinimo, nValorMaximo);
        
        //"Metodo Quickshort"
        long nIniciotiempo= System.currentTimeMillis();
        Ordenamiento.Quickshort(oArreglo , 0 , oArreglo.length - 1);            
        long nRetardoTiempo = System.currentTimeMillis() - nIniciotiempo;
        
        //"Metodo burbuja"
        long nIniciotiempo1= System.currentTimeMillis();
        Ordenamiento.Burbuja(oArreglo);
        long nRetardoTiempo1 = System.currentTimeMillis() - nIniciotiempo1;
        
        //"Metodo Shell"
        long nIniciotiempo2= System.currentTimeMillis();
        Ordenamiento.Shell(oArreglo);
        long nRetardoTiempo2 = System.currentTimeMillis() - nIniciotiempo2;
        
        //"Metodo Insercion"
        long nIniciotiempo3= System.currentTimeMillis();
        Ordenamiento.Insercion(oArreglo);
        long nRetardoTiempo3 = System.currentTimeMillis() - nIniciotiempo3;
        
        JOptionPane.showMessageDialog(null, "Cantidad de Registro:  " + nCantidadDatos  + " \n"
            + " \n"
            + "Metodo                  |"+"     Tiempo de ordenamiento \n" 
            + "------------------------------------------------------------------- \n"
            + "Burbuja                  |                         "+ nRetardoTiempo1+" \n"
            + "Shell                       |                         "+nRetardoTiempo2 + " \n"
            + "Quickshort           |                         "+nRetardoTiempo+ " \n"
            + "Inserccion            |                         "+nRetardoTiempo3 );    
    }    
}

        
        
   

