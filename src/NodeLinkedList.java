public class NodeLinkedList<E> { //отдельная Node списка
    private NodeLinkedList<E> prev; //ссылка на предыдущий элемент
    private E data; //текущий элемент (данные)
    private NodeLinkedList<E> next; //ссылка на следующий элемент

    public NodeLinkedList(NodeLinkedList<E> prev, E data, NodeLinkedList<E> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public NodeLinkedList<E> getNext() {
        return next;
    }

    public NodeLinkedList<E> getPrev() {
        return prev;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setNext(NodeLinkedList<E> next) {
        this.next = next;
    }

    public void setPrev(NodeLinkedList<E> prev) {
        this.prev = prev;
    }
}
