package com.kele.hos_demo_1.text_field;

import com.kele.hos_demo_1.text_field.slice.TextFieldAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class TextFieldAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(TextFieldAbilitySlice.class.getName());
    }
}
