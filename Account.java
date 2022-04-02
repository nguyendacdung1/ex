public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        balance=0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance+=amount;
        return balance;
    }

    public int debit(int amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Rut tien thanh cong.");
        } else {
            System.out.println("Rut tien that bai");
        }
        return balance;
    }

    public int transferTo( Account another,int amount ){
        if(amount<=balance){
            another.balance += amount;
            balance-=amount;
            System.out.println("Chuyen tien thanh cong.");

        } else {
            System.out.println("Chuyen tien that bai");
        }
        return balance;
    }

    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
