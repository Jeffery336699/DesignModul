package com.mall.designmodul.factory.modul_2;

public class ExportDBOperate extends ExportOperate {
    @Override
    public ExportFileApi newFileApi() {
        return new ExportDBFile();
    }
}
