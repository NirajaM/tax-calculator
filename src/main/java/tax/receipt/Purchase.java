package tax.receipt;

import tax.item.Item;

/**
 * 
 * @author nirmishra
 *
 */
public class Purchase {

    private Item item;
    private double taxes;
    private double total;
    
    public Purchase(Item item, double taxes, double total) {
        this.item = item;
        this.total = total;
        this.taxes = taxes;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
