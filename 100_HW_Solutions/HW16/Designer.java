public class Designer implements Clothing{
    public double price;
    public String producer;
    public String brand;
    public Shirt(){
        price = 10.99;
        producer = "Supreme";
        brand = "Gucci";
    }
    public Shirt(double price, String producer, String brand){
        price = this.price;
        producer = this.producer;
        material = this.brand;
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
        System.out.println("The brand is " + brand);
    }
    public void getDesigner();
    return super.Designer();
}