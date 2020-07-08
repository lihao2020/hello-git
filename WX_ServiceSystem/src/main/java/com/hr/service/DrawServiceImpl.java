package com.hr.service;

import com.hr.dao.DrawDao;
import com.hr.entity.Draw;
import com.hr.entity.RecommendDraw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrawServiceImpl implements DrawService {
    @Autowired
    DrawDao drawDao;

    @Override
    public void InsertDaw(Draw draw) {
        drawDao.InsertDraw(draw);
    }

    @Override
    public void InsertRecommend(RecommendDraw recommendDraw) {
        drawDao.InsertRecommend(recommendDraw);
    }
}
