/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List2.list_classes.exerc2;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Normal extends Ingresso{
    
    public Normal(double valor){
        super(valor);
    }
    
    public String tipoIngresso(){
        return "Ingresso normal";
    }
}