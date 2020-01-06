package com.devanshigupta.newtry;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Devanshi Gupta on 01-12-2019.
 */

public class PlaceUserRating implements Parcelable {

    private String mAuthorName;
    private String mAuthorProfilePictureUrl;
    private Double mAuthorPlaceRating;
    private String mPlaceRatingRelativeTimeDescription;
    private String mAuthorReviewText;

    public PlaceUserRating(String mAuthorName, String mAuthorProfilePictureUrl,
                           Double mPlaceRating, String mPlaceRatingRelativeTimeDescription,
                           String mAuthorReviewText){
        this.mAuthorName = mAuthorName;
        this.mAuthorProfilePictureUrl = mAuthorProfilePictureUrl;
        this.mAuthorPlaceRating = mPlaceRating;
        this.mPlaceRatingRelativeTimeDescription = mPlaceRatingRelativeTimeDescription;
        this.mAuthorReviewText = mAuthorReviewText;
    }

    public PlaceUserRating(Parcel in) {
        this.mAuthorName = in.readString();
        this.mAuthorProfilePictureUrl = in.readString();
        this.mAuthorPlaceRating = in.readDouble();
        this.mPlaceRatingRelativeTimeDescription = in.readString();
        this.mAuthorReviewText = in.readString();
    }

    public String getAuthorName() {
        return mAuthorName;
    }

    public void setAuthorName(String authorName) {
        mAuthorName = authorName;
    }

    public String getAuthorProfilePictureUrl() {
        return mAuthorProfilePictureUrl;
    }

    public void setAuthorProfilePictureUrl(String authorProfilePictureUrl) {
        mAuthorProfilePictureUrl = authorProfilePictureUrl;
    }

    public Double getAuthorPlaceRating() {
        return mAuthorPlaceRating;
    }

    public void setAuthorPlaceRating(Double authorPlaceRating) {
        mAuthorPlaceRating = authorPlaceRating;
    }

    public String getPlaceRatingRelativeTimeDescription() {
        return mPlaceRatingRelativeTimeDescription;
    }

    public void setPlaceRatingRelativeTimeDescription(String placeRatingRelativeTimeDescription) {
        mPlaceRatingRelativeTimeDescription = placeRatingRelativeTimeDescription;
    }

    public String getAuthorReviewText() {
        return mAuthorReviewText;
    }

    public void setAuthorReviewText(String authorReviewText) {
        mAuthorReviewText = authorReviewText;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<PlaceUserRating> CREATOR = new Parcelable
            .Creator<PlaceUserRating>() {

        @Override
        public PlaceUserRating createFromParcel(Parcel source) {
            return new PlaceUserRating(source);
        }

        @Override
        public PlaceUserRating[] newArray(int size) {
            return new PlaceUserRating[size];
        }
    };
    
    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(mAuthorName);
        dest.writeString(mAuthorProfilePictureUrl);
        dest.writeDouble(mAuthorPlaceRating);
        dest.writeString(mPlaceRatingRelativeTimeDescription);
        dest.writeString(mAuthorReviewText);

    }
}
