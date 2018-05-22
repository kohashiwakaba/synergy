package wakaba.synergy.marryply;

public class List_1 {

    int no;
    int image;
    String name;
    String desc;
    int price;

    public List_1(int no, int image, String name,String desc, int price) {
        this.no = no;
        this.image = image;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
