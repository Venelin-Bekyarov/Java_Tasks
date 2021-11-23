public class doubleDynamicList {
    private Node top;
    private Node bottom;
    private int compile;

    public doubleDynamicList() {
        this.top = null;
        this.bottom = null;
        this.compile = 0;
    }

    public static void main(String[] args) {
        doubleDynamicList List = new doubleDynamicList();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        List.remove(3);


        for (int i = 0; i < List.getLength(); i++) {
            System.out.println(List.elementAt(i));
        }
        System.out.println(List.elementAt(1));
        System.out.println(List.indexOf(1));
    }

    public void add(Object module) {
        if (top == null) {
            top = new Node(module);
            bottom = top;
        } else {
            Node newNode = new Node(module, bottom);
            bottom = newNode;
        }
        compile++;
    }

    public Object remove(int mark) {
        if (mark >= compile || mark < 0) {
            throw new IndexOutOfBoundsException(
                    "Invalid marker: " + mark);
        }
        int currentIndex = 0;
        Node presentNode = top;
        Node formerNode = null;
        while (currentIndex < mark) {
            formerNode = presentNode;
            presentNode = presentNode.upcome;
            currentIndex++;
        }
        compile--;
        if (compile == 0) {
            top = null;
            bottom = null;
        } else if (formerNode == null) {
            top = presentNode.upcome;
        } else {
            formerNode.upcome = presentNode.upcome;
        }
        return presentNode.segment;
    }

    public int remove(Object module) {
        int presentMark = 0;
        Node presentNode = top;
        Node formerNode = null;
        while (presentNode != null) {
            if ((presentNode.segment != null &&
                    presentNode.segment.equals(module)) ||
                    (presentNode.segment == null) && (module == null)) {
                break;
            }
            formerNode = presentNode;
            presentNode = presentNode.upcome;
            presentMark++;
        }
        if (presentNode != null) {
            compile--;
            if (compile == 0) {
                top = null;
                bottom = null;
            } else if (formerNode == null) {
                top = presentNode.upcome;
            } else {
                formerNode.upcome = presentNode.upcome;
            }
            return presentMark;
        } else {
            return -1;
        }
    }

    public int getLength() {
        return compile;
    }

    public int indexOf(Object element) {
        int mark = 0;
        Node present = top;
        while (present != null) {
            if ((present.segment != null && present.segment.equals(element))
                    || (present.segment == null) && (element == null)) {
                return mark;
            }
            present = present.upcome;
            mark++;
        }
        return -1;
    }

    public Object elementAt(int mark) {
        if (mark >= compile || mark < 0) {
            throw new IndexOutOfBoundsException(
                    "Invalid index: " + mark);
        }
        Node currentNode = this.top;
        for (int i = 0; i < mark; i++) {
            currentNode = currentNode.upcome;
        }
        return currentNode.segment;
    }

    private class Node {
        Object segment;
        Node upcome;
        Node former;

        Node(Object segment, Node prevNode) {
            this.segment = segment;
            prevNode.upcome = this;
            this.upcome = upcome;
            this.former = former;
        }

        Node(Object element) {
            this.segment = element;
            upcome = null;
        }
    }
}