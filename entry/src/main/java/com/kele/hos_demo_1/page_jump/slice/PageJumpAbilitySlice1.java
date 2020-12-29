package com.kele.hos_demo_1.page_jump.slice;

import com.kele.hos_demo_1.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;

/**
 * CREATE TIME : 2020/12/18
 * BY : Admin
 * DES :
 */
public class PageJumpAbilitySlice1 extends AbilitySlice {

    public static final String RESULT_KEY_1 = "RESULT_KEY_1";

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_page_jump_1);

        Intent resultIntent = new Intent();
        resultIntent.setParam(RESULT_KEY_1, "PageJumpAbilitySlice1返回结果");
        setResult(resultIntent);
    }
}
