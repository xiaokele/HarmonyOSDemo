package com.kele.hos_demo_1.phone_service.slice;

import com.kele.hos_demo_1.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.dcall.CallStateObserver;
import ohos.dcall.DistributedCallManager;
import ohos.eventhandler.EventRunner;

public class PhoneServiceAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_phone_service);

        findComponentById(ResourceTable.Id_tv_simple_call).setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                // 创建呼叫管理对象
                DistributedCallManager dcManager = DistributedCallManager.getInstance(getContext());

                // 调用查询能力接口
                if (!dcManager.hasVoiceCapability()) {
                    return;
                }

                // 如果设备支持呼叫能力，则继续发起呼叫
                dcManager.dial("15102314513", false);

                // 创建继承CallStateObserver的类MyCallStateObserver
                class MyCallStateObserver extends CallStateObserver {
                    // 构造方法，在当前线程的runner中执行回调，slotId需要传入要观察的卡槽ID（0或1）
                    MyCallStateObserver(int slotId) {
                        super(slotId);
                    }

                    // 构造方法，在执行runner中执行回调，slotId需要传入要观察的卡槽ID（0或1）
                    MyCallStateObserver(int slotId, EventRunner runner) {
                        super(slotId, runner);
                    }

                    // 通话状态变化的回调方法
                    @Override
                    public void onCallStateUpdated(int state, String number) {
                    }
                }

                // 执行回调的runner
                EventRunner runner = EventRunner.create();

                // 创建MyCallStateObserver的对象
                MyCallStateObserver observer = new MyCallStateObserver(0, runner);

                // 观察OBSERVE_CALL_STATE的变化
                dcManager.addObserver(observer, CallStateObserver.OBSERVE_MASK_CALL_STATE);
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
