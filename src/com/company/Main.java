package com.company;



class Persona {
    private int edad;
    private String name;

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return (name);
    }
    public void cumplirAnios()
    {
        edad++;
    }
    public int getEdad()
    {
        return edad;
    }

}

public class Main {

    public static void main(String[] args) {
        Persona panchito=new Persona();
        Persona lupita=new Persona();
        panchito.setName("Panchito");
        lupita.setName("lupita");

        panchito.cumplirAnios();
        panchito.cumplirAnios();
        panchito.cumplirAnios();
        panchito.cumplirAnios();

        lupita.cumplirAnios();
        lupita.cumplirAnios();

        System.out.println(panchito.getName() + " tiene " + panchito.getEdad() + " años");
        System.out.println(lupita.getName() + " tiene " + lupita.getEdad() + " años");
	// write your code here
    }
}
