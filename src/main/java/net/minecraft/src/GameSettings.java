@@ -66,7 +66,7 @@ public class GameSettings {
    /**
     * Whether to show advanced information on item tooltips, toggled by F3+H
     */
    public boolean advancedItemTooltips = false;
    public boolean advancedItemTooltips = true;

    /**
     * Whether to pause when the game loses focus, toggled by F3+P
@@ -431,6 +431,10 @@ public void setOptionValue(EnumOptions par1EnumOptions, int par2) {
            this.rain = !this.rain;
        }

        if (par1EnumOptions == EnumOptions.ADVANCED_ITEM_TOOLTIPS) {
            this.advancedItemTooltips = !this.advancedItemTooltips;
        }

        this.saveOptions();
    }

@@ -510,6 +514,9 @@ public boolean getOptionOrdinalValue(EnumOptions par1EnumOptions) {
            case 54:
                return this.rain;

            case 55:
                return this.advancedItemTooltips;

            default:
                return false;
        }
@@ -596,7 +603,6 @@ public void loadOptions() {
            if (yee.hasKey("chatOpacity")) this.chatOpacity = yee.getFloat("chatOpacity");
            if (yee.hasKey("fullScreen")) this.fullScreen = yee.getBoolean("fullScreen");
            if (yee.hasKey("hideServerAddress")) this.hideServerAddress = yee.getBoolean("hideServerAddress");
            if (yee.hasKey("advancedTooltips")) this.advancedItemTooltips = yee.getBoolean("advancedTooltips");
            if (yee.hasKey("pauseOnLostFocus")) this.pauseOnLostFocus = yee.getBoolean("pauseOnLostFocus");
            if (yee.hasKey("showCape")) this.showCape = yee.getBoolean("showCape");
            if (yee.hasKey("touchscreen")) this.touchscreen = yee.getBoolean("touchscreen");
@@ -632,6 +638,7 @@ public void loadOptions() {
            if (yee.hasKey("keyStrokes")) keyStrokes = yee.getBoolean("keyStrokes");
            if (yee.hasKey("vignette")) vignette = yee.getBoolean("vignette");
            if (yee.hasKey("rain")) rain = yee.getBoolean("rain");
            if (yee.hasKey("advancedTooltips")) this.advancedItemTooltips = yee.getBoolean("advancedTooltips");

            if (voiceListenRadius < 5) voiceListenRadius = 5;
            else if (voiceListenRadius > 22) voiceListenRadius = 22;
@@ -684,7 +691,6 @@ public void saveOptions() {
        yee.setFloat("chatOpacity", this.chatOpacity);
        yee.setBoolean("fullScreen", this.fullScreen);
        yee.setBoolean("hideServerAddress", this.hideServerAddress);
        yee.setBoolean("advancedTooltips", this.advancedItemTooltips);
        yee.setBoolean("pauseOnLostFocus", this.pauseOnLostFocus);
        yee.setBoolean("showCape", this.showCape);
        yee.setBoolean("touchscreen", this.touchscreen);
@@ -720,6 +726,7 @@ public void saveOptions() {
        yee.setBoolean("keyStrokes", keyStrokes);
        yee.setBoolean("vignette", vignette);
        yee.setBoolean("rain", rain);
        yee.setBoolean("advancedTooltips", this.advancedItemTooltips);

        for (int var4 = 0; var4 < this.keyBindings.length; ++var4) {
            yee.setInteger(keyBindings[var4].keyDescription, keyBindings[var4].keyCode);
