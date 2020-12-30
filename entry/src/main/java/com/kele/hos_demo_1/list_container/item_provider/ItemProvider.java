package com.kele.hos_demo_1.list_container.item_provider;

import com.kele.hos_demo_1.ResourceTable;
import com.kele.hos_demo_1.list_container.item.ItemSimple;
import ohos.aafwk.ability.AbilitySlice;
import ohos.agp.components.*;

import java.util.List;

/**
 * CREATE TIME : 2020/12/30
 * BY : Admin
 * DES :
 */
public class ItemProvider extends RecycleItemProvider {

    private List<ItemSimple> list;
    private AbilitySlice slice;

    public ItemProvider(List<ItemSimple> list, AbilitySlice slice) {
        this.list = list;
        this.slice = slice;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public Component getComponent(int i, Component component, ComponentContainer componentContainer) {
        Component cpt = component;
        if (null == cpt) {
            cpt = LayoutScatter.getInstance(slice).parse(ResourceTable.Layout_item_simple, null, false);
        }
        ItemSimple itemSimple = list.get(i);
        Text tIndex = (Text) cpt.findComponentById(ResourceTable.Id_item_index);
        tIndex.setText(itemSimple.getName());
        return cpt;
    }
}
