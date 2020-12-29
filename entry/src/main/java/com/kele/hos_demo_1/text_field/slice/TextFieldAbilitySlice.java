package com.kele.hos_demo_1.text_field.slice;

import com.kele.hos_demo_1.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.agp.components.TextField;
import ohos.agp.components.element.ShapeElement;

public class TextFieldAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_text_field);

        Button btnLogin = (Button) findComponentById(ResourceTable.Id_btn_login);
        btnLogin.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Text tError = (Text) findComponentById(ResourceTable.Id_t_error);
                tError.setVisibility(Component.VISIBLE);

                ShapeElement errorEle = new ShapeElement(getContext(), ResourceTable.Graphic_background_text_field_error);
                TextField tfName = (TextField) findComponentById(ResourceTable.Id_tf_name);
                tfName.setBackground(errorEle);

                tfName.clearFocus();
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
