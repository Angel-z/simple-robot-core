package com.forte.qqrobot.beans.messages.get;

import com.forte.qqrobot.beans.messages.result.FileInfo;
import com.forte.qqrobot.beans.messages.result.GroupInfo;

/**
 * 取群详细信息
 * @author ForteScarlet <[163邮箱地址]ForteScarlet@163.com>
 * @since JDK1.8
 **/
public interface GetGroupInfo extends InfoGet<GroupInfo> {
    /**
     * 获取通过此类型请求而获取到的参数的返回值的类型
     */
    @Override
    default Class<GroupInfo> resultType(){
        return GroupInfo.class;
    }

}