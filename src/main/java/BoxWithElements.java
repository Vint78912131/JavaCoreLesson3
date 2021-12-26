import java.util.Arrays;

public class BoxWithElements <T>{
    private T[] elements;

    public BoxWithElements(T[] elements) {
        this.elements = elements;
    }

    public T[] swap(int i, int j) {//Insert indexes of swapping elements. Usual numbering of elements.
        if (i - 1 > elements.length - 1 || j - 1 > elements.length - 1 || i - 1 < 0 || j - 1 < 0) {
            System.out.println("Index i = " + i + ", index j =" + j);
            System.out.println("Required indexes from " + 1 + " to " + elements.length + " inclusive.");
            System.out.println("Indexes out of array range!");
        }
        else {
            T a = elements[i -1];
            elements[i - 1] = elements[j - 1];
            elements[j - 1] = a;
        }
     return this.getElements();
    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }


    @Override
    public String toString() {
        return "{elements=" + Arrays.toString(elements) + '}';
    }

}
