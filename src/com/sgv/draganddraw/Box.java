package com.sgv.draganddraw;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

public class Box implements Parcelable {
    private PointF origin;
    private PointF current;

    public Box(PointF origin) {
        this.origin =  this.current = origin;
        this.current = origin;
    }

    public PointF getCurrent() {
        return current;
    }

    public void setCurrent(PointF current) {
        this.current = current;
    }

    public PointF getOrigin() {
        return origin;
    }

    protected Box(Parcel in) {
        origin = (PointF) in.readValue(PointF.class.getClassLoader());
        current = (PointF) in.readValue(PointF.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(origin);
        dest.writeValue(current);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Box> CREATOR = new Parcelable.Creator<Box>() {
        @Override
        public Box createFromParcel(Parcel in) {
            return new Box(in);
        }

        @Override
        public Box[] newArray(int size) {
            return new Box[size];
        }
    };
}