package com.kele.hos_demo_1.provider;

import com.kele.hos_demo_1.ResourceTable;
import com.kele.hos_demo_1.item.SecondListItem;
import ohos.aafwk.ability.AbilitySlice;
import ohos.agp.components.*;

import java.util.List;

/**
 * CREATE TIME : 2020/12/17
 * BY : Admin
 * DES :
 */
public class SecondListItemProvider extends RecycleItemProvider {

    private List<SecondListItem> list;
    private AbilitySlice slice;

    public SecondListItemProvider(List<SecondListItem> list, AbilitySlice slice) {
        this.list = list;
        this.slice = slice;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Component getComponent(int position, Component component, ComponentContainer componentContainer) {
        SecondListItem item = list.get(position);
        if (component == null) {
            Component cpt = LayoutScatter.getInstance(slice).parse(ResourceTable.Layout_item_second_list_container, null, false);
            Text txt = (Text) cpt.findComponentById(ResourceTable.Id_item_index);
            txt.setText(item.getName());
            return cpt;
        }else{
            Text txt = (Text) component.findComponentById(ResourceTable.Id_item_index);
            txt.setText(item.getName());
            return component;
        }
    }
}
