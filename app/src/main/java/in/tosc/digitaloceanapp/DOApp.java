package in.tosc.digitaloceanapp;

import android.app.Application;

import in.tosc.digitaloceanapp.utils.FontsOverride;

/**
 * Created by championswimmer on 26/11/16.
 */

public class DOApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        FontsOverride.setDefaultFont(this, "DEFAULT", "MyFontAsset.ttf");
//        FontsOverride.setDefaultFont(this, "MONOSPACE", "MyFontAsset2.ttf");
//        FontsOverride.setDefaultFont(this, "SERIF", "fonts/ProximaNova.ttf");
        FontsOverride.setDefaultFont(this, "SANS_SERIF", "fonts/ProximaNova.ttf");
    }
}