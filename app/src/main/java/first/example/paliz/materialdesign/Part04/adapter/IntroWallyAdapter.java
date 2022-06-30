package first.example.paliz.materialdesign.Part04.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

import first.example.paliz.materialdesign.Part04.model.Intro;
import first.example.paliz.materialdesign.R;


public class IntroWallyAdapter extends PagerAdapter {

    Context context;
    List<Intro> data ;

    public IntroWallyAdapter(Context context, List<Intro> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view  = LayoutInflater.from(context).inflate(R.layout.item_intro_wally , container , false);

        LottieAnimationView lottieAnimationView = view.findViewById(R.id.lottieAnimation);
        TextView txt_Description = view.findViewById(R.id.txt_description);

        txt_Description.setText(data.get(position).getDescription());
        lottieAnimationView.setAnimation(data.get(position).getLottie());

        container.addView(view);
        return view;

    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
