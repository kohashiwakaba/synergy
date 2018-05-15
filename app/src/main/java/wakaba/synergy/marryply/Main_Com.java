package wakaba.synergy.marryply;

public class Main_Com {

    int c1_bg;
    String c2_title;
    String c3_tag;
    int c4_comment;

    public Main_Com(int c1_bg, String c2_title, String c3_tag, int c4_comment) {
        this.c1_bg = c1_bg;
        this.c2_title = c2_title;
        this.c3_tag = c3_tag;
        this.c4_comment = c4_comment;
    }

    public int getC1_bg() {
        return c1_bg;
    }

    public void setC1_bg(int c1_bg) {
        this.c1_bg = c1_bg;
    }

    public String getC2_title() {
        return c2_title;
    }

    public void setC2_title(String c2_title) {
        this.c2_title = c2_title;
    }

    public String getC3_tag() {
        return c3_tag;
    }

    public void setC3_tag(String c3_tag) {
        this.c3_tag = c3_tag;
    }

    public int getC4_comment() {
        return c4_comment;
    }

    public void setC4_comment(int c4_comment) {
        this.c4_comment = c4_comment;
    }
}
