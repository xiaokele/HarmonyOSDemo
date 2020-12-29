package com.kele.hos_demo_1.time_picker;

import com.kele.hos_demo_1.time_picker.slice.TimePickerAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class TimePickerAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(TimePickerAbilitySlice.class.getName());
    }
}
