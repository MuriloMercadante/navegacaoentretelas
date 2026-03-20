# This is a configuration file for ProGuard.
# http://proguard.sourceforge.net/index.html#manual/usage.html

# For Android applications, we can use the built-in ProGuard rules.
-optimizationpasses 5

# The remainder of this file is identical to the non-optimized version
# of the Proguard rules in the SDK, as of version 2.0.

-dontobfuscate
-verbose

# Preserve some attributes that may be required for reflection.
-keepattributes *Annotation*,
                Signature,
                Exception

# For native methods, see http://proguard.sourceforge.net/manual/examples.html#native
-keepclasseswithmembernames class * {
    native <methods>;
}

# We want to keep methods in Activities that could be used in the XML attribute onClick
-keepclasseswithmembers class * {
    public void *(android.view.View);
}

# Also keep these on Eclipse IDE's organized imports
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.backup.BackupAgentHelper
-keep public class * extends android.preference.Preference
-keep public class * extends android.view.View
-keep public class * extends android.widget.ImageView
