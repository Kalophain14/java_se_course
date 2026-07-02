public class SChallangeAccount {

    // Super Class
    public class Accounts {

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

        SChallangeAccount sch = new SChallangeAccount();
        SChallangeAccount sch2 = new SChallangeAccount();


    }
}
