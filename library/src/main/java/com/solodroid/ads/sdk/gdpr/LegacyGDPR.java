package com.solodroid.ads.sdk.gdpr;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class LegacyGDPR {

    Activity activity;

    public LegacyGDPR(Activity activity) {
        this.activity = activity;
    }

    public static Bundle getBundleAd(Activity activity) {
        return new Bundle();
    }

    public void updateLegacyGDPRConsentStatus(String adMobPublisherId, String privacyPolicyUrl) {

    }

    private static class GDPRForm {

        Activity activity;

        private GDPRForm(Activity activity) {
            this.activity = activity;
        }

        private void displayConsentForm(String privacyPolicyUrl) {

        }

        private URL getUrlPrivacyPolicy(String privacyPolicyUrl) {
            URL mUrl = null;
            try {
                mUrl = new URL(privacyPolicyUrl);
            } catch (MalformedURLException e) {
                Log.e("GDPR", e.getMessage());
            }
            return mUrl;
        }
    }


}
