package com.hr.dao;

import com.hr.entity.Draw;
import com.hr.entity.RecommendDraw;
import org.springframework.stereotype.Repository;

@Repository
public interface DrawDao {
    void InsertDraw(Draw draw);
    void InsertRecommend(RecommendDraw recommendDraw);
}
