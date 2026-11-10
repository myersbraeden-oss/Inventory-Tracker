import java.math.BigDecimal;


public class Main{

    public void main(String[] args){


        Item Cigar = new Item("MF", 11, 100, "Ashton");

        Cigar.setPrice(12);

        System.out.printf("$%.2f%n", Cigar.getPrice());

    }
    
}