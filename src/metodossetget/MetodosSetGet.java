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
public class MetodosSetGet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Lista de Estrenos: ");
        System.out.println("Estreno 1: ");
        GetSetPrueba peli1 = new GetSetPrueba();
        
        peli1.settitulo("La Monja");
        System.out.println(peli1.gettitulo());
        
        peli1.setaño (2018);
        System.out.println(peli1.getaño());
        
        System.out.println("Estreno 2: ");
        
        GetSetPrueba peli2 = new GetSetPrueba ();
        
        peli2.settitulo ("Megalodon");
        System.out.println(peli2.gettitulo());
        
        peli2.setaño(2018);
        System.out.println(peli2.getaño());
    }
    
}
