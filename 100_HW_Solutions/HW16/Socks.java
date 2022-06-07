public class Socks implements Clothing{
    public double price;
    public String producer;
    public String Type;
    public Shirt(){
        price = 10.99;
        producer = "person";
        type = "Knee High Socks";
    }
    public Shirt(double price, String producer, String type){
        price = this.price;
        producer = this.producer;
        type = this.type;
    }
    public void setPrice(double price){
        price = this.price;
    }
    public void setProducer(String producer){
        producer = this.producer;
    }
    public int getPrice(){
        return price;
    }
    public String getProducer(){
        return producer;
    }
    public void Shirt(){
        System.out.println("The price for each shirt is" + price);
        System.out.println("It is made by " + produer);
        System.out.println("The type of Socks are " + type);
    }
    public void getSocks();
    return super.Socks();
}