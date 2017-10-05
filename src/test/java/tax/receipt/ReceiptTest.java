package tax.receipt;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import tax.billing.Billing;
import tax.billing.ItemBilling;
import tax.item.Item;
import tax.receipt.Receipt;

/**
 * 
 * @author nirmishra
 *
 */
public class ReceiptTest {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void test1stSet() {
        // 1 book: 29.49
        // 1 music CD: 15.99
        // 1 chocolate snack: 0.75

        String item1Str = "{\"name\":\"book\",\"type\":\"OTHERS\",\"quantity\":1,\"price\":29.49}";
        String item2Str = "{\"name\":\"music\",\"type\":\"CD\",\"quantity\":1,\"price\":15.99}";
        String item3Str = "{\"name\":\"chocolate snack\",\"type\":\"OTHERS\",\"quantity\":1,\"price\":0.75}";

        Item item1 = gson.fromJson(item1Str, Item.class);
        Item item2 = gson.fromJson(item2Str, Item.class);
        Item item3 = gson.fromJson(item3Str, Item.class);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        Billing bills = new ItemBilling();

        Receipt receipt = bills.buyItems(itemList);
        System.out.println(gson.toJson(receipt));
        assertTrue(receipt.getTaxes() == 9.35);
        assertTrue(receipt.getTotal() == 55.6);
    }

    @Test
    public void test2stSet() {
        // 1 bottle of wine: 20.99
        // 1 box of tooth ache pills: 4.15
        // 1 box of pins: 11.25
        // 1 music CD: 14.99

        String item1Str = "{\"name\":\"bottle of wine\",\"type\":\"OTHERS\",\"quantity\":1,\"price\":20.99}";
        String item2Str = "{\"name\":\"box of tooth ache pills\",\"type\":\"MEDICAL\",\"quantity\":1,\"price\":4.15}";
        String item3Str = "{\"name\":\"box of pins\",\"type\":\"OTHERS\",\"quantity\":1,\"price\":11.25}";
        String item4Str = "{\"name\":\"music CD\",\"type\":\"CD\",\"quantity\":1,\"price\":14.99}";

        Item item1 = gson.fromJson(item1Str, Item.class);
        Item item2 = gson.fromJson(item2Str, Item.class);
        Item item3 = gson.fromJson(item3Str, Item.class);
        Item item4 = gson.fromJson(item4Str, Item.class);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);

        Billing bills = new ItemBilling();

        Receipt receipt = bills.buyItems(itemList);
        System.out.println(gson.toJson(receipt));

        assertTrue(receipt.getTaxes() == 9.55);
        assertTrue(receipt.getTotal() == 60.9);
    }

}
