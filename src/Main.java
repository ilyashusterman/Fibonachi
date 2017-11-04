import patterns.Fibonachi;

public class Main {

    public static void main(String[] args) {
        Fibonachi fibonachi = new Fibonachi(9);
        int [] fibonachiList = fibonachi.generateList();
        StringBuffer listNumbers = new StringBuffer();
        listNumbers.append("List : [");
        for(int num : fibonachiList){
            listNumbers.append(", "+num);
        }
        listNumbers.append(" ]");
        System.out.println(listNumbers);
    }
}
