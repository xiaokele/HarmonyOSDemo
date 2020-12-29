package com.kele.hos_demo_1.data_picker.slice;

import com.kele.hos_demo_1.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.DatePicker;
import ohos.agp.components.Text;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;

public class DataPickerAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_data_picker);

        // 获取DatePicker实例
        DatePicker datePicker = (DatePicker) findComponentById(ResourceTable.Id_date_pick);
        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();
        int year = datePicker.getYear();

        Text selectedDate = (Text) findComponentById(ResourceTable.Id_text_date);
        datePicker.setValueChangedListener(
                new DatePicker.ValueChangedListener() {
                    @Override
                    public void onValueChanged(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                        selectedDate.setText(dayOfMonth + "/" + monthOfYear + "/" + year);
                    }
                }
        );

        datePicker.updateDate(2021, 8, 8);

        datePicker.setMinDate(1627747200);
        datePicker.setMaxDate(1630339200);

        datePicker.setYearFixed(true);//年份固定，默认false
        datePicker.setMonthFixed(false);
        datePicker.setDayFixed(true);

        ShapeElement shape = new ShapeElement();
        shape.setShape(ShapeElement.RECTANGLE);
        shape.setRgbColor(RgbColor.fromArgbInt(0xFF9370DB));
        datePicker.setDisplayedLinesElements(shape,shape);
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
