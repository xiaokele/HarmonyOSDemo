package com.kele.hos_demo_1.radio_button;

import com.kele.hos_demo_1.radio_button.slice.RadioButtonAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class RadioButtonAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(RadioButtonAbilitySlice.class.getName());
    }
}
