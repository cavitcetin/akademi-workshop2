public class restaurant {
    public static void main(String[] args) {
        String[] menuItems = {"Köfte", "Kebap", "Pilav", "Çorba", "Salata"};
        double[] prices = {25.50, 30.75, 15.25, 10.00, 12.50};
        int[] popularity = {5, 4, 3, 4, 5};

        System.out.println("Restoran Menüsü");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println("Yemek: " + menuItems[i] + " - Fiyat: " + prices[i] +
                    " TL - Popüledrlik: " + popularity[i]);
        }
    }
}
