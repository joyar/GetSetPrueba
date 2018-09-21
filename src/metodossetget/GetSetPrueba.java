/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodossetget;

/**
 *
 * @author Usuario
 */
public class GetSetPrueba {
    
    private String titulo;
    private int año;
    
    public void settitulo (String titulopeli){
    
        titulo = titulopeli;
    }
    
    public String gettitulo (){
    
        return titulo;
    }
    
    public void setaño (int añopeli){
        
        año = añopeli;
       
    }
    
    public int getaño (){
    
        return año;
    }
    
}
