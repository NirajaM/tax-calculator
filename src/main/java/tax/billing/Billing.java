package tax.billing;

import java.util.List;

import tax.item.Item;
import tax.receipt.Receipt;

/**
 * 
 * @author nirmishra
 *
 */
public interface Billing {

   public Receipt buyItems(List<Item> itemList);
}
