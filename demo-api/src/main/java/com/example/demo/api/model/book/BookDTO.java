package com.example.demo.api.model.book;

import com.example.demo.api.model.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**书籍
 * @author superman
 * **/
@EqualsAndHashCode(callSuper = true)
@Data
public class BookDTO extends BaseDTO implements Serializable {
    /**
     * 书籍名称
     **/
    private String bookName;

    /**
     * 价格
     */
    private BigDecimal bookPrice;

    /**
     * 出版社
     */
    private String bookPublish;

    /**
     * 作者
     */
    private String bookAuthor;

    /**
     * 封面
     */
    private String bookImg;

    /**
     * 出版日期
     */
    private Date publishDate;

}