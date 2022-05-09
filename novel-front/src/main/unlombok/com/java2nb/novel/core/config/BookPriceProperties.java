// Generated by delombok at Mon May 09 23:17:28 CST 2022
package com.java2nb.novel.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

/**
 * 章节费用配置属性
 * @author cd
 */
@Component
@ConfigurationProperties(prefix = "book.price")
public class BookPriceProperties {
    private BigDecimal wordCount;
    private BigDecimal value;

    @java.lang.SuppressWarnings("all")
    public BookPriceProperties() {
    }

    @java.lang.SuppressWarnings("all")
    public BigDecimal getWordCount() {
        return this.wordCount;
    }

    @java.lang.SuppressWarnings("all")
    public BigDecimal getValue() {
        return this.value;
    }

    @java.lang.SuppressWarnings("all")
    public void setWordCount(final BigDecimal wordCount) {
        this.wordCount = wordCount;
    }

    @java.lang.SuppressWarnings("all")
    public void setValue(final BigDecimal value) {
        this.value = value;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof BookPriceProperties)) return false;
        final BookPriceProperties other = (BookPriceProperties) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$wordCount = this.getWordCount();
        final java.lang.Object other$wordCount = other.getWordCount();
        if (this$wordCount == null ? other$wordCount != null : !this$wordCount.equals(other$wordCount)) return false;
        final java.lang.Object this$value = this.getValue();
        final java.lang.Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof BookPriceProperties;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $wordCount = this.getWordCount();
        result = result * PRIME + ($wordCount == null ? 43 : $wordCount.hashCode());
        final java.lang.Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "BookPriceProperties(wordCount=" + this.getWordCount() + ", value=" + this.getValue() + ")";
    }
}