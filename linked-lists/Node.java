public class Node {
    public int value;
    public Node next;

    public static void main(String[] args) {
        Node head = null;

        for (int i = 1; i <= 10; i++) {
            head = Node.append(head, i);
        }

        head = Node.delete(head, 9);
        head = Node.delete(head, 8);
        Node.show(head);


    }

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node (int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public static void show(Node head) {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.printf("%s -> ", currentNode);
            currentNode = currentNode.next;
        }

        System.out.println(currentNode);
    }

    public static Node append(Node head, int value) {
        Node node = new Node(value, null);
        Node currentNode = head;

        if (currentNode == null) {
            head = node;
            return head;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = node;

            return head;
        }
    }

    public static Node insert(Node head, int value) {
        return new Node(value, head);
    }

    public static Node insert(Node head, int value, int position) {
        Node node = new Node(value, null);

        int i = 0;
        Node currentNode = head;

        if (position == 0) {
            return insert(head, value);
        }

        while (i + 1 != position) {
            currentNode = currentNode.next;
            i++;
        }

        node.next = currentNode.next;
        currentNode.next = node;

        return head;
    }

    public static Node pop(Node head) {
        if (head == null || head.next == null) return null;

        Node currentNode = head;

        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = null;

        return head;
    }

    public static Node delete(Node head) {
        if (head == null || head.next == null) return null;

        return head.next;
    }

    public static Node delete(Node head, int position) {
        if (position == 0) {
            return delete(head);
        } else {
            int i = 0;
            Node currentNode = head;

            while (i+1 != position) {
                currentNode = currentNode.next;
                i++;
            }

            currentNode.next = currentNode.next.next;
        }

        return head;
    }

    @Override
    public String toString() {
        return String.format("%d", this.value);
    }
}
