package com.kele.hos_demo_1.data_picker;

import com.kele.hos_demo_1.data_picker.slice.DataPickerAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class DataPickerAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(DataPickerAbilitySlice.class.getName());
    }
}
