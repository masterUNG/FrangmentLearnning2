package appewtc.masterung.frangmentlearnning2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by masterUNG on 4/1/15 AD.
 */
public class MyFragment extends Fragment{

    private ImageView imvShowImage;
    private Button btnFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_my, container, false);

        //BindWidget
        imvShowImage = (ImageView) rootView.findViewById(R.id.imageView);
        btnFragment = (Button) rootView.findViewById(R.id.btnFragment);

        //Button Contorller
        buttonController();

        return rootView;
    }   // onCreateView

    public void changeBackImage() {
        imvShowImage.setImageResource(R.drawable.master_android);
    }

    private void buttonController() {
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imvShowImage.setImageResource(R.drawable.master_swift2);
            }
        });
    }


}   // Main Class
