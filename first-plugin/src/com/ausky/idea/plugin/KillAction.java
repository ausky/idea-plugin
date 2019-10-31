package com.ausky.idea.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import com.intellij.util.IconUtil;
import com.jetbrains.ide.model.Icon;

/**
 * Created with IntelliJ IDEA.
 * User: hy.ao
 * Date: 2019-09-08
 * Time: 09:40
 * 文件说明：TODO
 */
public class KillAction extends AnAction
{

    @Override
    public void actionPerformed( AnActionEvent e )
    {
        int message = Messages.showTwoStepConfirmationDialog( "kill All Java ?", "kill all java", "是", IconUtil.getRemoveIcon() );

        Messages.showMessageDialog( "Hello World !" + message, "Information", Messages.getInformationIcon() );
    }
}
