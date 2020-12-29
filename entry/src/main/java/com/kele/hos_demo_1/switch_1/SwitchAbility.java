package com.kele.hos_demo_1.switch_1;

import com.kele.hos_demo_1.switch_1.slice.SwitchAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class SwitchAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(SwitchAbilitySlice.class.getName());
    }
}
