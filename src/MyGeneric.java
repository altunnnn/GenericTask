public class MyGeneric<T> {
    T obj;

    void add(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
