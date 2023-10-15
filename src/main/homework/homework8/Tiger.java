package homework.homework8;

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("I'm a tiger");
    }

    @Override
    public void eat(String food) {
        if(food.equals("Meat")){
            System.out.println("I like to eat meat");
        }else{
            System.out.println("I don't like " + food);
        }
    }
}
