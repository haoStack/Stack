package cn.rmonkey.stack.entity;

import cn.rmonkey.stack.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zack
 * @Description
 * @date 2022/4/21 14:49
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Banner extends BaseEntity {
    //可以是视频url,图片url
    private int mediaId;

    private int weight;

    private boolean checked;

    //对应的文章
    Article article;

    //对应的资源
    Resources resources;
}
