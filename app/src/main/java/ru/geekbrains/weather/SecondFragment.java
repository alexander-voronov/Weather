package ru.geekbrains.weather;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondFragment extends Fragment {
    public static final String PARCEL = "parcel";

    public static SecondFragment create(Parcel parcel) {
        SecondFragment f = new SecondFragment();

        Bundle args = new Bundle();
        args.putSerializable(PARCEL, parcel);
        f.setArguments(args);
        return f;
    }

    public Parcel getParcel() {
        Parcel parcel = (Parcel) getArguments().getSerializable(PARCEL);
        return parcel;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_second, container, false);

        ImageView coatOfArms = layout.findViewById(R.id.imageView);
        TextView cityNameView = layout.findViewById(R.id.textView);

        TypedArray imgs = getResources().obtainTypedArray(R.array.coatofarms_imgs);
        Parcel parcel = getParcel();

        coatOfArms.setImageResource(imgs.getResourceId(parcel.getImageIndex(), -1));
        cityNameView.setText(parcel.getCityName());
        return layout;


    }
}
