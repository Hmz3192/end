package com.end.onlineendapp.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * Description :
 * FileName :
 *
 * @author : Hu mingzhi
 * @version :
 * @date : 2021/8/3 17:22
 */
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
