package com.kele.hos_demo_1.list_container.slice;

import com.kele.hos_demo_1.ResourceTable;
import com.kele.hos_demo_1.list_container.item.ItemSimple;
import com.kele.hos_demo_1.list_container.item_provider.ItemProvider;
import com.kele.hos_demo_1.utils.ToastDialogUtil;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.ListContainer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListContainerSlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_list_container);
        initListContainer();
    }

    private void initListContainer() {
        ListContainer listContainer = (ListContainer) findComponentById(ResourceTable.Id_list_container);

        listContainer.setContentOffSet(32,16);
        listContainer.setReboundEffectParams(40,0.6f,20);

        ArrayList<ItemSimple> data = getData();
        ItemProvider itemProvider = new ItemProvider(data, this);
        listContainer.setItemProvider(itemProvider);

        listContainer.setItemClickedListener(new ListContainer.ItemClickedListener() {
            @Override
            public void onItemClicked(ListContainer listContainer, Component component, int i, long l) {
                ItemSimple item = (ItemSimple) listContainer.getItemProvider().getItem(i);
                ToastDialogUtil.showToast(getContext(), "点了-" + item.getName());
            }
        });
    }

    private ArrayList<ItemSimple> getData() {
        ArrayList<ItemSimple> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new ItemSimple("可乐-" + i));
        }
        return list;
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
