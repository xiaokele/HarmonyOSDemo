package com.kele.hos_demo_1.tablist_tab;

import com.kele.hos_demo_1.tablist_tab.slice.TabListTabAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class TabListTabAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(TabListTabAbilitySlice.class.getName());
    }
}
