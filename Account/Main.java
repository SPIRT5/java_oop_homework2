public class Main {
    public static void main(String[] args) {
        SimpleAccount simple = new SimpleAccount(1000);
        CreditAccount credit = new CreditAccount(500);

        System.out.println("Initial Balances:");
        System.out.println("SimpleAccount: " + simple.getBalance());
        System.out.println("CreditAccount: " + credit.getBalance());

        System.out.println("\nPaying 300 from SimpleAccount: " + simple.pay(300));
        System.out.println("SimpleAccount balance: " + simple.getBalance());

        System.out.println("\nPaying 400 from CreditAccount: " + credit.pay(400));
        System.out.println("CreditAccount balance: " + credit.getBalance());

        System.out.println("\nTransferring 200 from SimpleAccount to CreditAccount: " + simple.transfer(credit, 600));
        System.out.println("SimpleAccount balance: " + simple.getBalance());
        System.out.println("CreditAccount balance: " + credit.getBalance());
        System.out.println("\nAdding 500 to CreditAccount: " + credit.add(500));
        System.out.println("CreditAccount balance: " + credit.getBalance());
    }
}