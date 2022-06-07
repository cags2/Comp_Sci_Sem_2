public class Shirt implements Clothing{
    public double price;
    public String producer;
    public String material;
    public Shirt(){
        price = 10.99;
        producer = "person";
        material = "fabric";
    }
    public Shirt(double price, String producer, String material){
        price = this.price;
        producer = this.producer;
        material = this.material;
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
        System.out.println("The material that is made is " + material);
    }
    public void getShirt(){
    return super.Shirt();
    }
}