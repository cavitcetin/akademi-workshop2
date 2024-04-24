public class shoppingCart {
    public static void main(String[] args) {
        String[] productNames = {"Elma", "Armut", "Portakal", "Muz"};
        double[] productPrices = {2.50, 3.00, 2.75, 1.80};
        int[] productQuantities = {3, 2, 1, 4};

        System.out.println("Sepetinizdeki Ürünler:");
        for (int i = 0; i < productNames.length; i++) {
            System.out.println("Ürün adı: " + productNames[i] +
                    ", Fiyat: " + productPrices[i] +
                    " TL, Miktar: " + productQuantities[i]);
        }

        double totalAmount = 0;
        for (int i = 0; i < productNames.length; i++) {
            totalAmount += productPrices[i] * productQuantities[i];
        }
        System.out.println("\nToplam Tutar: " + totalAmount + " TL");
    }
}
