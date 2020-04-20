package com.lishuo.mybatis.cfg;

        import lombok.AllArgsConstructor;
        import lombok.Getter;
        import lombok.NoArgsConstructor;
        import lombok.Setter;

        import java.util.HashMap;
        import java.util.Map;

/**
 * Mybatis 配置类
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Configuration {

    /** 数据库驱动链接 */
    private String driver;
    /** 数据库地址 */
    private String url;
    /** 账号 */
    private String username;
    /** 密码 */
    private String password;

    private Map<String, Mapper> mappers = new HashMap<String, Mapper>();

}
