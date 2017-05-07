package uk.tonymerritt.instaslam.model;

import android.net.Uri;

/**
 * Created by Klavar on 06/05/2017.
 */

public class InstaImage {

    private Uri imageResourceUrl;

    public InstaImage(Uri imageResourceUrl) {
        this.imageResourceUrl = imageResourceUrl;
    }

    public Uri getImageResourceUrl() {
        return imageResourceUrl;
    }
}
