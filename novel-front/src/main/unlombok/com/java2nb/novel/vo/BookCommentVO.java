// Generated by delombok at Mon May 09 23:17:28 CST 2022
package com.java2nb.novel.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.java2nb.novel.core.serialize.CommentUserNameSerialize;
import com.java2nb.novel.entity.BookComment;
import javax.annotation.Generated;
import java.util.Date;

/**
 * @author 11797
 */
public class BookCommentVO extends BookComment {
    @JsonSerialize(using = CommentUserNameSerialize.class)
    private String createUserName;
    private String createUserPhoto;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @Override
    public String toString() {
        return super.toString();
    }

    @java.lang.SuppressWarnings("all")
    public BookCommentVO() {
    }

    @java.lang.SuppressWarnings("all")
    public String getCreateUserName() {
        return this.createUserName;
    }

    @java.lang.SuppressWarnings("all")
    public String getCreateUserPhoto() {
        return this.createUserPhoto;
    }

    @java.lang.SuppressWarnings("all")
    public Date getCreateTime() {
        return this.createTime;
    }

    @java.lang.SuppressWarnings("all")
    public void setCreateUserName(final String createUserName) {
        this.createUserName = createUserName;
    }

    @java.lang.SuppressWarnings("all")
    public void setCreateUserPhoto(final String createUserPhoto) {
        this.createUserPhoto = createUserPhoto;
    }

    @java.lang.SuppressWarnings("all")
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof BookCommentVO)) return false;
        final BookCommentVO other = (BookCommentVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$createUserName = this.getCreateUserName();
        final java.lang.Object other$createUserName = other.getCreateUserName();
        if (this$createUserName == null ? other$createUserName != null : !this$createUserName.equals(other$createUserName)) return false;
        final java.lang.Object this$createUserPhoto = this.getCreateUserPhoto();
        final java.lang.Object other$createUserPhoto = other.getCreateUserPhoto();
        if (this$createUserPhoto == null ? other$createUserPhoto != null : !this$createUserPhoto.equals(other$createUserPhoto)) return false;
        final java.lang.Object this$createTime = this.getCreateTime();
        final java.lang.Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof BookCommentVO;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $createUserName = this.getCreateUserName();
        result = result * PRIME + ($createUserName == null ? 43 : $createUserName.hashCode());
        final java.lang.Object $createUserPhoto = this.getCreateUserPhoto();
        result = result * PRIME + ($createUserPhoto == null ? 43 : $createUserPhoto.hashCode());
        final java.lang.Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }
}
