import java.util.ArrayList;
public class BakedGoods {
    private String name, expDate;
    private double price;
    private int quantityStock;
    private ArrayList<String> diet;

    public BakedGoods(){
        this.name = "";
        this.price = 0;
        this.quantityStock = 0;
        this.expDate = "";
        this.diet = new ArrayList<String>();

    }
    public BakedGoods(String name, double price, int quantityStock, String expDate, ArrayList<String> diet){
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        this.expDate = expDate;
        this.diet = diet;
    }

    public String getName(){
        return name;
    }
    public String getExpDate(){
        return expDate;
    }
    public int getQuantityStock(){
        return quantityStock;
    }
    public double getPrice() {
        return price;
    }
    public ArrayList<String> getDiet(){
        return diet;
    }


}
