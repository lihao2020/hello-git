package com.hr.controller;

import com.hr.entity.RecommendDraw;
import com.hr.service.DrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;


@Controller
public class index_01 {

    @Autowired
    DrawService drawService;

    @RequestMapping("index")
    public String getIndex()
    {
        return "index";
    }

    @RequestMapping("index3")
    public String getIndex3()
    {
        return "index3";
    }

    @RequestMapping(value = "draw_input",method = {RequestMethod.POST, RequestMethod.GET})
    public String luru(HttpServletRequest request)
    {
        MultipartHttpServletRequest params=((MultipartHttpServletRequest) request);
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        String draw_name = params.getParameter("draw_name");
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        String realPath = "E:\\IdeaProject\\WX_ServiceSystem\\WX_ServiceSystem\\src\\main\\webapp\\image\\";
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    //指定路径然后拷贝到该目录下
                    stream = new BufferedOutputStream(new FileOutputStream(realPath+file.getOriginalFilename()));
                    stream.write(bytes);
                    stream.close();
                } catch (Exception e) {
                    stream = null;
                    return "You failed to upload " + i + " => " + e.getMessage();
                }
            } else {
                return "You failed to upload " + i + " because the file was empty.";
            }
        }
        System.out.println(file.getOriginalFilename());
        RecommendDraw recommendDraw = new RecommendDraw();
        recommendDraw.setRecommend_draw_name(draw_name);
        recommendDraw.setRecommend_draw_img("http://localhost:8088/image/"+file.getOriginalFilename());
        drawService.InsertRecommend(recommendDraw);
        return "index";
    }
}
