import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {
    private NodeLinkedList<E> first;  //ссылка на первый элемент списка
    private NodeLinkedList<E> next;  //ссылка на последний элемент списка
    private int sizeLinkedList = 0;  //размер списка

    //инициализация списка
    public MyLinkedList() {
        next = new NodeLinkedList<E>(first, null, null);
        first = new NodeLinkedList<>(null ,null, next);
    }

    public void addData(E data) { //вставка элемента в конец списка
        NodeLinkedList<E> newData = next; //создали новый элемент
        newData.setData(data);
        next = new NodeLinkedList<>(newData, null, null);  //создали последний элемент
        newData.setNext(next); //новый элемент указывает на последний элемент
        sizeLinkedList++; //размер списка увеличили
    }

    public int size() {  //получение размера списка
      return sizeLinkedList;
    }

    public E getDataByIndex(int index) { //получение элемента по индексу
        if (index >= sizeLinkedList) {
            System.out.println("Вы пытаетесь получить элемент по несуществующему индексу!");
            return null;
        } else {
            NodeLinkedList<E> currNode = first.getNext();
            for (int i = 0; i < index; i++) {
                currNode = currNode.getNext();
            }
            return currNode.getData();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int ind = 0;
            @Override
            public boolean hasNext() {
                return ind < sizeLinkedList;
            }

            @Override
            public E next() {
                return getDataByIndex(ind++);
            }
        };
    }
}
