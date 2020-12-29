package com.kele.hos_demo_1.time_picker.slice;

import com.kele.hos_demo_1.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.TimePicker;

public class TimePickerAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_time_picker);

        TimePicker timePicker = (TimePicker) findComponentById(ResourceTable.Id_time_picker);
        int hour = timePicker.getHour();
        int minute = timePicker.getMinute();
        int second = timePicker.getSecond();

        timePicker.set24Hour(false);

        timePicker.setHour(19);
        timePicker.setMinute(18);
        timePicker.setSecond(12);

        timePicker.setTimeChangedListener(new TimePicker.TimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1, int i2) {

            }
        });

        timePicker.showHour(true);
        timePicker.showMinute(true);
        timePicker.showSecond(true);

        timePicker.enableHour(true);
        timePicker.enableSecond(false);
        timePicker.enableMinute(true);
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
