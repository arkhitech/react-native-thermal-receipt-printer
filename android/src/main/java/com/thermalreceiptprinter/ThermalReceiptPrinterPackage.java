package com.thermalreceiptprinter;

import androidx.annotation.NonNull;

import com.pinmi.react.printer.RNUSBPrinterModule;
import com.pinmi.react.printer.RNBLEPrinterModule;
import com.pinmi.react.printer.RNNetPrinterModule;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThermalReceiptPrinterPackage implements ReactPackage {
  @NonNull
  @Override
  public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();
    modules.add(new RNUSBPrinterModule(reactContext));
    modules.add(new RNBLEPrinterModule(reactContext));
    modules.add(new RNNetPrinterModule(reactContext));
    return modules;
  }

  @NonNull
  @Override
  public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
