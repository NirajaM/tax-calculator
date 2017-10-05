package tax.billing;

import java.util.ArrayList;
import java.util.List;

import tax.calculator.SalesTaxCalculator;
import static tax.calculator.TaxConstants.TWENTY;
import tax.item.Item;
import tax.receipt.Purchase;
import tax.receipt.Receipt;

/**
 * 
 * @author nirmishra
 *
 */
public class ItemBilling implements Billing {

    private SalesTaxCalculator salesTaxCal = new SalesTaxCalculator();

    public Receipt buyItems(List<Item> itemList) {
        List<Purchase> purchaseList = new ArrayList<Purchase>();
        double totalTax = 0.0;
        double totalPrice = 0.0;
        for (Item item : itemList) {
            double tax = salesTaxCal.computeTax(item);
            double itemPrice = tax + (item.getNumOfItems() * item.getPrice());
            Purchase purchase = new Purchase(item, tax, itemPrice);
            totalTax = totalTax + tax;
            totalPrice = totalPrice + itemPrice;
            purchaseList.add(purchase);
        }
        return new Receipt(purchaseList, Math.ceil(totalTax * TWENTY) / TWENTY,
                Math.ceil(totalPrice * TWENTY) / TWENTY);
    }

}
