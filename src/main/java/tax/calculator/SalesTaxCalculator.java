package tax.calculator;
import static tax.calculator.TaxConstants.*;

import tax.item.Item;
import tax.item.ItemType;
/**
 * Taxes are calculated with a rate of 17.5%, rounding the tax result to the upper 0.05.
 * Please note that medical products are exempt and an additional 1.25 fixed amount is added as an extra tax on CDs

 * @author nirmishra
 *
 */
public class SalesTaxCalculator implements TaxCalculator{

    public double computeTax(Item item) {
        double tax = 0.0;
        int numOfItems = item.getNumOfItems();
        double price = item.getPrice();
        ItemType itemType = item.getItemType();
        if(itemType.equals(ItemType.OTHERS)){
            tax = numOfItems * TAX_RATE * price;
        }
        else if(itemType.equals(ItemType.CD)){
            tax = numOfItems * TaxConstants.TAX_RATE * price + EXTRA_CD_TAX_RATE;
        }
        else if(itemType.equals(ItemType.MEDICAL)){
            tax = 0.0;
        }
        return tax;
    }
}
