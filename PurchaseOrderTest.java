import inventory.Item;
import inventory.PurchaseOrder;
import inventory.WarehouseManager;
import org.junit.jupiter.api.Test;

class PurchaseOrderTest {

    @Test
    void createPo() {
        WarehouseManager wm = new WarehouseManager();
        Item item1 = wm.createItem("Laptop", "Electronics", 2.5, 10, 5, "A1", "TechSupplier");
        item1.createList();
        PurchaseOrder po = new PurchaseOrder();
        po.createPo();

        //Expected result

        /*
        Printing purchase order
        Item name: Laptop
        Item type: Electronics
        Current quantity: 10
        Item supplier: TechSupplier
        */

        //Result
        po.createPo();
    }
}