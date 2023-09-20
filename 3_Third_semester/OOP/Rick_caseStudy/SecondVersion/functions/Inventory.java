/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class Inventory {
    private List guitars;
    
    public Inventory(){
        guitars = new LinkedList();
    }
    
    public void addGuitar(String serialNumber, double price, Builder builder,
            String model, Type type, Wood backWood, Wood topWood){
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);        
    }
    
    public Guitar getGuitar(String serialNumber){
        for (Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }
    
    public List search(GuitarSpec searchSpec){
        List matchingGuitars = new LinkedList();
        
        for (Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec = guitar.getSpec();
            
            if(searchSpec.getBuilder() != guitarSpec.getBuilder())
            {continue;}
            
            String model = searchSpec.getModel().toLowerCase();
            
            if ((model!=null) && (!model.equals("") && 
                    (!model.equals((guitarSpec.getModel().toLowerCase())))))
            {continue;}
            
            if (searchSpec.getType() != guitarSpec.getType())
            {continue;}
            
            if (searchSpec.getBackWood()!= guitarSpec.getBackWood())
            {continue;}
            
            if (searchSpec.getTopWood()!= guitarSpec.getTopWood())
            {continue;}     
            
            matchingGuitars.add(guitar);
            
        }
        return matchingGuitars;
    }
    
}