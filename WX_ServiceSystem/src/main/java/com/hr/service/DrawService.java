package com.hr.service;

import com.hr.entity.Draw;
import com.hr.entity.RecommendDraw;

public interface DrawService {
    void InsertDaw(Draw draw);
    void InsertRecommend(RecommendDraw recommendDraw);
}
