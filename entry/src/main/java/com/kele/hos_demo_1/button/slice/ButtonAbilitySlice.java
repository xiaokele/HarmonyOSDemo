package com.kele.hos_demo_1.button.slice;

import com.kele.hos_demo_1.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.TableLayout;
import ohos.agp.utils.TextAlignment;
import ohos.agp.window.dialog.ToastDialog;

public class ButtonAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_button);

        Button btn2 = (Button) findComponentById(ResourceTable.Id_t_btn_2);
        btn2.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                new ToastDialog(getContext())
                        .setText("点击button")
                        .setAlignment(TextAlignment.CENTER)
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
