public class MainReceipt {
    public static void main(String[] args) {
        
        ReciptStack receiptStack = new ReciptStack();

        // Adding sample receipts
        Receipt receipt1 = new Receipt(1, "2023-03-01", 3, 50000);
        Receipt receipt2 = new Receipt(2, "2023-03-08", 5, 120000);
        Receipt receipt3 = new Receipt(3, "2023-03-15", 2, 30000);
        Receipt receipt4 = new Receipt(4, "2023-03-22", 4, 80000);
        Receipt receipt5 = new Receipt(5, "2023-03-29", 1, 15000);
        Receipt receipt6 = new Receipt(6, "2023-04-01", 6, 200000);
        Receipt receipt7 = new Receipt(7, "2023-04-03", 3, 75000);
        Receipt receipt8 = new Receipt(8, "2023-04-05", 2, 40000);

        receiptStack.push(receipt1);
        receiptStack.push(receipt2);
        receiptStack.push(receipt3);
        receiptStack.push(receipt4);
        receiptStack.push(receipt5);
        receiptStack.push(receipt6);
        receiptStack.push(receipt7);
        receiptStack.push(receipt8);

        // Getting all receipts in the stack
        receiptStack.printAllReceipts();

        // Popping the top receipt from the stack
        Receipt poppedReceipt = receiptStack.pop();
        System.out.println("Popped Receipt: ");
        System.out.println(poppedReceipt);

        // Getting all remaining receipts in the stack
        receiptStack.printAllReceipts();
    }
}
