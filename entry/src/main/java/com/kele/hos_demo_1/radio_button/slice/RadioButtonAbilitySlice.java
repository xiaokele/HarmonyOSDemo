package com.kele.hos_demo_1.radio_button.slice;

import com.kele.hos_demo_1.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.AbsButton;
import ohos.agp.components.Component;
import ohos.agp.components.RadioButton;
import ohos.agp.components.RadioContainer;
import ohos.agp.utils.Color;

public class RadioButtonAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_radio_button);

        RadioButton rBtn = (RadioButton) findComponentById(ResourceTable.Id_rb_1);

        rBtn.setTextColorOn(new Color(Color.getIntColor("#0066FF")));
        rBtn.setTextColorOff(new Color(Color.getIntColor("#505050")));

        RadioContainer container = (RadioContainer)findComponentById(ResourceTable.Id_radio_container);
        container.setMarkChangedListener(new RadioContainer.CheckedStateChangedListener() {
            @Override
            public void onCheckedChanged(RadioContainer radioContainer, int index) {

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
