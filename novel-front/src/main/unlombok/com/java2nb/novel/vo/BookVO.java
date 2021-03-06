// Generated by delombok at Mon May 09 23:17:28 CST 2022
package com.java2nb.novel.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.java2nb.novel.entity.Book;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 */
public class BookVO extends Book implements Serializable {
    @JsonFormat(timezone = "GMT+8", pattern = "MM/dd HH:mm")
    private Date lastIndexUpdateTime;

    @java.lang.SuppressWarnings("all")
    public BookVO() {
    }

    @java.lang.SuppressWarnings("all")
    public Date getLastIndexUpdateTime() {
        return this.lastIndexUpdateTime;
    }

    @java.lang.SuppressWarnings("all")
    public void setLastIndexUpdateTime(final Date lastIndexUpdateTime) {
        this.lastIndexUpdateTime = lastIndexUpdateTime;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof BookVO)) return false;
        final BookVO other = (BookVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$lastIndexUpdateTime = this.getLastIndexUpdateTime();
        final java.lang.Object other$lastIndexUpdateTime = other.getLastIndexUpdateTime();
        if (this$lastIndexUpdateTime == null ? other$lastIndexUpdateTime != null : !this$lastIndexUpdateTime.equals(other$lastIndexUpdateTime)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof BookVO;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $lastIndexUpdateTime = this.getLastIndexUpdateTime();
        result = result * PRIME + ($lastIndexUpdateTime == null ? 43 : $lastIndexUpdateTime.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "BookVO(lastIndexUpdateTime=" + this.getLastIndexUpdateTime() + ")";
    }
}
