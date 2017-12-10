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
            numbers[counter]=b;
            counter++;
        }
        return numbers;
    }

    public void printFibonachiList(){
        int [] fibonachiList = this.generateList();
        StringBuffer listNumbers = new StringBuffer();
        String devider = ", ";
        listNumbers.append("List : [");
        for(int num : fibonachiList){
            if (num==fibonachiList[fibonachiList.length-1])
                devider="";
            listNumbers.append(num+devider);
        }
        listNumbers.append("]");
        System.out.println(listNumbers);
    }
}
