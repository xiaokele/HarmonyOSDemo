package com.kele.hos_demo_1.radio_container;

import com.kele.hos_demo_1.radio_container.slice.RadiocontainerAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class RadioContainerAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(RadiocontainerAbilitySlice.class.getName());
    }
}
