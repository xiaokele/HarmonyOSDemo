package com.kele.hos_demo_1.round_progress;

import com.kele.hos_demo_1.round_progress.slice.RoundProgressBarAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class RoundProgressBarAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(RoundProgressBarAbilitySlice.class.getName());
    }
}
