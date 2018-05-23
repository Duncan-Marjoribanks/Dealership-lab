import behaviours.Icomponent;

import java.util.ArrayList;

public abstract class Vehicle{


    private int price;
    private String colour;
    private ArrayList<Icomponent> components;

    public Vehicle(int price, String colour){
        this.price = price;
        this.colour = colour;
        this.components = new ArrayList <>();
    }

    public int checkNumberOfComponents(){
        return components.size();
    }

    public void addComponent(Icomponent component){
        this.components.add(component);
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

}
