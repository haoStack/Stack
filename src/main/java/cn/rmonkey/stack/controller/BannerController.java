package cn.rmonkey.stack.controller;

import cn.rmonkey.stack.entity.Banner;
import cn.rmonkey.stack.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Zhaozihao (Zack)
 * @Description
 * @date 2022/5/9 15:43
 */
@RestController
public class BannerController {
    @Autowired
    private BannerService bannerService;
    @RequestMapping("/getBannerList")
    public String getBannerList() {
        List<Banner> banners = bannerService.getlistBanner();
        System.out.println(banners);
        return "str";
    }
}
