public class Receipt {
    int transactionId;
    String date;
    int itemQty;
    int totalPrice;
    Receipt next;

    public Receipt(int transactionId, String date, int itemQty, int totalPrice) {
        this.transactionId = transactionId;
        this.date = date;
        this.itemQty = itemQty;
        this.totalPrice = totalPrice;
        this.next = null;
    }

    public String toString() {
        return "Transaction ID: " + transactionId + "\n" +
                "Date: " + date + "\n" +
                "Item Quantity: " + itemQty + "\n" +
                "Total Price: " + totalPrice + "\n";
    }
}


