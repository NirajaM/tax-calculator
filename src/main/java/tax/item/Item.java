package tax.item;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author nirmishra
 *
 */
public class Item {

    @SerializedName("name")
    private String itemName;
    @SerializedName("type")
    private ItemType itemType;
    @SerializedName("quantity")
    private int numOfItems;
    @SerializedName("price")
    private double price;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
