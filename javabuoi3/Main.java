package javabuoi3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // create some products
        Product p1 = new Product("sp4", "Nuóc tuong", 8000);
        Product p2 = new Product("sp1", "Gạo", 18000);
        Product p3 = new Product("sp3", "Đường", 10000);
        Product p4 = new Product("sp1", "Gạo", 18000);
        Order order = new Order(1, LocalDate.of(2015, 9, 10));
        order.addLineItem(p1, 10);
        order.addLineItem(p2, 5);
        order.addLineItem(p3, 1);
        order.addLineItem(p4, 1);
        System.out.println("Ma HD: " + order.getOrderID());
        System.out.println("Ngay lap hoa don: " + order.getOrderDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("| STT| MASP | Mo ta                     | Don gia              | So luong |      Thanh tien  |");
        int stt = 1;
        for (Orderdetail item : order.getLineItems()) {
            Product product = item.getProduct();
            double price = product.getPrice();
            int quantity = item.getQuantity();
            double lineItemTotal = item.calcTotalPrice();
            System.out.printf("| %-3d| %-5s| %-26s| %,17.0f VND| %,8d | %,17.0f VND|%n", stt, product.getProductID(), product.getDescription(), price, quantity, lineItemTotal);
            stt++;
        }
       
        System.out.printf("|%-4s| %-5s| %-26s| %-18s|%-9s|%,17.0fVND |%n", "", "", "Tong tien thanh toan:",  "", "", order.calcTotalCharge());
        
    }
}
