package template.copy0;

import template.copy0.enums.ExportEnum;
import template.copy0.form.DownLoadForm;
import template.copy0.result.DownLoadVo;
import template.copy0.task.DownTask;

public class testRun {
    public static void main(String[] args) {
        TemplateAbstract task = new DownTask();
        DownLoadVo down = task.down(ExportEnum.FACE, new DownLoadForm());
        System.out.println(down);
    }

}
