package punto1;

import java.util.ArrayList;

public class TestPersona {
  public static void main(String[] args) {
    // test if Persona implements Comparable
    Persona p1 = new Persona("Juan", "Perez", 30);
    Persona p2 = new Persona("Pedro", "Gomez", 40);
    Persona p3 = new Persona("Ana", "Gomez", 25);
    Persona p4 = new Persona("Ana", "Gomez", 25);
    ArrayList<Persona> personas = new ArrayList<Persona>();
    personas.add(p1);
    personas.add(p2);
    personas.add(p3);
    personas.add(p4);
    System.out.println("personas: " + personas);
    personas.sort(null);
    System.out.println("personas: " + personas);

  }

}
