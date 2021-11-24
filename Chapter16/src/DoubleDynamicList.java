import java.util.Arrays;

public class DoubleDynamicList {
    private Node top;
    private Node bottom;
    private int compile;


    public static void main(String[] args) {
        DoubleDynamicList list = new DoubleDynamicList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.delete(3);

        list.print();

        System.out.printf("%nArray view type: %s %n", Arrays.toString(list.makeArray()));
        System.out.printf("At selected index is located element: %d ", list.indexingElements(3));
    }

    public void insert(Object module) {
        if (top == null) {
            top = new Node(module);
            bottom = top;
        } else {
            Node newNode = new Node(module, null, bottom);
            bottom.upcome = newNode;
            bottom = newNode;
        }
        compile++;
    }

    public void print() {
        Node present = top;
        if (top == null) {
            System.out.println("DoubleLinkedList is empty!");
            return;
        }
        System.out.println("Node of DoubleLinkedList: ");
        while (present != null) {
            System.out.print(present.segment + " ");
            present = present.upcome;
        }
    }

    public Object delete(int mark) {
        if (mark >= compile || mark < 0) {
            throw new IndexOutOfBoundsException(
                    "Invalid marker: " + mark);
        }
        int currentIndex = 0;
        Node presentNode = top;
        while (mark > currentIndex) {
            presentNode = presentNode.upcome;
            currentIndex++;
        }
        Object rate = presentNode.segment;
        compile--;
        if (compile == 0) {
            top = null;
            bottom = null;
        } else if (presentNode.former == null) {
            top = presentNode.upcome;
            presentNode.upcome.former = null;
        } else if (presentNode.upcome == null) {
            bottom = presentNode.former;
            bottom.upcome = null;
        } else {
            presentNode.former.upcome = presentNode.upcome;
            presentNode.upcome.former = presentNode.former;
        }
        return rate;
    }

    public int getLength() {
        return compile;
    }

    public Object[] makeArray() {
        Object[] arrayOfElmnts = new Object[compile];
        Node present = top;
        int i = 0;
        while (present != null) {
            arrayOfElmnts[i] = present.segment;
            i++;
            present = present.upcome;
        }
        return arrayOfElmnts;
    }

    public int indexingElements(Object item) {
        int mark = 0;
        Node present = top;
        while (present != null) {
            if ((present.segment != null && present.segment.equals(item))
                    || (present.segment == null) && (item == null)) {
                return mark;
            }
            present = present.upcome;
            mark++;
        }
        return mark - 1;
    }

    private class Node {
        public Object segment;
        public Node upcome;
        public Node former;

        public Node(Object segment, Node upcome, Node former) {
            this.segment = segment;
            this.upcome = upcome;
            this.former = former;
        }

        Node(Object element) {
            this.segment = element;
            upcome = null;
            former = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "segment=" + segment +
                    ", upcome=" + upcome +
                    ", former=" + former +
                    '}';
        }
    }

}
