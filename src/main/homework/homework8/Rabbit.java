package homework.homework8;

public class Rabbit extends  Animal{
    @Override
    public void voice() {
        System.out.println("I'm a rabbit");
    }

    @Override
    public void eat(String food) {
        if(food.equals("Grass")){
            System.out.println("I like to eat grass");
        }else{
            System.out.println("I don't like " + food);
        }
    }
}
