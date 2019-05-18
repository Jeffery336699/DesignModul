package com.mall.designmodul.factory.modul_2;

public class ExportTextOperate extends ExportOperate {
    @Override
    public ExportFileApi newFileApi() {
        return new ExportTextFile();
    }
}
