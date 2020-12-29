package com.kele.hos_demo_1.page_jump.slice;

import com.kele.hos_demo_1.ResourceTable;
import com.kele.hos_demo_1.SecondAbility;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Component;
import ohos.agp.utils.LayoutAlignment;
import ohos.agp.window.dialog.ToastDialog;

public class PageJumpAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_page_jump);

        Component present = findComponentById(ResourceTable.Id_txt_present);
        present.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                //内slice跳转
                present(new PageJumpAbilitySlice1(), new Intent());
            }
        });

        Component presentForResult = findComponentById(ResourceTable.Id_txt_presentForResult);
        presentForResult.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                //内slice跳转
                presentForResult(new PageJumpAbilitySlice1(), new Intent(), 0);
            }
        });

        Component startAbility = findComponentById(ResourceTable.Id_txt_startAbility);
        startAbility.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent = new Intent();
                Operation build = new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName("com.kele.hos_demo_1")
                        .withAbilityName("com.kele.hos_demo_1.SecondAbility")
                        .withAction("second_ability_1")
                        .build();
                intent.setOperation(build);
                startAbility(intent);
            }
        });

        Component startAbilityForResult = findComponentById(ResourceTable.Id_txt_startAbilityForResult);
        startAbilityForResult.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent = new Intent();
                Operation build = new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName("com.kele.hos_demo_1")
                        .withAbilityName("com.kele.hos_demo_1.SecondAbility")
                        .withAction("second_ability_1")
                        .build();
                intent.setOperation(build);
                startAbilityForResult(intent, 1);
            }
        });
    }


    private void startAbility(String abilityName, String action) {
        Intent intent = new Intent();
        Operation build = new Intent.OperationBuilder()
                .withDeviceId("")
                .withBundleName("com.kele.hos_demo_1")
                .withAbilityName(abilityName)
                .build();
        intent.setOperation(build);
        startAbility(intent);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    @Override
    protected void onResult(int requestCode, Intent resultIntent) {
        if (requestCode == 0) {
            String strParam = resultIntent.getStringParam(PageJumpAbilitySlice1.RESULT_KEY_1);
            getShow(strParam);
        }
    }

    @Override
    protected void onAbilityResult(int requestCode, int resultCode, Intent resultData) {
        if (requestCode == 1) {
            if (resultCode == SecondAbility.RESULT_CODE) {
                String strParam = resultData.getStringParam(SecondAbility.RESULT_KEY_1);
                getShow(strParam);
            }
        }
    }

    private void getShow(String strParam) {
        new ToastDialog(getContext())
                .setText(strParam)
                .setAlignment(LayoutAlignment.CENTER)
                .show();
    }
}
