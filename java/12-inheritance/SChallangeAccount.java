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

        // Getters
        public long getAccNo() { return accNo; }
        public String getName() { return name; }
        public String getAddress() { return address; }
        public String getPhoneNo() { return phoneNo; }
        public String getDob() { return dob; }
        public double getBalance() { return balance; }

        // Setters (Only for properties that are allowed to change)
        public void setName(String name) { this.name = name; }
        public void setAddress(String address) { this.address = address; }
        public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }

        // Methods
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


    //Savings Account Inheritance From SuperClass
    public static class SavingsAccount () {
        //Properties
        private int interest;
        private int deposit;

        //Inheriting from SuperClass
        //Constructors
        //Methods
    }

    //Loan Account Inheritance From SuperClass
    public static class LoanAccount() {
        //Properties
        private int interest;
        private int loanAmmount;

        //Inheriting from SuperClass
        //Constructors
        //Methods
    }

    public static void main(String[] args) {

    }
}
