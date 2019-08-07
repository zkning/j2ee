package iterator;

public class NameRepository implements Container {

    public String[] array;

    public NameRepository(String[] array) {
        this.array = array;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator(this.array);
    }

    public static void main(String[] args) {
        String[] array = {"joha", "b", "cc", "ddd"};
        NameRepository nameRepository = new NameRepository(array);
        Iterator iterator = nameRepository.getIterator();
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());
    }
}

class NameIterator implements Iterator {
    public String[] array;
    private int index;

    public NameIterator(String[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Object next() {
        String val = array[index];
        index++;
        return val;
    }
}
