package com.kele.hos_demo_1.utils;

import ohos.agp.utils.LayoutAlignment;
import ohos.agp.window.dialog.ToastDialog;
import ohos.app.Context;

/**
 * CREATE TIME : 2020/12/18
 * BY : Admin
 * DES :
 */
public class ToastDialogUtil {

    public static void showToast(Context context,String tContent) {
        new ToastDialog(context)
                .setText(tContent)
                .setAlignment(LayoutAlignment.CENTER)
                .show();
    }
}
