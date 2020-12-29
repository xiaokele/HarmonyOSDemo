package com.kele.hos_demo_1.slice;

import com.kele.hos_demo_1.ResourceTable;
import com.kele.hos_demo_1.SecondAbility;
import com.kele.hos_demo_1.item.SecondListItem;
import com.kele.hos_demo_1.provider.SecondListItemProvider;
import com.kele.hos_demo_1.service.KeleRemoteObject;
import com.kele.hos_demo_1.utils.ToastDialogUtil;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.ability.IAbilityConnection;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.ListContainer;
import ohos.agp.utils.LayoutAlignment;
import ohos.agp.window.dialog.ToastDialog;
import ohos.bundle.ElementName;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.rpc.IRemoteObject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SecondAbilitySlice extends AbilitySlice {

    private static final HiLogLabel LABEL_LOG = new HiLogLabel(3, 0xD001100, "SecondAbilitySlice");

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_second);

        initListContainer();
    }

    private void initListContainer() {
        ListContainer listContainer = (ListContainer) findComponentById(ResourceTable.Id_list_container);
        ArrayList<SecondListItem> list = getData();
        SecondListItemProvider itemProvider = new SecondListItemProvider(list, this);
        listContainer.setItemProvider(itemProvider);

        listContainer.setItemClickedListener(new ListContainer.ItemClickedListener() {
            @Override
            public void onItemClicked(ListContainer listContainer, Component component, int i, long l) {

                switch (i) {
                    case 0:
                        startAbility("com.kele.hos_demo_1.text.TextAbility");
                        break;
                    case 1:
                        startAbility("com.kele.hos_demo_1.page_jump.PageJumpAbility");
                        break;
                    case 2:
                        startAbility("com.kele.hos_demo_1.service.ServiceAbility");
                        break;
                    case 3:
                        connectService("com.kele.hos_demo_1.service.ServiceAbility", connection);
                        break;
                    case 4:
                        startAbility("com.kele.hos_demo_1.service.ForegroundServiceAbility");
                        break;
                    case 5:
                        startAbility("com.kele.hos_demo_1.phone_service.PhoneServiceAbility");
                        break;
                    case 6:
                        startAbility("com.kele.hos_demo_1.button.ButtonAbility");
                        break;
                    case 7:
                        startAbility("com.kele.hos_demo_1.text_field.TextFieldAbility");
                        break;
                    case 8:
                        startAbility("com.kele.hos_demo_1.image.ImageAbility");
                        break;
                    case 9:
                        startAbility("com.kele.hos_demo_1.tablist_tab.TabListTabAbility");
                        break;
                    case 10:
                        startAbility("com.kele.hos_demo_1.picker.PickerAbility");
                        break;
                    case 11:
                        startAbility("com.kele.hos_demo_1.data_picker.DataPickerAbility");
                        break;
                    case 12:
                        startAbility("com.kele.hos_demo_1.time_picker.TimePickerAbility");
                        break;
                    case 13:
                        startAbility("com.kele.hos_demo_1.switch_1.SwitchAbility");
                        break;
                    case 14:
                        startAbility("com.kele.hos_demo_1.radio_button.RadioButtonAbility");
                        break;
                    case 15:
                        startAbility("com.kele.hos_demo_1.radio_container.RadioContainerAbility");
                        break;
                    case 16:
                        startAbility("com.kele.hos_demo_1.check_box.CheckBoxAbility");
                        break;
                    case 17:
                        startAbility("com.kele.hos_demo_1.progressbar.ProgressBarAbility");
                        break;
                    case 18:
                        startAbility("com.kele.hos_demo_1.round_progress.RoundProgressBarAbility");
                        break;
                }

            }
        });
    }

    private IAbilityConnection connection = new IAbilityConnection() {
        @Override
        public void onAbilityConnectDone(ElementName elementName, IRemoteObject iRemoteObject, int i) {
            HiLog.debug(LABEL_LOG, "---onAbilityConnectDone");
            if (null != iRemoteObject) {
                if (iRemoteObject instanceof KeleRemoteObject) {
                    String descriptor = iRemoteObject.getInterfaceDescriptor();
                    HiLog.debug(LABEL_LOG, "---descriptor="+descriptor);
                }
            }
        }

        @Override
        public void onAbilityDisconnectDone(ElementName elementName, int i) {
            HiLog.debug(LABEL_LOG, "---onAbilityDisconnectDone");
        }
    };


    private void startAbility(String abilityName) {
        Intent intent = new Intent();
        Operation build = new Intent.OperationBuilder()
                .withDeviceId("")
                .withBundleName("com.kele.hos_demo_1")
                .withAbilityName(abilityName)
                .build();
        intent.setOperation(build);
        startAbility(intent);
    }

    private void connectService(String abilityName, IAbilityConnection connection) {
        Intent intent = new Intent();
        Operation build = new Intent.OperationBuilder()
                .withDeviceId("")
                .withBundleName("com.kele.hos_demo_1")
                .withAbilityName(abilityName)
                .build();
        intent.setOperation(build);
        connectAbility(intent, connection);
    }

    private ArrayList<SecondListItem> getData() {
        ArrayList<SecondListItem> rList = new ArrayList<>();
        rList.add(new SecondListItem("Text"));
        rList.add(new SecondListItem("AbilitySlice间导航"));
        rList.add(new SecondListItem("启动Service"));
        rList.add(new SecondListItem("连接Service"));
        rList.add(new SecondListItem("前台Service"));
        rList.add(new SecondListItem("PhoneService"));
        rList.add(new SecondListItem("Button"));
        rList.add(new SecondListItem("TextField"));
        rList.add(new SecondListItem("Image"));
        rList.add(new SecondListItem("TabList和Tab"));
        rList.add(new SecondListItem("Picker"));
        rList.add(new SecondListItem("DatePicker"));
        rList.add(new SecondListItem("TimePicker"));
        rList.add(new SecondListItem("Switch"));
        rList.add(new SecondListItem("RadioButton"));
        rList.add(new SecondListItem("RadioContainer"));
        rList.add(new SecondListItem("Checkbox"));
        rList.add(new SecondListItem("ProgressBar"));
        rList.add(new SecondListItem("RoundProgressBar"));
        return rList;
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
