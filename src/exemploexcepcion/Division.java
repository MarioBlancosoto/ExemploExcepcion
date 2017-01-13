/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcion;

import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class Division {
    private int numerador,denominador,division;
    
    public Division(){
        
    }
    public void dividir(int numerador,int denominador){
       
        division = numerador/denominador;
        System.out.println(" Solución = " +division);
        
  
    }
       public void dividirConTryCatch(int numerador,int denominador){
          
            try{
        division = numerador/denominador;
        System.out.println(" Solución = " +division);
        
       System.out.println(" Despois da excepción ");
       }catch(ArithmeticException exp){
           System.out.println(" Erro1 "+ exp);
       }catch(Exception e){
            System.out.println(" Erro2 "+e.getMessage());
       }finally{
                System.out.println(" este bloque executase sempre");
            }
           
       
}
    
    public void dividirLanzarExcep(int nume,int deno)throws ArithmeticException{
               if (deno==0){
                   throw new ArithmeticException(" Non dividas entre 0 ");
               }
               System.out.println("Solición "+nume/deno);          }
    
    
    public void dividirNosaExcep(int nume,int deno)throws NosaExcepcion{
 if (deno==0){
     throw new NosaExcepcion();
 }       
        System.out.println("solucion "+nume/deno);
    }
    
    
    public void dividirIntervaloExcepcion(int nume,int deno)throws IntervaloExcepcion{
        
        if ((nume<60||nume>200)||(deno<60||deno>200)) {
            throw new IntervaloExcepcion();
    }
        System.out.println("O resultado e "+nume/deno);
    }
}
    
