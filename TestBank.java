public class TestBank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.depositCheckingBalance(239.5);
        account1.depositSavingBalance(10.6);
        account1.withdrawCheckingBalance(100);
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingBalance());
        System.out.println(account1.getTotalBalance());

        BankAccount account2 = new BankAccount();
        account2.depositCheckingBalance(250.5);
        account2.depositSavingBalance(1400.0);
        account2.withdrawSavingBalance(300);
        System.out.println(account2.getCheckingBalance());
        System.out.println(account2.getSavingBalance());
        System.out.println(account2.getTotalBalance());
    }
}
