public class Customer  implements Runnable {
    private int amountOfProducts;
    private Enum [] listsOfProducts;
    CashDesk cashDesk;
    private int nomerPokupatelia;

    public Customer(int amountOfProducts, CashDesk cashDesk, int nomerPokupatelia) {
        this.amountOfProducts = amountOfProducts;
        this.cashDesk = cashDesk;
        this.nomerPokupatelia = nomerPokupatelia;
        System.out.println("Customer " + nomerPokupatelia + " in shop.");
    }

    private void takeProducts() {
        listsOfProducts = new Enum[amountOfProducts];
        int num;
        for (int i = 0; i < listsOfProducts.length; i++) {
            num = (int) (Math.random() * 6);
            switch (num) {
                case 0:
                    listsOfProducts[i] = ProductsCustomer.FISH;
                    break;
                case 1:
                    listsOfProducts[i] = ProductsCustomer.CAKE;
                    break;
                case 2:
                    listsOfProducts[i] = ProductsCustomer.MILK;
                    break;
                case 3:
                    listsOfProducts[i] = ProductsCustomer.VEGETABLES;
                    break;
                case 4:
                    listsOfProducts[i] = ProductsCustomer.CHEESE;
                    break;
                case 5:
                    listsOfProducts[i] = ProductsCustomer.BREAD;
                    break;
            }
        }
//        System.out.print("Products of Customer " + nomerPokupatelia + " - ");
//        for (int j = 0; j < listsOfProducts.length; j++) {
//            System.out.print (listsOfProducts [j] + " ");
//        }
//        System.out.println();
    }

    @Override
    public void run() {
        System.out.println("Customer " + nomerPokupatelia + " is taking products");
        takeProducts();
        cashDesk.workWithCustomer(nomerPokupatelia);
        System.out.println("Customer " + nomerPokupatelia + " leaved cash desk.");
    }
}
