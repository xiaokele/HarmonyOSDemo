package com.kele.hos_demo_1.progressbar.slice;

import com.kele.hos_demo_1.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.ProgressBar;
import ohos.agp.components.RadioButton;
import ohos.agp.utils.Color;

public class ProgressBarAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_progress_bar);

        ProgressBar pb = (ProgressBar) findComponentById(ResourceTable.Id_pb);

        pb.setDividerLineColor(Color.MAGENTA);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
