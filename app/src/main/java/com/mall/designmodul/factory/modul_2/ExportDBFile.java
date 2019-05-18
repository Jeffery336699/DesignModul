package com.mall.designmodul.factory.modul_2;

/**
 * 导出数据库文件
 */
public class ExportDBFile implements ExportFileApi {
    @Override
    public void export(String data) {
        System.out.println("导出数据库文件~~~~~~~~"+data);
    }
}
