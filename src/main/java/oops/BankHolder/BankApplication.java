package oops.BankHolder;

public class BankApplication {
    public static void main(String[] args) {

        Account acc= new Account();
        acc.name= "prerna  nimje";
        acc.balance=25461.00;
        acc.accountId="SBI5226710";

        Customer cus=new Customer();
        cus.name="Prerna Nimje";
        cus.city="Nagpur";
        cus.phone=8055669881l;
        cus.emailId="prernanimje5gmail.com";
        cus.account=acc;

        System.out.println("Customer Name:"+cus.name);
        System.out.println("Customer Account Balance:"+acc.balance);
        System.out.println("Customer AccountId:"+acc.accountId);
        System.out.println("Customer Account:"+cus.account);




    }
}
