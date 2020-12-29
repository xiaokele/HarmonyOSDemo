package com.kele.hos_demo_1;

import com.kele.hos_demo_1.slice.SecondAbilitySlice;
import com.kele.hos_demo_1.slice.SecondAbilitySlice1;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class SecondAbility extends Ability {

    public static final int RESULT_CODE = 1;
    public static final String RESULT_KEY_1 = "RESULT_KEY_1";

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(SecondAbilitySlice.class.getName());

        addActionRoute("second_ability_1", SecondAbilitySlice1.class.getName());

        Intent resultIntent = new Intent();
        resultIntent.setParam(RESULT_KEY_1, "SecondAbility返回结果");
        setResult(RESULT_CODE, resultIntent);
    }
}
