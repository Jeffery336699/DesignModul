package com.mall.designmodul.factory.modul_2;

public abstract class ExportOperate {

    public abstract ExportFileApi newFileApi();
    private void doActionFront(){}
    private void doActionAfter(){}

    public void export(String data) {
        doActionFront();
        ExportFileApi exportFileApi = newFileApi();
        exportFileApi.export(data);
        doActionAfter();
    }
}
