package com.kele.hos_demo_1.picker.slice;

import com.kele.hos_demo_1.ResourceTable;
import com.kele.hos_demo_1.utils.ToastDialogUtil;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.Picker;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.text.Font;
import ohos.agp.utils.Color;

public class PickerAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_picker);

        Picker picker = (Picker) findComponentById(ResourceTable.Id_test_picker);
        picker.setMinValue(0); // 设置选择器中的最小值
        picker.setMaxValue(6); // 设置选择器中的最大值

        picker.setValueChangedListener(new Picker.ValueChangedListener() {
            @Override
            public void onValueChanged(Picker picker, int i, int i1) {
                ToastDialogUtil.showToast(getContext(),"值由-"+i+"-变为-"+i1);
            }
        });
        picker.setFormatter(new Picker.Formatter() {
            @Override
            public String format(int i) {
                String value;
                switch (i) {
                    case 0:
                        value = "Mon";
                        break;
                    case 1:
                        value = "Tue";
                        break;
                    case 2:
                        value = "Wed";
                        break;
                    default:
                        value = "Wed-1";
                }
                return value;
            }
        });
        picker.setDisplayedData(new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"});

        picker.setNormalTextFont(Font.DEFAULT_BOLD);
        picker.setNormalTextSize(40);
        picker.setNormalTextColor(new Color(Color.getIntColor("#FFA500")));
        picker.setSelectedTextFont(Font.DEFAULT_BOLD);
        picker.setSelectedTextSize(40);
        picker.setSelectedTextColor(new Color(Color.getIntColor("#00FFFF")));

        ShapeElement shape = new ShapeElement();
        shape.setShape(ShapeElement.RECTANGLE);
        shape.setRgbColor(RgbColor.fromArgbInt(0xFF40E0D0));
        // 单独设置上边框
        // picker.setDisplayedLinesTopElement(shape);
        // 单独设置下边框
        // picker.setDisplayedLinesBottomElement(shape);
        // 同时设置上下边框
        picker.setDisplayedLinesElements(shape,shape);

        picker.setShaderColor(new Color(Color.getIntColor("#1E90FF")));

        picker.setSelectedNormalTextMarginRatio(5.0f);

        boolean isWheel = picker.isWheelModeEnabled(); // 获取当前是否是选择轮模式
        picker.setWheelModeEnabled(!isWheel);
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
