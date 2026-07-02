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


  //Savings Account Inheritance From SuperClass
    public static class SavingsAccount extends Accounts {
        //Properties
        private int deposit;
        // Getter
        public int getDeposit(){ return deposit; }

        // Setters
        public int setDeposit (int deposit){ this.deposit = deposit; }

        // Default Constructor
      public void setDeposit(int deposit){
            this.deposit = deposit;
      }

        // Parallelized Constructors
      public void setDeposit(int deposit, int amount){
            this.deposit = deposit + amount;
      }

      //Methods
      public SavingsAccount(int accNo, String name, String address, String phoneNo, String dob) {
            super(accNo, name, address, phoneNo, dob, 0.0);
      }
    }

    //Loan Account Inheritance From SuperClass
    public static class LoanAccount extends Accounts {
        // properties
        private int loanAmmount;
        private int interest;

        // Getters
        public int getInterest(){ return interest; }
        public int getLoanAmmount(){ return loanAmmount; }

        // Setters
        public void setInterest(int interest){ this.interest = interest; }
        public void setLoanAmmount(int loanAmmount){ this.loanAmmount = loanAmmount; }


        // Constructors
        //Default Constructors
        public LoanAccount(){
            this.loanAmmount = 0;
            this.interest = 0;
        }

        // Parametrized Constructor
        public LoanAccount(int loanAmmount, int interest) {
            this.loanAmmount = loanAmmount;
            this.interest = interest;
        }

        //Methods
        public int LoanAccount(){
            return (int)(Math.random()*100)+1;
        }
        public int LoanInterest(){
            return (int)(Math.random()*100)+1;
        }
    }

    public static void main(String[] args) {

    }
}
