package cn.rmonkey.stack.service.impl;

import cn.rmonkey.stack.entity.Banner;
import cn.rmonkey.stack.mapper.BannerMapper;
import cn.rmonkey.stack.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Zhaozihao (Zack)
 * @Description
 * @date 2022/5/9 15:42
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    BannerMapper bannerMapper;

    @Override
    public List<Banner> getlistBanner() {
        return bannerMapper.getlistBanner();
    }
}
