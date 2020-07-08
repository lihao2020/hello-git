package com.hr.entity;

public class RecommendDraw {
    private int recommend_id;
    private String recommend_draw_name;
    private String recommend_draw_img;

    @Override
    public String toString() {
        return "PromotionDraw{" +
                "recommend_id=" + recommend_id +
                ", recommend_draw_name='" + recommend_draw_name + '\'' +
                ", recommend_draw_img='" + recommend_draw_img + '\'' +
                '}';
    }

    public RecommendDraw() {
    }

    public RecommendDraw(int recommend_id, String recommend_draw_name, String recommend_draw_img) {
        this.recommend_id = recommend_id;
        this.recommend_draw_name = recommend_draw_name;
        this.recommend_draw_img = recommend_draw_img;
    }

    public int getRecommend_id() {
        return recommend_id;
    }

    public void setRecommend_id(int recommend_id) {
        this.recommend_id = recommend_id;
    }

    public String getRecommend_draw_name() {
        return recommend_draw_name;
    }

    public void setRecommend_draw_name(String recommend_draw_name) {
        this.recommend_draw_name = recommend_draw_name;
    }

    public String getRecommend_draw_img() {
        return recommend_draw_img;
    }

    public void setRecommend_draw_img(String recommend_draw_img) {
        this.recommend_draw_img = recommend_draw_img;
    }
}
