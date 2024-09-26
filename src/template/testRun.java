package template;

import template.enums.ExportEnum;
import template.form.DownLoadForm;
import template.result.DownLoadVo;
import template.task.DownTask;

public class testRun {
    public static void main(String[] args) {
        TemplateAbstract task = new DownTask();
        DownLoadVo down = task.down(ExportEnum.FACE, new DownLoadForm());
        System.out.println(down);
    }
}
