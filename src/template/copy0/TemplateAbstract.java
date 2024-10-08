package template.copy0;

import template.copy0.enums.ExportEnum;
import template.copy0.form.DownLoadForm;
import template.copy0.result.DownLoadVo;

import java.util.UUID;

public abstract class TemplateAbstract {

    DownLoadVo down(ExportEnum exportEnum, DownLoadForm downLoadForm){
        String insert = insert(exportEnum.name());
        Integer mayBeTime = getMayBeTime(exportEnum.name(), downLoadForm.toString());
        downTask();
        return new DownLoadVo();
    }

    public String insert(String type){
        System.out.println(type + "类型插入数据库");
        return UUID.randomUUID().toString();
    }

    public Integer getMayBeTime(String type, String form){
        return 30;
    }

    public abstract void downTask();

}
