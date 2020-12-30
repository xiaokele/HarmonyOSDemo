package com.kele.hos_demo_1.toast_dialog;

import com.kele.hos_demo_1.toast_dialog.slice.ToastDialogAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class ToastDialogAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ToastDialogAbilitySlice.class.getName());
    }
}
