package io.choerodon.admin.infra.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Tag;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * <p>
 * Swagger Api 描述配置
 * </p>
 *
 * @author qingsheng.chen 2018/7/30 星期一 14:26
 */
@Configuration
public class C7nSwaggerApiConfig {

    public static final String CHOERODON_STATISTIC = "Choerodon Statistic";


    @Autowired
    public C7nSwaggerApiConfig(Docket docket) {
        docket.tags(
                new Tag(CHOERODON_STATISTIC, "Choerodon菜单统计")

        );
    }
}
