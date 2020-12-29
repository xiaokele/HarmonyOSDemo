package com.kele.hos_demo_1;

import com.kele.hos_demo_1.slice.MainAbilitySlice;
import com.kele.hos_demo_1.utils.ToastDialogUtil;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        ToastDialogUtil.showToast(this,"MainAbility-onStart");

        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
    }

    @Override
    protected void onActive() {
        ToastDialogUtil.showToast(this,"MainAbility-onActive");

        super.onActive();
    }

    @Override
    protected void onForeground(Intent intent) {
        ToastDialogUtil.showToast(this,"MainAbility-onForeground");

        super.onForeground(intent);
    }

    @Override
    protected void onInactive() {
        ToastDialogUtil.showToast(this,"MainAbility-onInactive");

        super.onInactive();
    }

    @Override
    protected void onBackground() {
        ToastDialogUtil.showToast(this,"MainAbility-onBackground");

        super.onBackground();
    }

    @Override
    protected void onStop() {
        ToastDialogUtil.showToast(this,"MainAbility-onStop");

        super.onStop();
    }

    @Override
    protected void onBackPressed() {
        ToastDialogUtil.showToast(this,"MainAbility-onBackPressed");

        super.onBackPressed();
    }
}
