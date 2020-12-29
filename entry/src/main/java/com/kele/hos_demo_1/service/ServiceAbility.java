package com.kele.hos_demo_1.service;

import com.kele.hos_demo_1.utils.ToastDialogUtil;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.rpc.IRemoteObject;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

public class ServiceAbility extends Ability {
    private static final HiLogLabel LABEL_LOG = new HiLogLabel(HiLog.LOG_APP, 0xD001100, "Demo");

    @Override
    public void onStart(Intent intent) {
        HiLog.debug(LABEL_LOG, "ServiceAbility::onStart");
        super.onStart(intent);
    }

    @Override
    public void onBackground() {
        super.onBackground();
        HiLog.debug(LABEL_LOG, "ServiceAbility::onBackground");
        //HiLog.warn(label, "Failed to visit %{private}s, reason:%{public}d.", url, errno);
    }

    @Override
    public void onStop() {
        super.onStop();
        HiLog.debug(LABEL_LOG, "ServiceAbility::onStop");
    }

    @Override
    public void onCommand(Intent intent, boolean restart, int startId) {
        HiLog.debug(LABEL_LOG, "ServiceAbility::onCommand");
        for (int i = 0; i < 3; i++) {
            ToastDialogUtil.showToast(getContext(), "kele_" + i);
        }
        onStop();
    }

    @Override
    public IRemoteObject onConnect(Intent intent) {
        HiLog.debug(LABEL_LOG, "ServiceAbility::onConnect");
        return new KeleRemoteObject();
    }

    @Override
    public void onDisconnect(Intent intent) {
        HiLog.debug(LABEL_LOG, "ServiceAbility::onDisconnect");
    }
}