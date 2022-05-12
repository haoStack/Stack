package cn.rmonkey.stack.mapper;

import cn.rmonkey.stack.entity.Banner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Zhaozihao (Zack)
 * @Description
 * @date 2022/5/7 16:07
 */
@Mapper
public interface BannerMapper {
    //获取所有的banner,包括未选中的
    List<Banner> getlistBanner();
}
