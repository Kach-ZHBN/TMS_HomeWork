package homework.homework30.proxy;

public class TestProxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("image.png");
        // Загрузка и отображение изображения происходит только при вызове display()
        image.display();
        // Изображение уже загружено, повторный вызов display() не приводит к повторной загрузке
        image.display();
    }
}
