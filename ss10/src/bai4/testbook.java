package bai4;

public class testbook {
    public static void main(String[] args) {
        book b1=new book();
        b1.setPrice(123);
        b1.setAuthor("Dũng");
        b1.setTitle("I don't know");
        System.out.println("Giá: "+ b1.getPrice());
        b1.setPrice(-1123);
    }
}
