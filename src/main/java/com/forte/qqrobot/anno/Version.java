/*
 * Copyright (c) 2020. ForteScarlet All rights reserved.
 * Project  simple-robot-core
 * File     Version.java
 *
 * You can contact the author through the following channels:
 * github https://github.com/ForteScarlet
 * gitee  https://gitee.com/ForteScarlet
 * email  ForteScarlet@163.com
 * QQ     1149159218
 *
 */

package com.forte.qqrobot.anno;

import java.lang.annotation.*;

/**
 * 备用注解，用于开发者来标注版本号等信息，暂未使用
 * @author ForteScarlet <[email]ForteScarlet@163.com>
 * @since JDK1.8
 **/
@Retention(RetentionPolicy.RUNTIME)	//注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Target({ElementType.TYPE}) //接口、类、枚举、注解、方法
@Documented
@Inherited  //可继承的
public @interface Version {
    /** 版本 */
    String version();
    String versionFamily();
    String groupId() default "io.github.ForteScarlet";
    String artifactId() default "simple-robot-core";
    /** 组件名称 */
    String value() default "";
    //开发者
    String author() default "ForteScarlet";
    //其他注释一类的东西？
    String comment() default "";
    String email() default "";
    String QQ() default "";
    String phone() default "";
    /** 主页 */
    String home() default "";
    /** maven地址 */
    String mavenUrl() default "";
    /** git地址 */
    String[] git() default {};

}
