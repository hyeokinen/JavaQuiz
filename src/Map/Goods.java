package Map;

public class Goods {
    private String name;
    private int price;
    private String state;

    public Goods(String name, int price, String state) {
        this.name = name;
        this.price = price;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getState() {
        return state;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object obj) {
        Goods goodsObj = (Goods) obj;
        return this.getName().equals(goodsObj.getName());
    }

    @Override
    public String toString() {
        // {물품명:oo, 가격:oo, 판매상태:예약중}
        return "{물품명:" + this.name + ", 가격:" + this.price + ", 판매상태:" + this.state + "}";
    }
}
