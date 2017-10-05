package tax.receipt;

import java.util.List;

/**
 * 
 * @author nirmishra
 *
 */
public class Receipt {
    private List<Purchase> purchases;
    private double taxes;
    private double total;

    public Receipt(List<Purchase> purchases, double taxes, double total) {
        this.purchases = purchases;
        this.taxes = taxes;
        this.total = total;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public double getTaxes() {
        return taxes;
    }

    public double getTotal() {
        return total;
    }
}
