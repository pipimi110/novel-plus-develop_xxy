// Generated by delombok at Mon May 09 23:17:28 CST 2022
package com.java2nb.novel.core.schedule;

import com.java2nb.novel.core.utils.Constants;
import com.java2nb.novel.entity.Book;
import com.java2nb.novel.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 将爬取的网络图片转存为自己的存储介质（本地、OSS、fastDfs）任务
 *
 * @author Administrator
 */
@ConditionalOnProperty(prefix = "pic.save", name = "type", havingValue = "2")
@Service
public class CrawlPicTransSchedule {
    @java.lang.SuppressWarnings("all")
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CrawlPicTransSchedule.class);
    private final BookService bookService;
    @Value("${pic.save.type}")
    private Integer picSaveType;
    @Value("${pic.save.path}")
    private String picSavePath;

    /**
     * 10分钟转一次
     */
    @Scheduled(fixedRate = 1000 * 60 * 10)
    public void trans() {
        try {
            log.info("Network2LocalPicSchedule。。。。。。。。。。。。");
            List<Book> networkPicBooks = bookService.queryNetworkPicBooks(Constants.LOCAL_PIC_PREFIX, 100);
            for (Book book : networkPicBooks) {
                bookService.updateBookPicToLocal(book.getPicUrl(), book.getId());
                //3秒钟转化一张图片，10分钟转化200张
                Thread.sleep(3000);
            }
        } catch (final java.lang.Throwable $ex) {
            throw lombok.Lombok.sneakyThrow($ex);
        }
    }

    @java.lang.SuppressWarnings("all")
    public CrawlPicTransSchedule(final BookService bookService) {
        this.bookService = bookService;
    }
}
