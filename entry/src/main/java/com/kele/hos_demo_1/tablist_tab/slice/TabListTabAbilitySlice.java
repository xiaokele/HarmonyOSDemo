package com.kele.hos_demo_1.tablist_tab.slice;

import com.kele.hos_demo_1.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.TabList;
import ohos.agp.utils.TextAlignment;
import ohos.agp.window.dialog.ToastDialog;

public class TabListTabAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_tab_list_tab);

        TabList tabList = (TabList) findComponentById(ResourceTable.Id_tab_list);
        TabList.Tab tab = tabList.new Tab(getContext());
        tab.setText("Image");
        TabList.Tab tab1 = tabList.new Tab(getContext());
        tab1.setText("Video");
        TabList.Tab tab2 = tabList.new Tab(getContext());
        tab2.setText("Audio");
        TabList.Tab tab3 = tabList.new Tab(getContext());
        tab3.setText("HarmonyOs");

        tabList.addTab(tab);
        tabList.addTab(tab1);
        tabList.addTab(tab2);
        tabList.addTab(tab3);

        //tabList.setTabLength(60); // 设置Tab的宽度
        tabList.setTabMargin(10); // 设置两个Tab之间的间距
        tabList.setFixedMode(false);

        // 本示例中在"图片"和"视频"之间的页签中新增"新闻"页签
        TabList.Tab tab4 = tabList.new Tab(getContext());
        tab4.setText("News");
        tab4.setMinWidth(64);
        tab4.setPadding(12, 0, 12, 0);
        tabList.addTab(tab4, 1); // 1表示位置

        tab.select();//默认选中第一个

        tabList.addTabSelectedListener(new TabList.TabSelectedListener() {
            @Override
            public void onSelected(TabList.Tab tab) {
                // 当某个Tab从未选中状态变为选中状态时的回调

                tab.setMinWidth(64);
                tab.setPadding(12, 0, 12, 0);

                int position = tab.getPosition();

                new ToastDialog(getContext())
                        .setText("选中了-"+position)
                        .setAlignment(TextAlignment.CENTER)
                        .show();
            }

            @Override
            public void onUnselected(TabList.Tab tab) {
                // 当某个Tab从选中状态变为未选中状态时的回调
            }

            @Override
            public void onReselected(TabList.Tab tab) {
                // 当某个Tab已处于选中状态，再次被点击时的状态回调
            }
        });
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
