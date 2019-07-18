package com.atguigu.bean;

import lombok.Data;

/**
 * 收藏
 */
@Data
@SuppressWarnings("unused")
public class AppFavorites {
    private int id;//主键
    private int course_id;//商品id
    private int userid;//用户ID
    private String add_time;//创建时间


}
