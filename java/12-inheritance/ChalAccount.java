import java.util.Scanner;

public class ChalAccount {

    // Super Class
    public static class Accounts {

        // Properties
        private long accNo;
        private String name;
        private String address;
        private String phoneNo;
        private String dob;
        private double balance;

        // Default Constructor
        public Accounts() {
            this.accNo = 0;
            this.name = "";
            this.address = "";
            this.phoneNo = "";
            this.dob = "";
            this.balance = 0.0;
        }

        // Parameterized Constructor
        public Accounts(long accNo,
                        String name,
                        String address,
                        String phoneNo,
                        String dob,
                        double initialBalance) {
            this.accNo = accNo;
            this.name = name;
            this.address = address;
            this.phoneNo = phoneNo;
            this.dob = dob;
            this.balance = initialBalance;
        }

        // Getters (all properties)
        public long getAccNo() {
            return accNo;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public String getDob() {
            return dob;
        }

        public double getBalance() {
            return balance;
        }

        // Setters (properties that are allowed to change)
        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        // Methods
        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("Successfully deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Validation
        public boolean isAccountValid() {
            if (this.accNo <= 0) return false;
            if (this.name == null || this.name.trim().isEmpty()) return false;
            if (this.address == null || this.address.trim().isEmpty()) return false;
            if (this.phoneNo == null || this.phoneNo.trim().isEmpty()) return false;
            if (this.dob == null || this.dob.trim().isEmpty()) return false;
            return true;
        }
    }

    // Savings Account Subclass
    public static class SavingsAccount extends Accounts {

        private double interestRate;
        private boolean isClosed;
        private double fixedDepositBalance;

        // Constructor mapping arguments to Super Class
        public SavingsAccount(long accNo, String name, String address, String phoneNo, String dob, double initialBalance, double interestRate) {
            super(accNo, name, address, phoneNo, dob, initialBalance);
            this.interestRate = interestRate;
        }

        public void withdraw(double amount) {
            if (isClosed) {
                System.out.println("Go to another Bank.");
                return;
            }

            if (getBalance() >= amount) {
                super.deposit(-amount);
                System.out.println("Successfully withdrew: " + amount);
            } else {
                System.out.println("Ga o na zaka.");
            }
        }

        public void createFixedDeposit(double amount) {
            if (getBalance() >= amount) {
                super.deposit(-amount);
                this.fixedDepositBalance += amount;
                System.out.println("Fixed Deposit created for: " + amount);
            } else {
                System.out.println("Not enough zaka.");
            }
        }

        public void closeAccount() {
            double totalPayout = getBalance() + fixedDepositBalance;
            super.deposit(-getBalance());
            this.fixedDepositBalance = 0;
            this.isClosed = true;
            System.out.println("Account closed. Paid out: " + totalPayout);
        }
    }

    // Loan Account Subclass
    public static class LoanAccount extends Accounts {
        private double loanAmount;
        private double interestRate;

        // Constructor mapping arguments to Super Class
        public LoanAccount(long accNo, String name, String address, String phoneNo, String dob, double loanAmount, double interestRate) {
            super(accNo, name, address, phoneNo, dob, 0.0); //Calling superclass properties
            this.loanAmount = loanAmount;
            this.interestRate = interestRate;
        }

        public void topUpLoan(double additionalAmount) {
            this.loanAmount += additionalAmount;
            System.out.println("Loan topped up. Total debt: " + this.loanAmount);
        }

        public void makeRepayment(double paymentAmount) {
            this.loanAmount -= paymentAmount;
            System.out.println("Paid: " + paymentAmount + ". Remaining debt: " + this.loanAmount);

            if (this.loanAmount <= 0) {
                this.loanAmount = 0;
                System.out.println("Your loan is fully paid off!");
            }
        }
    }

        public static void main(String[] args) {

            // 1. SAVINGS ACCOUNT TESTING
            System.out.println("--- Testing Savings Account ---");

            Scanner sc = new Scanner(System.in);

            System.out.println("=== Create New Savings Account ===");

            System.out.print("Account number: ");
            long accountNumber = Long.parseLong(sc.nextLine().trim());

            System.out.print("Full name: ");
            String name = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Phone number: ");
            String phone = sc.nextLine();

            System.out.print("Date of birth (YYYY-MM-DD): ");
            String dob = sc.nextLine();

            System.out.print("Initial deposit amount: R");
            double balance = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Interest rate (e.g., 0.05 for 5%): ");
            double interestRate = Double.parseDouble(sc.nextLine().trim());

            // New object to access the properties
            ChalAccount.SavingsAccount savings = new ChalAccount.SavingsAccount(
                    accountNumber,
                    name,
                    address,
                    dob,
                    phone,
                    balance,
                    interestRate);

            // Validation

            boolean running = true;
            while (running) {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Withdraw");
                System.out.println("2. Create Fixed Deposit");
                System.out.println("3. Close Account");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                String choice = sc.nextLine().trim();

                // Switch cases on the user input
                switch (choice) {
                    case "1":
                        System.out.print("Amount to withdraw: R");
                        double withdrawAmount = Double.parseDouble(sc.nextLine().trim());
                        savings.withdraw(withdrawAmount);
                        break;
                    case "2":
                        System.out.print("Amount for fixed deposit: R");
                        double depositAmount = Double.parseDouble(sc.nextLine().trim());
                        savings.createFixedDeposit(depositAmount);
                        break;
                    case "3":
                        savings.closeAccount();
                        running = false;
                        break;
                    case "4":
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option, please try again.");
                }
            }

            System.out.println("Goodbye!");
            sc.close();

            /* System.out.println("\n----------------------------------\n");

            // 2. LOAN ACCOUNT TESTING
            System.out.println("--- Testing Loan Account ---");

            Scanner loan = new Scanner(System.in);
             */

    }
}