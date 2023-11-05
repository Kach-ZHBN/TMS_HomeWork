package homework.homework14;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AnimalListTest {
    @Test
    public void testAnimalList(){
        AnimalList animalList = new AnimalList();
        assertEquals(animalList.toString(), "[]");
        animalList.addAnimal("Dog");
        assertEquals(animalList.toString(), "[Dog]");
        animalList.addAnimal("Cat");
        assertEquals(animalList.toString(), "[Cat, Dog]");
        animalList.addAnimal("Tiger");
        animalList.addAnimal("Rabbit");
        assertEquals(animalList.toString(), "[Rabbit, Tiger, Cat, Dog]");
        animalList.deleteAnimal();
        assertEquals(animalList.toString(), "[Rabbit, Tiger, Cat]");
        animalList.addAnimal("Mouse");
        assertEquals(animalList.toString(), "[Mouse, Rabbit, Tiger, Cat]");
        animalList.deleteAnimal();
        animalList.deleteAnimal();
        animalList.deleteAnimal();
        assertEquals(animalList.toString(), "[Mouse]");
        animalList.deleteAnimal();
        assertEquals(animalList.toString(),"[]");
    }

}