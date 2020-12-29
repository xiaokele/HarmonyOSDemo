package com.kele.hos_demo_1.picker;

import com.kele.hos_demo_1.picker.slice.PickerAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class PickerAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(PickerAbilitySlice.class.getName());
    }
}
