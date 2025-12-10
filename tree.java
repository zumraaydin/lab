
    public class BinaryTree {

        private Node root;

        // ---------- ADD NODE (ITERATIVE) ----------
        public void addNode(int data) {
            Node newNode = new Node(data);

            // if tree empty, new node is root
            if (root == null) {
                root = newNode;
                return;
            }

            Node current = root;
            Node parent  = null;

            while (current != null) {
                parent = current;

                if (data < current.data) {
                    current = current.left;
                } else if (data > current.data) {
                    current = current.right;
                } else {
                    // data already exists, do nothing (no duplicates)
                    return;
                }
            }

            // attach new node to the correct side of parent
            if (data < parent.data) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }

        // ---------- SEARCH NODE (ITERATIVE) ----------
        public boolean searchNode(int data) {
            Node current = root;

            while (current != null) {
                if (data == current.data) {
                    return true;
                } else if (data < current.data) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }

            return false;
        }

        // ---------- REMOVE NODE (ITERATIVE) ----------
        public void removeNode(int data) {
            Node current = root;
            Node parent  = null;

            // 1) Find node and its parent
            while (current != null && current.data != data) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }

            // Not found
            if (current == null) {
                return;
}
