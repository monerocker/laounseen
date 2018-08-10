package masterung.androidthai.in.th.laosunseen.utility;

import android.os.Parcel;
import android.os.Parcelable;

public class UserModel implements Parcelable{

    private String uid, nameString, emailString,
            pathUrlString, myPostString;

    public UserModel() {
    }

    public UserModel(String uid, String nameString, String emailString, String pathUrlString, String myPostString) {


        this.uid = uid;
        this.nameString = nameString;
        this.emailString = emailString;
        this.pathUrlString = pathUrlString;
        this.myPostString = myPostString;
    }

    protected UserModel(Parcel in) {
        uid = in.readString();
        nameString = in.readString();
        emailString = in.readString();
        pathUrlString = in.readString();
        myPostString = in.readString();
    }

    public static final Creator<UserModel> CREATOR = new Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel in) {
            return new UserModel(in);
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getEmailString() {
        return emailString;
    }

    public void setEmailString(String emailString) {
        this.emailString = emailString;
    }

    public String getPathUrlString() {
        return pathUrlString;
    }

    public void setPathUrlString(String pathUrlString) {
        this.pathUrlString = pathUrlString;
    }

    public String getMyPostString() {
        return myPostString;
    }

    public void setMyPostString(String myPostString) {
        this.myPostString = myPostString;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(uid);
        parcel.writeString(nameString);
        parcel.writeString(emailString);
        parcel.writeString(pathUrlString);
        parcel.writeString(myPostString);
    }
} // Main Class
