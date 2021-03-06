package com.gusi.demo.mng.model.statistic;

import java.util.List;

import com.gusi.demo.mng.model.base.BaseDataCube;

/**
 * 图文群发总数据
 *
 * @author peiyu
 */
public class ArticleTotal extends BaseDataCube {

    private String                   msgid;
    private String                   title;
    private List<ArticleTotalDetail> details;

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ArticleTotalDetail> getDetails() {
        return details;
    }

    public void setDetails(List<ArticleTotalDetail> details) {
        this.details = details;
    }
}
