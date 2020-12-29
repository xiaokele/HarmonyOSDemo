package com.kele.hos_demo_1.page_jump;

import com.kele.hos_demo_1.page_jump.slice.PageJumpAbilitySlice;
import com.kele.hos_demo_1.page_jump.slice.PageJumpAbilitySlice1;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.hiviewdfx.HiLog;

public class PageJumpAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(PageJumpAbilitySlice.class.getName());

        addActionRoute("page_jump_slice_1", PageJumpAbilitySlice1.class.getName());
    }
}
