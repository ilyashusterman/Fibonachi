package patterns;

public class Fibonachi {
    private int length;

    public Fibonachi(int length){
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] generateList() {
        int counter = 0;
        int a = 1;
        int b = 0;
        int [] numbers= new int [this.length];
        while (this.length> counter){
            int num = a;
            a= b+a;
            b = num;
            numbers[counter]=a;
            counter++;
        }
        return numbers;
    }
}
