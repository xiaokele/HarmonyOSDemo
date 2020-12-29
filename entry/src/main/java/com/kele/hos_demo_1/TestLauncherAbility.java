package com.kele.hos_demo_1;

import com.kele.hos_demo_1.slice.TestLauncherAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class TestLauncherAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(TestLauncherAbilitySlice.class.getName());
    }
}
