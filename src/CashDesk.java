public class CashDesk {
    private boolean isWorking;
    private final int numOfCashdesk;

    public CashDesk(boolean isWorking, int numOfCashdesk) {
        this.isWorking = isWorking;
        this.numOfCashdesk = numOfCashdesk;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public int getNumOfCashdesk() {
        return numOfCashdesk;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public synchronized void workWithCustomer (int customer){
        System.out.println("CashDesk №" + numOfCashdesk + " is servicing customer " + customer +  " now.");
    }

}
