/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog3;

/**
 *
 * @author EMERSON MENDOZA
 */
public class Velas {
    public int velas = 0, velasApagadas = 0;
    public int[] alturaVelas = new int[100]; 
    public int max=alturaVelas[0];
    public void Velas(int x)
    {
            this.velas=x;
    }
     public int getVelas() {
            return this.velas;
     }
     public void hV()  {
        
        for(int i=0;i<velas;i++)
        {
            alturaVelas[i]= (int) (Math.random()*velas+1);
        }
            
    }
     public int getAlturaV()    {
            return this.alturaVelas[100];
    }
    public void ImphV()   {
        System.out.print("\nLa altura de las velas -> ");           
        for(int i=0;i<velas;i++)
        {
            System.out.print( + alturaVelas[i] + " ");
        }
    }
    public void offV()   {
        
        for(int i=0;i<velas;i++)
        {
            if (max<alturaVelas[i])                
                max=alturaVelas[i];                                      
        }
        for (int i=0; i<velas;i++)
        {
            if (max==alturaVelas[i])
                    velasApagadas+=1;           
        }
        System.out.println("\nEl número de velas que se apagaron -> " + velasApagadas);
        
    }
    
}