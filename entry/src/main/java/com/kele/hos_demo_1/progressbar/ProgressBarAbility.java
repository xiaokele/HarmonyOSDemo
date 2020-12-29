package com.kele.hos_demo_1.progressbar;

import com.kele.hos_demo_1.progressbar.slice.ProgressBarAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class ProgressBarAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ProgressBarAbilitySlice.class.getName());
    }
}
