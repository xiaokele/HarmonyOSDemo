package com.kele.hos_demo_1.check_box;

import com.kele.hos_demo_1.check_box.slice.CheckBoxAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class CheckBoxAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(CheckBoxAbilitySlice.class.getName());
    }
}
