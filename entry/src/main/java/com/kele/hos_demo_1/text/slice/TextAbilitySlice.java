package com.kele.hos_demo_1.text.slice;

import com.kele.hos_demo_1.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class TextAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_text);

        Text txt1 = (Text) findComponentById(ResourceTable.Id_text_1);
        // 设置自动调整规则
        txt1.setAutoFontSizeRule(30, 100, 1);
        // 设置点击一次增多一个"T"
        txt1.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component Component) {
                txt1.setText(txt1.getText() + "T");
            }
        });

        Text txt2 = (Text) findComponentById(ResourceTable.Id_text_2);
        // 跑马灯效果
        txt2.setTruncationMode(Text.TruncationMode.AUTO_SCROLLING);
        //设置跑的次数
        txt2.setAutoScrollingCount(Text.AUTO_SCROLLING_FOREVER);
        // 启动跑马灯效果
        txt2.startAutoScrolling();
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
