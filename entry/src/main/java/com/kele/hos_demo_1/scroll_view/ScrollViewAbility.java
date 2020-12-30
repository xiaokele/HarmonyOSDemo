package com.kele.hos_demo_1.scroll_view;

import com.kele.hos_demo_1.scroll_view.slice.ScrollViewAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class ScrollViewAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ScrollViewAbilitySlice.class.getName());
    }
}
