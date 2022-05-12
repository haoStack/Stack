package cn.rmonkey.stack.common.entity;

import java.util.Date;

/**
 * @author Zack
 * @Description
 * @date 2022/4/21 14:53
 */
public abstract class BaseEntity {
    protected long id;

    //软删除
    protected boolean flag;

    //创建人id
    protected long createdBy;

    //创建时间
    protected Date createdTime;

    //修改人id
    protected long modifyBy;

    //修改人时间
    protected Date modifyTime;

    //修改次数
    protected int modifyTimes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public int getModifyTimes() {
        return modifyTimes;
    }

    public void setModifyTimes(int modifyTimes) {
        this.modifyTimes = modifyTimes;
    }
}
