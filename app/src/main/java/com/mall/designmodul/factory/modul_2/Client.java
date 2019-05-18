package com.mall.designmodul.factory.modul_2;

public class Client {

    public static void main(String[] args) {
        String data = "这是数据.....";
        //导出数据库文件
        ExportFileApi exportDBFile = new ExportDBFile();
        exportDBFile.export(data);

        //导出文本文件
        ExportFileApi exportTextFile = new ExportTextFile();
        exportTextFile.export(data);


        System.out.println("--------分割线-------");

        ExportOperate exportOperate=new ExportDBOperate();
        exportOperate.export(data);

        ExportOperate exportOperate1=new ExportTextOperate();
        exportOperate1.export(data);

    }

}
