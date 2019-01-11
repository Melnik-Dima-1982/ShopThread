public class Shop {
    private int amountOfWorkingDesksNow;
    private int amountOfCustomers;

    public Shop(int amountOfWorkingDesksNow, int amountOfCustomers) {
        this.amountOfWorkingDesksNow = amountOfWorkingDesksNow;
        this.amountOfCustomers = amountOfCustomers;
    }

    public void serviceOfVisitors() {
        CashDesk [] listOfCashDesks = new CashDesk[amountOfWorkingDesksNow];
        for (int i = 0; i < listOfCashDesks.length ; i++) {
            listOfCashDesks [i] = new CashDesk(true, i);
        }
        for (int i = 0; i < amountOfCustomers; i++){
           Thread cus = new Thread(new Customer(((int) ((Math.random() * 3) + 1)), listOfCashDesks [((int) (Math.random() * 2))], i));
           cus.start();
        }
    }
}
