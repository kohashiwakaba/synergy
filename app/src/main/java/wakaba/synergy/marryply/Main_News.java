package wakaba.synergy.marryply;

public class Main_News {

    int n_1_thumb;
    String n_2_cat;
    String n_3_title;
    String n_4_date;
    Boolean n_5_heart;
    int n_6_image;
    String n_7_com;
    String n_8_share;
    String n_9_content;

    Main_News(int n1, String n2, String n3, String n4, Boolean n5, int n6, String n7, String n8,String n9){
        this.n_1_thumb =n1;
        this.n_2_cat=n2;
        this.n_3_title=n3;
        this.n_4_date=n4;
        this.n_5_heart=n5;
        this.n_6_image=n6;
        this.n_7_com=n7;
        this.n_8_share=n8;
        this.n_9_content=n9;
    }

    public int getN_1_thumb() {
        return n_1_thumb;
    }

    public void setN_1_thumb(int n_1_thumb) {
        this.n_1_thumb = n_1_thumb;
    }

    public String getN_2_cat() {
        return n_2_cat;
    }

    public void setN_2_cat(String n_2_cat) {
        this.n_2_cat = n_2_cat;
    }

    public String getN_3_title() {
        return n_3_title;
    }

    public void setN_3_title(String n_3_title) {
        this.n_3_title = n_3_title;
    }

    public String getN_4_date() {
        return n_4_date;
    }

    public void setN_4_date(String n_4_date) {
        this.n_4_date = n_4_date;
    }

    public Boolean getN_5_heart() {
        return n_5_heart;
    }

    public void setN_5_heart(Boolean n_5_heart) {
        this.n_5_heart = n_5_heart;
    }

    public int getN_6_image() {
        return n_6_image;
    }

    public void setN_6_image(int n_6_image) {
        this.n_6_image = n_6_image;
    }

    public String getN_7_com() {
        return n_7_com;
    }

    public void setN_7_com(String n_7_com) {
        this.n_7_com = n_7_com;
    }

    public String getN_8_share() {
        return n_8_share;
    }

    public void setN_8_share(String n_8_share) {
        this.n_8_share = n_8_share;
    }

    public String getN_9_content() {
        return n_9_content;
    }

    public void setN_9_content(String n_9_content) {
        this.n_9_content = n_9_content;
    }
}
