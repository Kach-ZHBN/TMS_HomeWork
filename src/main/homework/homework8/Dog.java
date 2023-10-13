package homework.homework8;

public class Dog extends Animal{

    private Dog(){
    }

    @Override
    public void voice() {
        System.out.println("I'm a dog");
    }

    @Override
    public void eat(String food) {
        if(food.equals("Meat")){
            System.out.println("I like to eat meat");
        }else{
            System.out.println("I don't like " + food);
        }
    }

    public static Dog createDog(){
        return new Dog();
    }
}
