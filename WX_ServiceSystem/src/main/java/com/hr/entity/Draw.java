package com.hr.entity;

public class Draw {
    private int draw_id;
    private String draw_name;
    private String draw_describe;
    private int draw_price;
    private String draw_type;
    private String draw_img;

    @Override
    public String toString() {
        return "Draw{" +
                "draw_id=" + draw_id +
                ", draw_name='" + draw_name + '\'' +
                ", draw_describe='" + draw_describe + '\'' +
                ", draw_price=" + draw_price +
                ", draw_type='" + draw_type + '\'' +
                ", draw_img='" + draw_img + '\'' +
                '}';
    }

    public Draw() {
    }

    public Draw(int draw_id, String draw_name, String draw_describe, int draw_price, String draw_type, String draw_img) {
        this.draw_id = draw_id;
        this.draw_name = draw_name;
        this.draw_describe = draw_describe;
        this.draw_price = draw_price;
        this.draw_type = draw_type;
        this.draw_img = draw_img;
    }

    public int getDraw_id() {
        return draw_id;
    }

    public void setDraw_id(int draw_id) {
        this.draw_id = draw_id;
    }

    public String getDraw_name() {
        return draw_name;
    }

    public void setDraw_name(String draw_name) {
        this.draw_name = draw_name;
    }

    public String getDraw_describe() {
        return draw_describe;
    }

    public void setDraw_describe(String draw_describe) {
        this.draw_describe = draw_describe;
    }

    public int getDraw_price() {
        return draw_price;
    }

    public void setDraw_price(int draw_price) {
        this.draw_price = draw_price;
    }

    public String getDraw_type() {
        return draw_type;
    }

    public void setDraw_type(String draw_type) {
        this.draw_type = draw_type;
    }

    public String getDraw_img() {
        return draw_img;
    }

    public void setDraw_img(String draw_img) {
        this.draw_img = draw_img;
    }
}
