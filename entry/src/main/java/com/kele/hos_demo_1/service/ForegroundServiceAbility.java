package com.kele.hos_demo_1.service;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.event.notification.NotificationRequest;
import ohos.rpc.IRemoteObject;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

public class ForegroundServiceAbility extends Ability {
    private static final HiLogLabel LABEL_LOG = new HiLogLabel(3, 0xD001100, "ForegroundServiceAbility");

    @Override
    public void onStart(Intent intent) {
        HiLog.debug(LABEL_LOG, "ForegroundService::onStart");
        super.onStart(intent);

        // 创建通知，其中1005为notificationId
        NotificationRequest request = new NotificationRequest(1005);
        NotificationRequest.NotificationNormalContent content = new NotificationRequest.NotificationNormalContent();
        content.setTitle("可乐").setText("可口可乐一瓶");
        NotificationRequest.NotificationContent notificationContent = new NotificationRequest.NotificationContent(content);
        request.setContent(notificationContent);

        // 绑定通知，1005为创建通知时传入的notificationId
        keepBackgroundRunning(1005, request);
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                cancelBackgroundRunning();
            }
        };
        timer.schedule(timerTask, 3000, 1000);
    }

    @Override
    public void onBackground() {
        super.onBackground();
        HiLog.debug(LABEL_LOG, "ForegroundServiceAbility::onBackground");
    }

    @Override
    public void onStop() {
        super.onStop();
        HiLog.debug(LABEL_LOG, "ForegroundServiceAbility::onStop");
        cancelBackgroundRunning();
    }

    @Override
    public void onCommand(Intent intent, boolean restart, int startId) {
        HiLog.debug(LABEL_LOG, "ForegroundServiceAbility::onCommand");
    }

    @Override
    public IRemoteObject onConnect(Intent intent) {
        HiLog.debug(LABEL_LOG, "ForegroundServiceAbility::onConnect");
        return null;
    }

    @Override
    public void onDisconnect(Intent intent) {
        HiLog.debug(LABEL_LOG, "ForegroundServiceAbility::onDisconnect");
    }
}