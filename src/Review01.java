
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double tax = 0.1;
        int taxPrice = tax(price, tax);
        int taxIncludePrice = price + taxPrice;
        System.out.println(price + "円の商品の税込価格は" + taxIncludePrice + "円（消費税は" + taxPrice + "円）です。");
    }
    public static int tax(int price, double tax) {
        int result = (int) (price * tax);
        return result;
    }

}
