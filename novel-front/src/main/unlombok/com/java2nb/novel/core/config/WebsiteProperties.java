// Generated by delombok at Mon May 09 23:17:28 CST 2022
package com.java2nb.novel.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 11797
 */
@Component
@ConfigurationProperties(prefix = "website")
public class WebsiteProperties {
    private String name;
    private String domain;
    private String keyword;
    private String description;
    private String qq;

    @java.lang.SuppressWarnings("all")
    public WebsiteProperties() {
    }

    @java.lang.SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @java.lang.SuppressWarnings("all")
    public String getDomain() {
        return this.domain;
    }

    @java.lang.SuppressWarnings("all")
    public String getKeyword() {
        return this.keyword;
    }

    @java.lang.SuppressWarnings("all")
    public String getDescription() {
        return this.description;
    }

    @java.lang.SuppressWarnings("all")
    public String getQq() {
        return this.qq;
    }

    @java.lang.SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    @java.lang.SuppressWarnings("all")
    public void setDomain(final String domain) {
        this.domain = domain;
    }

    @java.lang.SuppressWarnings("all")
    public void setKeyword(final String keyword) {
        this.keyword = keyword;
    }

    @java.lang.SuppressWarnings("all")
    public void setDescription(final String description) {
        this.description = description;
    }

    @java.lang.SuppressWarnings("all")
    public void setQq(final String qq) {
        this.qq = qq;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof WebsiteProperties)) return false;
        final WebsiteProperties other = (WebsiteProperties) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$name = this.getName();
        final java.lang.Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final java.lang.Object this$domain = this.getDomain();
        final java.lang.Object other$domain = other.getDomain();
        if (this$domain == null ? other$domain != null : !this$domain.equals(other$domain)) return false;
        final java.lang.Object this$keyword = this.getKeyword();
        final java.lang.Object other$keyword = other.getKeyword();
        if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) return false;
        final java.lang.Object this$description = this.getDescription();
        final java.lang.Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) return false;
        final java.lang.Object this$qq = this.getQq();
        final java.lang.Object other$qq = other.getQq();
        if (this$qq == null ? other$qq != null : !this$qq.equals(other$qq)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebsiteProperties;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final java.lang.Object $domain = this.getDomain();
        result = result * PRIME + ($domain == null ? 43 : $domain.hashCode());
        final java.lang.Object $keyword = this.getKeyword();
        result = result * PRIME + ($keyword == null ? 43 : $keyword.hashCode());
        final java.lang.Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final java.lang.Object $qq = this.getQq();
        result = result * PRIME + ($qq == null ? 43 : $qq.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "WebsiteProperties(name=" + this.getName() + ", domain=" + this.getDomain() + ", keyword=" + this.getKeyword() + ", description=" + this.getDescription() + ", qq=" + this.getQq() + ")";
    }
}
