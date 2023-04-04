package week8.no1;

public class Stack {
    
    int size;
    int top;
    Clothes data[];

    public Stack(int size){

        this.size = size;
        data = new Clothes[size];
        top = -1;

    }

    public boolean IsEmpty(){

        if (top == -1){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean IsFull(){

        if (top == size - 1){
            return true;
        }
        else{
            return false;
        }

    }

    public void push(Clothes cth){

        if (!IsFull()){
            top++;
            data[top] = cth;
        }
        else{
            System.out.println("Isi stack penuh!");
        }

    }

    public void pop(){

        if (!IsEmpty()){
            Clothes x = data[top];
            top--;
            System.out.println("Data yang keluar: "+ x.kind + " " + x.colour +
                    " " + x.brand + " " + x.size + " " + x.price);
        }
        else{
            System.out.println("Stack masih kosong");
        }

    }

    public void peek(){
        System.out.println("Elemen teratas: " + data[top].kind + " "+
                data[top].colour + " " + data[top].brand + " " + data[top].size + 
                " " + data[top].price);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--){
            System.out.println(data[i].kind + " " + data[i].colour + " " + 
                    data[i].brand + " " + data[i].size + " " + data[i].price + " ");
        }
        System.out.println("");
    }

    public void clear(){

        if (!IsEmpty()){
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }
        else{
            System.out.println("Stack masih kosong");
        }

    }

    public void getMin(){


        System.out.println("Setelah disorting ke urutan yang terkecil");

        // sorting to the ascending
        for (int i = 1; i < data.length; i++) {
            double key = data[i].price;
            int j = i - 1;
            while (j >= 0 && data[j].price > key) {
                data[j+ 1].price = data[j].price;
                j--;
            }
            data[j+ 1].price = key;
        }

        for (int i = 1; i < data.length; i++) {
            
            System.out.println(data[i].kind + " " + data[i].colour + " " + 
                    data[i].brand + " " + data[i].size + " " + data[i].price + " ");

        }

    }

}
