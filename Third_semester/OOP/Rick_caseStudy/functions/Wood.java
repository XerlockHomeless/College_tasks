/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE,
    COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
    
    @Override
    public String toString(){
        return switch(this){
            case INDIAN_ROSEWOOD -> "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD -> "Brazilian Rosewood";
            case MAHOGANY -> "Mahogany";
            case MAPLE ->"Maple";
            case COCOBOLO ->"Cocobolo";
            case CEDAR ->"Cedar";
            case ADIRONDACK ->"Adirondack";
            case ALDER -> "Alder";
            case SITKA -> "Sitka";
        };
    }
}