package com.kele.hos_demo_1.slice;

import com.kele.hos_demo_1.ResourceTable;
import com.kele.hos_demo_1.item.SecondListItem;
import com.kele.hos_demo_1.provider.SecondListItemProvider;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Component;
import ohos.agp.components.ListContainer;
import ohos.media.camera.params.ResultKey;

import java.util.ArrayList;

public class SecondAbilitySlice1 extends AbilitySlice {

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_second_1);

    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
