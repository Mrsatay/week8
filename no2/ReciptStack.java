public class ReciptStack {
    Receipt top;

    public ReciptStack() {
        top = null;
    }

    public void push(Receipt receipt) {
        receipt.next = top;
        top = receipt;
    }

    public Receipt pop() {
        if (top == null) {
            return null;
        } else {
            Receipt popped = top;
            top = top.next;
            popped.next = null;
            return popped;
        }
    }

    public void printAllReceipts() {
        Receipt current = top;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}


