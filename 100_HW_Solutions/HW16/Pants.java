public class Pants implements Clothing{
    public double price;
    public String producer;
    public int length;
    public Shirt(){
        price = 10.99;
        producer = "person";
        length = 30;
    }
    public Shirt(double price, String producer, int length){
        price = this.price;
        producer = this.producer;
        length = this.length;
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
    public void Pants(){
        System.out.println("The price for each shirt is" + price);
        System.out.println("It is made by " + produer);
        System.out.println("It is " + length + " inches");
    }
    public void getPants();
    return super.Pants();
}