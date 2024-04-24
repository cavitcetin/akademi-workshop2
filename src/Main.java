public class Main {
    public static void main(String[] args) {
        String[] productNames = {"Ürün1", "Ürün2", "Ürün3"};
        double[] productPrices = {10.50, 20.25, 15.75};
        int[] productQuantities = {100, 50, 75};

        System.out.println("Günlük Satış Miktarı ve Toplam Satış Geliri");
        double totalRevenue = 0;
        for(int i = 0; i < productNames.length; i++) {
            double productRevenue = productPrices[i] * productQuantities[i];
            totalRevenue += productRevenue;
            System.out.println(productNames[i] + " - Satış Miktarı: " + productQuantities[i] + ", Birim Fiyat: " + productPrices[i] +
                    " TL, Toplam Gelir: " + productRevenue + " TL");
        }
        System.out.println("Toplam Satış Geliri: " + totalRevenue + " TL");

    }

}