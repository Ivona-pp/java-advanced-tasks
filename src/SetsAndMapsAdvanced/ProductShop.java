package SetsAndMapsAdvanced;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Map<String, Double>> shop = new TreeMap<>();
        //Map<String, List<Double>> shopWithPrice = new TreeMap<>();
        String command = sc.nextLine();
        while (!command.equals("Revision")) {
            String[] shopContent = command.split(", ");
            String shopName = shopContent[0];
            String product = shopContent[1];
            double price = Double.parseDouble(shopContent[2]);
            shop.putIfAbsent(shopName, new LinkedHashMap<>());
            shop.get(shopName).put(product,price);
            command = sc.nextLine();
        }

        for (Map.Entry<String, Map<String,Double>> entry:shop.entrySet()) {
            System.out.printf("%s->%n",entry.getKey());
            for (Map.Entry<String, Double> entry2 : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n",entry2.getKey(),entry2.getValue());
            }

        }
    }

}