package ua.nure.fokin.task2;

public class ListImpl<E> implements List<E> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    public E get(int index) {
        return (E) array[index];
    }

    public ListImpl() {

    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; i < size(); i++) {
            b.append(array[i].toString());
            b.append(", ");
        }
        b.append(']');
        if (b.lastIndexOf(" ") >= 0) {
            b.deleteCharAt(b.lastIndexOf(" "));
        }
        if (b.lastIndexOf(",") >= 0) {
            b.deleteCharAt(b.lastIndexOf(","));
        }

        return b.toString();
    }

    public void add(E el) {
        if (pointer == array.length - 1)
            resize(array.length * 2); // увеличу в 2 раза, если достигли границ
        array[pointer++] = el;
    }

    public void addAll(List<? extends E> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public Object remove(int index) {
        if (index > pointer - 1) throw new IndexOutOfBoundsException();
        Object result = array[index];
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];

        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length / 2); // если элементов в CUT_RATE раз меньше чем
        // длина массива, то уменьшу в два раза
        return result;
    }

    public int indexOf(Object el) {
        for (int i = 0; i < size(); i++) {
            if (el.equals(array[i])) return i;
        }
        return -1;
    }

    public boolean contains(Object el) {
        return (indexOf(el) >= 0);
    }

    public boolean remove(Object el) {
        int index = indexOf(el);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }

    public int size() {
        return pointer;
    }

    public void clear() {
        array = new Object[INIT_SIZE];
        pointer = 0;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int p = 0;

            @Override
            public boolean hasNext() {
                return (p <= pointer - 1);
            }

            @Override
            public E next() {
                E obj = get(p);
                p++;
                return obj;

            }

            @Override
            public void remove() {

                for (int i = p - 1; i < pointer; i++)
                    array[i] = array[i + 1];

                array[pointer] = null;
                pointer--;
                p--;
                if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
                    resize(array.length / 2);
            }
        };
    }

    public static void main(String[] args) {
        System.out.println("~~~ list A B C");
        System.out.println("~~~ Result: [A, B, C]");
        List<String> list = new ListImpl<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        System.out.println("~~~ list2: D E F");
        System.out.println("~~~ Result: [D, E, F]");
        List<String> list2 = new ListImpl<>();
        list2.add("D");
        list2.add("E");
        list2.add("F");
        System.out.println(list2);

        System.out.println("~~~ list.addAll(list2)");
        System.out.println("~~~ Result: [A, B, C, D, E, F]");
        list.addAll(list2);
        System.out.println(list);

        System.out.println("~~~ list.add(C)");
        System.out.println("~~~ Result: [A, B, C, D, E, F, C]");
        list.add("C");
        System.out.println(list);

        System.out.println("~~~ list.clear()");
        System.out.println("~~~ Result: []");
        list.clear();
        System.out.println(list);

        System.out.println("~~~ list.addAll(list2)");
        System.out.println("~~~ Result: [D, E, F]");
        list.addAll(list2);
        System.out.println(list);

        System.out.println("~~~ list.contains(E)");
        System.out.println("~~~ Result: true");
        System.out.println(list.contains("E"));

        System.out.println("~~~ list.contains(С)");
        System.out.println("~~~ Result: false");
        System.out.println(list.contains("C"));

        System.out.println("~~~ list.indexOf(D)");
        System.out.println("~~~ Result: 0");
        System.out.println(list.indexOf("D"));

        System.out.println("~~~ list.get(2)");
        System.out.println("~~~ Result: F");
        System.out.println(list.get(2));

        System.out.println("~~~ list.indexOf(F)");
        System.out.println("~~~ Result: 2");
        System.out.println(list.indexOf("F"));

        System.out.println("~~~ list.size()");
        System.out.println("~~~ Result: 3");
        System.out.println(list.size());

        System.out.println("~~~ list");
        System.out.println("~~~ Result: [D, E, F]");
        System.out.println(list);

        System.out.println("~~~ list.remove(1)");
        System.out.println("~~~ Result: [D, F]");
        list.remove(1);
        System.out.println(list);

        System.out.println("~~~ list.remove(F)");
        System.out.println("~~~ Result: [D]");
        list.remove("F");
        System.out.println(list);

        System.out.println("~~~ list.size()");
        System.out.println("~~~ Result: 1");
        System.out.println(list.size());

        System.out.println("~~~ list.addAll(list2)");
        System.out.println("~~~ Result: [D, D, E, F]");
        list.addAll(list2);
        System.out.println(list);

        System.out.println("~~~ foreach list");
        System.out.println("~~~ Result: D D E F");
        for (String el : list) {
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.println("~~~ Iterator it = list.iterator()");
        Iterator<String> it = list.iterator();

        System.out.println("~~~ it.next()");
        System.out.println("~~~ Result: D");
        System.out.println(it.next());

        System.out.println("~~~ it.next()");
        System.out.println("~~~ Result: D");
        System.out.println(it.next());

        System.out.println("~~~ it.remove()");
        System.out.println("~~~ Result: [D, E, F]");
        it.remove();
        System.out.println(list);
        System.out.println("~~~ it.next()");
        System.out.println("~~~ Result: E");
        System.out.println(it.next());

        System.out.println("~~~ it.remove()");
        System.out.println("~~~ Result: [D, F]");
        it.remove();
        System.out.println(list);

        System.out.println("~~~ it.next()");
        System.out.println("~~~ Result: F");
        System.out.println(it.next());

        System.out.println("~~~ it.remove()");
        System.out.println("~~~ Result: [D]");
        it.remove();
        System.out.println(list);

        System.out.println("~~~ list.remove(D)");
        System.out.println("~~~ Result: []");
        list.remove("D");
        System.out.println(list);

        System.out.println("~~~ list.addAll(list2)");
        System.out.println("~~~ Result: [D, E, F]");
        list.addAll(list2);
        System.out.println(list);

        System.out.println("~~~ foreach list");
        System.out.println("~~~ Result: D E F ");
        for (String el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
