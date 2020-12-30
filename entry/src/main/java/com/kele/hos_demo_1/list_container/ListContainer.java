package com.kele.hos_demo_1.list_container;

import com.kele.hos_demo_1.list_container.slice.ListContainerSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class ListContainer extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ListContainerSlice.class.getName());
    }
}
