/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018/11/21，所有权利保留。
 *
 * 项目名：	MultDataSource
 * 文件名：	Product
 * 模块说明：
 * 修改历史：
 *  2018年-11月-21日  - changhao - 创建。
 */
package com.multi.datasource.multi.entity.second;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author changhao
 */
@Data
@Entity
@ToString
@Table(name = "spring_jpa_product")
public class Product implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Integer id;

    private String name;

    private double price;
}
