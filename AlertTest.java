import inventory.Alert;
import inventory.Item;
import inventory.WarehouseManager;
import org.junit.jupiter.api.Test;

class AlertTest {

    @Test
    void createAlert() {
        WarehouseManager wm = new WarehouseManager();
        Item item1 = wm.createItem("Laptop", "Electronics", 2.5, 10, 5, "A1", "TechSupplier");
        item1.createList();
        Alert alert = new Alert();
        alert.createAlert();

        //Expected result

        /*
        Please be aware Laptop from TechSupplier is currently below quantity threshold.
         */

        //Result
        alert.createAlert();

    }
}