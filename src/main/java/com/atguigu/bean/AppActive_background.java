package com.atguigu.bean;

import lombok.Data;

/*
 * 用户后台活跃
 */
@Data
@SuppressWarnings("unused")
public class AppActive_background {
    private String active_source;//1=upgrade,2=download(下载),3=plugin_upgrade

}
