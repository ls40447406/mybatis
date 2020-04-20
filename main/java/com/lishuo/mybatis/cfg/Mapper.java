package com.lishuo.mybatis.cfg;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 封装执行的Sql和结果集类型
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Mapper {

    /** 要执行的sql语句 */
    private String queryString;
    /** 实体类的全限定类名 */
    private String resultType;


}
