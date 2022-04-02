public class InvoiceItem {
    private int id;
    private String desc;
    private int qty;
    private double unitPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return qty*unitPrice;
    }

    public String toString() {
        return "InvoiceItem[id="+id+",desc="+desc+",qty="+qty+",unitPrice="+unitPrice+"]";
    }
}
