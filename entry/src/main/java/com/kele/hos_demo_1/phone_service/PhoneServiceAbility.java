package com.kele.hos_demo_1.phone_service;

import com.kele.hos_demo_1.phone_service.slice.PhoneServiceAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class PhoneServiceAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(PhoneServiceAbilitySlice.class.getName());
    }
}
