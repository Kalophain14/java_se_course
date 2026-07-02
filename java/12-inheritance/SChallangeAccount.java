public class SChallangeAccount {

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
            // Initialized with safe default values
            this.accNo = 0;
            this.name = "";
            this.address = "";
            this.phoneNo = "";
            this.dob = "";
            this.balance = 0.0;
        }

        // Parameterized Constructor
        public Accounts(long accNo, String name, String address, String phoneNo, String dob, double initialBalance) {
            this.accNo = accNo;
            this.name = name;
            this.address = address;
            this.phoneNo = phoneNo;
            this.dob = dob;
            this.balance = initialBalance;
        }

        // Getters (all properties)
        public long getAccNo() { return accNo; }
        public String getName() { return name; }
        public String getAddress() { return address; }
        public String getPhoneNo() { return phoneNo; }
        public String getDob() { return dob; }
        public double getBalance() { return balance; }

        // Setters (properties that are allowed to change)
        public void setName(String name) { this.name = name; }
        public void setAddress(String address) { this.address = address; }
        public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }

        // Methods

        //deposit Method
        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount; // stores the balance
                System.out.println("Successfully deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Validation Method
        // Checks if properties values are met
        // Rule: Returns false if strings are null/empty, or
        // if the account number isn't set
        public boolean isAccountValid() {
            if (this.accNo <= 0)
                return false;
            if (this.name == null || this.name.trim().isEmpty())
                return false;
            if (this.address == null || this.address.trim().isEmpty())
                return false;
            if (this.phoneNo == null || this.phoneNo.trim().isEmpty())
                return false;
            if (this.dob == null || this.dob.trim().isEmpty())
                return false;

            return true;
        }
    }


    // SavingsAccount Inherits from Accounts Superclass
    public static class SavingsAccount extends Accounts {

        private double interestRate;

        // Default Constructor
        public SavingsAccount() {
            super();
            this.interestRate = 0.05; //
        }

        // Parameterized Constructor
        public SavingsAccount(long accNo,
                              String name,
                              String address,
                              String phoneNo,
                              String dob,
                              double initialBalance,
                              double interestRate) {
            super(accNo, name, address, phoneNo, dob, initialBalance); //Accessing Superclass
            this.interestRate = interestRate;
        }

        // Getter and Setter for Savings property
        public double getInterestRate() {
            return interestRate;
        }
        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        // Method for calculating the interest rate
        public void applyInterest() {

            double interestEarned = getBalance() * interestRate;
            deposit(interestEarned);
            System.out.println("Interest applied: " + interestEarned);
        }
    }


    // LoanAccount Inherits from Accounts Superclass
    public static class LoanAccount extends Accounts {

        // Properties
        private double loanAmount;
        private double interestRate;

        // Default Constructor
        public LoanAccount() {
            super(); // Initializes the parent class properties
            this.loanAmount = 0.0;
            this.interestRate = 0.0;
        }

        // Parameterized Constructor
        public LoanAccount(long accNo, String name, String address, String phoneNo, String dob,
                           double loanAmount, double interestRate) {
            // Passes the details of parent/superClass constructor
            super(accNo, name, address, phoneNo, dob, 0.0);
            this.loanAmount = loanAmount;
            this.interestRate = interestRate;
        }

        // Getters & Setters
        public double getLoanAmount() { return loanAmount; }
        public double getInterestRate() { return interestRate; }

        public void setLoanAmount(double loanAmount) { this.loanAmount = loanAmount; }
        public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

        // Methods

        // Applies interest to the outstanding loan amount
        public void applyLoanInterest() {
            double interestOwed = this.loanAmount * this.interestRate;
            this.loanAmount += interestOwed;
            System.out.println("Interest applied. New loan balance: " + this.loanAmount);
        }

        public double generateRandomRate() {
            // Returns a random interest rate between 5% and 15%
            return 0.05 + (Math.random() * 0.10);
        }
    }


    public static void main(String[] args) {
        // 1. SAVINGS
        System.out.println("--- Savings Account Operations ---");

        // Saving obj creation
        SavingsAccount savings = new SavingsAccount(
                10012345L, "John Doe", "123 Oak Street, Cape Town", "0712345678", "1995-04-12", 5000.0, 0.05
        );

        // validation rules
        if (savings.isAccountValid()) {
            System.out.println("Account verification passed for: " + savings.getName());
        }

        // Deposit
        savings.deposit(2500.0);

        // Calculate + Interest == balance
        savings.applyInterest(); // 7500 * 0.05 = 375 interest added. Balance becomes 7875.0

        System.out.println("Final Savings Balance: R" + savings.getBalance());
        System.out.println("\n----------------------------------\n");


        // 2. LOAN ACCOUNT DEMO
        System.out.println("--- Loan Account Operations ---");

        LoanAccount loan = new LoanAccount(
                20098765L, "Jane Smith", "456 Maple Avenue, Johannesburg", "0823456789", "1988-11-23", 50000.0, 0.12
        );

        // Verify profile validation for the loan account holder
        if (loan.isAccountValid()) {
            System.out.println("Account verification passed for: " + loan.getName());
        }

        // Loan balance
        System.out.println("Initial Loan Owed: R" + loan.getLoanAmount());

        // Calculate interest add to balance
        loan.applyLoanInterest(); // 50000 * 0.12 = 6000 interest added. Total owed becomes 56000.0

        // repayment manually
        loan.setLoanAmount(41000.0);
        System.out.println("Loan amount manually updated after payment to: R" + loan.getLoanAmount());

        double potentialNewRate = loan.generateRandomRate();
        System.out.printf("Market check: Random potential interest rate available: %.2f%%\n", (potentialNewRate * 100));
    }
}
