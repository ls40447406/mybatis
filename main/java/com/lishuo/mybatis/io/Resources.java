package com.lishuo.mybatis.io;

import java.io.InputStream;

public class Resources {

    /**
     * 根据传入的参数获取字节输入流
     *
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath) {
        // 获取当前类的字节码，获取字节码的类加载器，根据类加载器读取配置文件信息
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
