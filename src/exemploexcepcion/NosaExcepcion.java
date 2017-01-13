/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcion;

/**
 *
 * @author Mario
 */
public class NosaExcepcion extends Exception {
    
    public NosaExcepcion(){
        super(" informamos de nosa excepción ");
    }
    
    public NosaExcepcion(String s){
        super(s);
    }
   
}
