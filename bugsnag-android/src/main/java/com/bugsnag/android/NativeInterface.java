package com.bugsnag.android;

/**
 * Used as the entry point for native code to allow proguard to obfuscate other areas if needed
 */
class NativeInterface {
    static {
        System.loadLibrary("bugsnag-ndk");
    }
    public static native void setupBugsnag();


    public static String getContext() {
        return Bugsnag.getClient().getContext();
    }

    public static String getErrorStorePath() {
        return Bugsnag.getClient().errorStore.path;
    }

    public static String getUserId() {
        return Bugsnag.getClient().user.getId();
    }

    public static String getUserEmail() {
        return Bugsnag.getClient().user.getEmail();
    }

    public static String getUserName() {
        return Bugsnag.getClient().user.getName();
    }

    public static String getPackageName() {
        return Bugsnag.getClient().appData.packageName;
    }

    public static String getAppName() {
        return Bugsnag.getClient().appData.appName;
    }

    public static String getVersionName() {
        return Bugsnag.getClient().appData.versionName;
    }

    public static int getVersionCode() {
        return Bugsnag.getClient().appData.versionCode;
    }

    public static String getBuildUUID() {
        return Bugsnag.getClient().config.getBuildUUID();
    }

    public static String getAppVersion() {
        return Bugsnag.getClient().appData.getAppVersion();
    }

    public static String getReleaseStage() {
        return Bugsnag.getClient().appData.getReleaseStage();
    }

    public static String getDeviceId() {
        return Bugsnag.getClient().deviceData.id;
    }

    public static String getDeviceLocale() {
        return Bugsnag.getClient().deviceData.locale;
    }

    public static double getDeviceTotalMemory() {
        return Bugsnag.getClient().deviceData.totalMemory;
    }

    public static Boolean getDeviceRooted() {
        return Bugsnag.getClient().deviceData.rooted;
    }

    public static float getDeviceScreenDensity() {
        return Bugsnag.getClient().deviceData.screenDensity;
    }

    public static int getDeviceDpi() {
        return Bugsnag.getClient().deviceData.dpi;
    }

    public static String getDeviceScreenResolution() {
        return Bugsnag.getClient().deviceData.screenResolution;
    }

    public static String getDeviceManufacturer() {
        return android.os.Build.MANUFACTURER;
    }

    public static String getDeviceBrand() {
        return android.os.Build.BRAND;
    }

    public static String getDeviceModel() {
        return android.os.Build.MODEL;
    }

    public static String getDeviceOsVersion() {
        return android.os.Build.VERSION.RELEASE;
    }

    public static String getDeviceOsBuild() {
        return android.os.Build.DISPLAY;
    }

    public static int getDeviceApiLevel() {
        return android.os.Build.VERSION.SDK_INT;
    }
}