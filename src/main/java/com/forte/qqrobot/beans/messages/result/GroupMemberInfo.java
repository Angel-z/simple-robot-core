/*
 * Copyright (c) 2020. ForteScarlet All rights reserved.
 * Project  simple-robot-core
 * File     GroupMemberInfo.java
 *
 * You can contact the author through the following channels:
 * github https://github.com/ForteScarlet
 * gitee  https://gitee.com/ForteScarlet
 * email  ForteScarlet@163.com
 * QQ     1149159218
 *
 */

package com.forte.qqrobot.beans.messages.result;

import com.forte.qqrobot.beans.messages.CodesAble;
import com.forte.qqrobot.beans.messages.NickOrRemark;
import com.forte.qqrobot.beans.messages.types.PowerType;
import com.forte.qqrobot.beans.messages.types.SexType;

/**
 * 群成员信息
 * @author ForteScarlet <[163邮箱地址]ForteScarlet@163.com>
 * @since JDK1.8
 **/
public interface GroupMemberInfo extends InfoResult, CodesAble, NickOrRemark {

    /** 获取群号 */
    @Override
    String getCode();
    /** 成员QQ号 */
    String getQQ();
    /** 群名片 */
    String getCard();
    /** 获取性别 -1:男，1:女，0:未知  */
    SexType getSex();

    /** 所在城市 */
    String getCity();
    /** 加群时间 */
    Long getJoinTime();
    /** 最后一次发言时间 */
    Long getLastTime();

    /** 权限类型 */
    PowerType getPowerType();
    /** 获取专属头衔 */
    String getExTitle();
    /** 群成员等级名称 */
    String getLevelName();

    /** 是否为不良用户 */
    Boolean isBlack();
    /** 是否允许修改群昵称 */
    Boolean isAllowChangeNick();

    /** 头衔的有效期 */
    Long getExTitleTime();

    /** 头像地址 */
    String getHeadImgUrl();

    /** 禁言剩余时间 */
    Long getBanTime();


    @Override
    default String getGroupCode(){
        return getCode();
    }

    @Override
    default String getQQCode() {
        return getQQ();
    }
}
