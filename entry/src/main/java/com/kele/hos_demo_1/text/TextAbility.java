package com.kele.hos_demo_1.text;

import com.kele.hos_demo_1.text.slice.TextAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class TextAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(TextAbilitySlice.class.getName());
    }
}
