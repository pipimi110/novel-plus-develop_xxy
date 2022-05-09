// Generated by delombok at Mon May 09 23:17:28 CST 2022
package com.java2nb.novel.service.impl;

import com.java2nb.novel.core.utils.Constants;
import com.java2nb.novel.core.utils.FileUtil;
import com.java2nb.novel.service.FileService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * @author 11797
 */
@Service
@ConditionalOnProperty(prefix = "pic.save", name = "storage", havingValue = "local")
public class LocalFileServiceImpl implements FileService {
    @Override
    public String transFile(String picSrc, String picSavePath) {
        return FileUtil.network2Local(picSrc, picSavePath, Constants.LOCAL_PIC_PREFIX);
    }

    @java.lang.SuppressWarnings("all")
    public LocalFileServiceImpl() {
    }
}
