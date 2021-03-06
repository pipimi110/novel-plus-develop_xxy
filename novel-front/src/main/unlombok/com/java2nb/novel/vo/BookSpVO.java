// Generated by delombok at Mon May 09 23:17:28 CST 2022
package com.java2nb.novel.vo;

import java.util.Date;

/**
 * 小说搜索参数
 * @author 11797
 */
public class BookSpVO {
    private String keyword;
    private Byte workDirection;
    private Integer catId;
    private Byte isVip;
    private Byte bookStatus;
    private Integer wordCountMin;
    private Integer wordCountMax;
    private Date updateTimeMin;
    private Long updatePeriod;
    private String sort;

    @java.lang.SuppressWarnings("all")
    public BookSpVO() {
    }

    @java.lang.SuppressWarnings("all")
    public String getKeyword() {
        return this.keyword;
    }

    @java.lang.SuppressWarnings("all")
    public Byte getWorkDirection() {
        return this.workDirection;
    }

    @java.lang.SuppressWarnings("all")
    public Integer getCatId() {
        return this.catId;
    }

    @java.lang.SuppressWarnings("all")
    public Byte getIsVip() {
        return this.isVip;
    }

    @java.lang.SuppressWarnings("all")
    public Byte getBookStatus() {
        return this.bookStatus;
    }

    @java.lang.SuppressWarnings("all")
    public Integer getWordCountMin() {
        return this.wordCountMin;
    }

    @java.lang.SuppressWarnings("all")
    public Integer getWordCountMax() {
        return this.wordCountMax;
    }

    @java.lang.SuppressWarnings("all")
    public Date getUpdateTimeMin() {
        return this.updateTimeMin;
    }

    @java.lang.SuppressWarnings("all")
    public Long getUpdatePeriod() {
        return this.updatePeriod;
    }

    @java.lang.SuppressWarnings("all")
    public String getSort() {
        return this.sort;
    }

    @java.lang.SuppressWarnings("all")
    public void setKeyword(final String keyword) {
        this.keyword = keyword;
    }

    @java.lang.SuppressWarnings("all")
    public void setWorkDirection(final Byte workDirection) {
        this.workDirection = workDirection;
    }

    @java.lang.SuppressWarnings("all")
    public void setCatId(final Integer catId) {
        this.catId = catId;
    }

    @java.lang.SuppressWarnings("all")
    public void setIsVip(final Byte isVip) {
        this.isVip = isVip;
    }

    @java.lang.SuppressWarnings("all")
    public void setBookStatus(final Byte bookStatus) {
        this.bookStatus = bookStatus;
    }

    @java.lang.SuppressWarnings("all")
    public void setWordCountMin(final Integer wordCountMin) {
        this.wordCountMin = wordCountMin;
    }

    @java.lang.SuppressWarnings("all")
    public void setWordCountMax(final Integer wordCountMax) {
        this.wordCountMax = wordCountMax;
    }

    @java.lang.SuppressWarnings("all")
    public void setUpdateTimeMin(final Date updateTimeMin) {
        this.updateTimeMin = updateTimeMin;
    }

    @java.lang.SuppressWarnings("all")
    public void setUpdatePeriod(final Long updatePeriod) {
        this.updatePeriod = updatePeriod;
    }

    @java.lang.SuppressWarnings("all")
    public void setSort(final String sort) {
        this.sort = sort;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof BookSpVO)) return false;
        final BookSpVO other = (BookSpVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$keyword = this.getKeyword();
        final java.lang.Object other$keyword = other.getKeyword();
        if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) return false;
        final java.lang.Object this$workDirection = this.getWorkDirection();
        final java.lang.Object other$workDirection = other.getWorkDirection();
        if (this$workDirection == null ? other$workDirection != null : !this$workDirection.equals(other$workDirection)) return false;
        final java.lang.Object this$catId = this.getCatId();
        final java.lang.Object other$catId = other.getCatId();
        if (this$catId == null ? other$catId != null : !this$catId.equals(other$catId)) return false;
        final java.lang.Object this$isVip = this.getIsVip();
        final java.lang.Object other$isVip = other.getIsVip();
        if (this$isVip == null ? other$isVip != null : !this$isVip.equals(other$isVip)) return false;
        final java.lang.Object this$bookStatus = this.getBookStatus();
        final java.lang.Object other$bookStatus = other.getBookStatus();
        if (this$bookStatus == null ? other$bookStatus != null : !this$bookStatus.equals(other$bookStatus)) return false;
        final java.lang.Object this$wordCountMin = this.getWordCountMin();
        final java.lang.Object other$wordCountMin = other.getWordCountMin();
        if (this$wordCountMin == null ? other$wordCountMin != null : !this$wordCountMin.equals(other$wordCountMin)) return false;
        final java.lang.Object this$wordCountMax = this.getWordCountMax();
        final java.lang.Object other$wordCountMax = other.getWordCountMax();
        if (this$wordCountMax == null ? other$wordCountMax != null : !this$wordCountMax.equals(other$wordCountMax)) return false;
        final java.lang.Object this$updateTimeMin = this.getUpdateTimeMin();
        final java.lang.Object other$updateTimeMin = other.getUpdateTimeMin();
        if (this$updateTimeMin == null ? other$updateTimeMin != null : !this$updateTimeMin.equals(other$updateTimeMin)) return false;
        final java.lang.Object this$updatePeriod = this.getUpdatePeriod();
        final java.lang.Object other$updatePeriod = other.getUpdatePeriod();
        if (this$updatePeriod == null ? other$updatePeriod != null : !this$updatePeriod.equals(other$updatePeriod)) return false;
        final java.lang.Object this$sort = this.getSort();
        final java.lang.Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof BookSpVO;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $keyword = this.getKeyword();
        result = result * PRIME + ($keyword == null ? 43 : $keyword.hashCode());
        final java.lang.Object $workDirection = this.getWorkDirection();
        result = result * PRIME + ($workDirection == null ? 43 : $workDirection.hashCode());
        final java.lang.Object $catId = this.getCatId();
        result = result * PRIME + ($catId == null ? 43 : $catId.hashCode());
        final java.lang.Object $isVip = this.getIsVip();
        result = result * PRIME + ($isVip == null ? 43 : $isVip.hashCode());
        final java.lang.Object $bookStatus = this.getBookStatus();
        result = result * PRIME + ($bookStatus == null ? 43 : $bookStatus.hashCode());
        final java.lang.Object $wordCountMin = this.getWordCountMin();
        result = result * PRIME + ($wordCountMin == null ? 43 : $wordCountMin.hashCode());
        final java.lang.Object $wordCountMax = this.getWordCountMax();
        result = result * PRIME + ($wordCountMax == null ? 43 : $wordCountMax.hashCode());
        final java.lang.Object $updateTimeMin = this.getUpdateTimeMin();
        result = result * PRIME + ($updateTimeMin == null ? 43 : $updateTimeMin.hashCode());
        final java.lang.Object $updatePeriod = this.getUpdatePeriod();
        result = result * PRIME + ($updatePeriod == null ? 43 : $updatePeriod.hashCode());
        final java.lang.Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "BookSpVO(keyword=" + this.getKeyword() + ", workDirection=" + this.getWorkDirection() + ", catId=" + this.getCatId() + ", isVip=" + this.getIsVip() + ", bookStatus=" + this.getBookStatus() + ", wordCountMin=" + this.getWordCountMin() + ", wordCountMax=" + this.getWordCountMax() + ", updateTimeMin=" + this.getUpdateTimeMin() + ", updatePeriod=" + this.getUpdatePeriod() + ", sort=" + this.getSort() + ")";
    }
}
