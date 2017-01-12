package com.lijie.Entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
@XmlRootElement(name="book")
public class BookEn {
    private String bookName;
    private String price;
    private String bookNo;

    @XmlAttribute
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    @XmlAttribute
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    @XmlAttribute
    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public BookEn() {

    }

    public BookEn(String bookName, String price, String bookNo) {

        this.bookName = bookName;
        this.price = price;
        this.bookNo = bookNo;
    }
}
