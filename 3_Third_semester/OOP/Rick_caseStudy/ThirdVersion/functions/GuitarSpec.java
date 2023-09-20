/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThirdVersion.functions;

/**
 *
 * @author Marcus Vinícius da Costa Graciano - BSI3
 */
public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood, topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type,
                        int numStrings, Wood backWood, Wood topWood){
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder(){
        return builder;
    }

    public String getModel(){
        return model;
    }
    
    public Type getType(){
        return type;
    }
    
    public int getNumStrings(){
        return numStrings;
    }

    public Wood getBackWood(){
        return backWood;
    }

    public Wood getTopWood(){
        return topWood;
    }

    public boolean matches(GuitarSpec otherSpec) {
        if (builder != otherSpec.builder){
            return false;
        }
        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model))){
            return false;
        }
        if (type != otherSpec.type){
            return false;
        }
        if (numStrings != otherSpec.numStrings){
            return false;
        }
        if (backWood != otherSpec.backWood){
            return false;
        }
        if (topWood != otherSpec.topWood){
            return false;
        }
        return true;
    }
}