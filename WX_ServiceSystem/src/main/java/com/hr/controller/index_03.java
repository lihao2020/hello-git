package com.hr.controller;

import com.hr.entity.Draw;
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
public class index_03 {
    @Autowired
    DrawService drawService;

    @RequestMapping(value = "draw_input3",method = {RequestMethod.POST, RequestMethod.GET})
    public String luru(HttpServletRequest request)
    {
        MultipartHttpServletRequest params=((MultipartHttpServletRequest) request);
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        String draw_name = params.getParameter("draw_name");
        String draw_describe = params.getParameter("draw_describe");
        int draw_price = Integer.parseInt(params.getParameter("draw_price"));
        String draw_type = params.getParameter("draw_type");
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        String realPath = "E:\\IdeaProject\\WX_ServiceSystem\\WX_ServiceSystem\\src\\main\\webapp\\image3\\";
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
        Draw draw = new Draw();

        draw.setDraw_name(draw_name);
        draw.setDraw_describe(draw_describe);
        draw.setDraw_price(draw_price);
        draw.setDraw_type(draw_type);
        draw.setDraw_img("http://localhost:8088/image3/"+file.getOriginalFilename());
        drawService.InsertDaw(draw);
        return "index3";
    }
}
