package homework.homework14;

/*
Задача *:
Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
классов(т.е. это generic).
Предусмотреть операции(методы):
1. добавления элемента
2. удаления элемента
3. получение элемента по индексу
4. проверка есть ли элемент в коллекции
5. очистка всей коллекции
Предусмотреть конструктор без параметров - создает массив размером
по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
массива. Предусмотреть возможность автоматического расширения коллекции при
добавлении элемента в том случае, когда коллекция уже заполнена.
 */
public class MyArrayList<E> {

    private Object[] innerArray;
    private int size = 0;

    public MyArrayList() {
        innerArray = new Object[10];
    }

    public MyArrayList(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Illegal capacity: " + size);
        }
        innerArray = new Object[size];
    }

    public void add(E element) {
        if (size == innerArray.length) {
            increaseArray();
        }
        innerArray[size++] = element;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index < 0 or index > size");
        }
        if (size == innerArray.length) {
            increaseArray();
        }
        Object[] tempArray = new Object[innerArray.length];
        System.arraycopy(innerArray, 0, tempArray, 0, index);
        System.arraycopy(innerArray, index, tempArray, index + 1, innerArray.length - index - 1);
        tempArray[index] = element;
        innerArray = tempArray;
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index < 0 or index >= size");
        }
        return (E) innerArray[index];
    }

    public int indexOf(Object object) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (innerArray[i].equals(object)) {
                index = i;
            }
        }
        return index;
    }

    public boolean contains(Object object) {
        return indexOf(object) != -1;
    }

    public boolean remove(Object object) {
        int index = indexOf(object);
        if (index > -1) {
            remove(index);
            return true;
        } else {
            return false;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index < 0 or index >= size");
        }
        Object deletedObject = innerArray[index];
        Object[] tempArray = new Object[innerArray.length];
        System.arraycopy(innerArray, 0, tempArray, 0, index);
        System.arraycopy(innerArray, index + 1, tempArray, index, innerArray.length - index - 1);
        innerArray = tempArray;
        size--;
        return (E) deletedObject;
    }

    public void clear() {
        innerArray = new Object[10];
        size = 0;
    }

    private void increaseArray() {
        Object[] tempArray = new Object[(int) innerArray.length * 3 / 2 + 1];
        System.arraycopy(innerArray, 0, tempArray, 0, innerArray.length);
        innerArray = tempArray;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(innerArray[i].toString());
            if (i < size - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
