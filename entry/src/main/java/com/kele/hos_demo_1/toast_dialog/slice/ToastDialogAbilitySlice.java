package com.kele.hos_demo_1.toast_dialog.slice;

import com.kele.hos_demo_1.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.LayoutScatter;
import ohos.agp.utils.LayoutAlignment;
import ohos.agp.window.dialog.ToastDialog;

public class ToastDialogAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_toast_dialog);

        Component tSimpleTaostDialog = findComponentById(ResourceTable.Id_t_simple_toast_dialog);
        tSimpleTaostDialog.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                new ToastDialog(getContext())
                        .setText("这是一个简单的弹窗")
                        .setAlignment(LayoutAlignment.CENTER)
                        .show();
            }
        });

        Component tCustomToastDialog = findComponentById(ResourceTable.Id_t_custom_toast_dialog);
        tCustomToastDialog.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                DirectionalLayout customToastLayout = (DirectionalLayout) LayoutScatter.getInstance(getContext()).parse(ResourceTable.Layout_layout_toast, null, false);
                new ToastDialog(getContext())
                        .setComponent(customToastLayout)
                        .setSize(DirectionalLayout.LayoutConfig.MATCH_CONTENT, DirectionalLayout.LayoutConfig.MATCH_CONTENT)
                        .setAlignment(LayoutAlignment.CENTER)
                        .show();
            }
        });
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
