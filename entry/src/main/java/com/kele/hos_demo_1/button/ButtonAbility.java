package com.kele.hos_demo_1.button;

import com.kele.hos_demo_1.button.slice.ButtonAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class ButtonAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ButtonAbilitySlice.class.getName());
    }
}
