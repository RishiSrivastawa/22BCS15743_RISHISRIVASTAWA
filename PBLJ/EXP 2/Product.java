import java.util.Scanner;

public class Product {
    int id ;
    String name;
    double price;

    Product(int id , String name , double price){
        this.id = id;
        this.name = name;
        this.price=price;
    }

    public void displayInfo(){
        System.out.println("Product id : "+this.id);
        System.out.println("Product name : "+this.name);
        System.out.println("Product price : "+this.price);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of product you want to add : ");
        int no = sc.nextInt();
        sc.nextLine();
        Product []p = new Product[no];
        System.out.println("Enter Product details: ");
        for(int i = 0 ; i<no ; i++){
            System.out.println("Id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name : ");
            String name = sc.nextLine();
            System.out.println("Price : ");
            double price = sc.nextDouble();
            sc.nextLine();
            p[i] = new Product(id,name,price);
        }

        System.out.println("Product details : ");
        for(Product pr : p){
            pr.displayInfo();
        }

    }
}
