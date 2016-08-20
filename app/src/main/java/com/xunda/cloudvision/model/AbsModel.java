package com.xunda.cloudvision.model;

import com.xunda.cloudvision.bean.resp.BaseResp;

/**
 * Created by yinglovezhuzhu@gmail.com on 2016/8/20.
 */
public abstract class AbsModel {

    /**
     * 异步执行前
     */
    public abstract void onPreExecute();

    /**
     * 取消异步任务
     */
    public abstract void onCanceled();

    /**
     * 异步任务返回结果
     * @param result 结果数据
     */
    public abstract void onResult(BaseResp result);
}