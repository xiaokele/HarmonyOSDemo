package com.kele.hos_demo_1.slice;

import com.kele.hos_demo_1.ResourceTable;
import com.kele.hos_demo_1.utils.ToastDialogUtil;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.agp.window.dialog.CommonDialog;
import ohos.agp.window.dialog.ToastDialog;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.hiviewdfx.HiTrace;
import ohos.hiviewdfx.HiTraceId;

import java.util.logging.Logger;

public class MainAbilitySlice extends AbilitySlice {

    //int clickEdValue = 0;

    @Override
    public void onStart(Intent intent) {

        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        Button mBtn = (Button) findComponentById(ResourceTable.Id_button);

        mBtn.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {

                //clickEdValue += 2;
                Intent secondAbilityIntent = new Intent();
                Operation secondAbilityIntentOperation = new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName("com.kele.hos_demo_1")
                        .withAbilityName("com.kele.hos_demo_1.SecondAbility")
                        .build();
                secondAbilityIntent.setOperation(secondAbilityIntentOperation);
                startAbility(secondAbilityIntent);

            }
        });

    }
}
