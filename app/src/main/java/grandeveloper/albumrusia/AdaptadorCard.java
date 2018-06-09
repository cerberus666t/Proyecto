package grandeveloper.albumrusia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class AdaptadorCard extends PagerAdapter{
    List<Integer> listcards;
    Context context;
    LayoutInflater layoutInflater;

    public AdaptadorCard(List<Integer> listcards, Context context) {
        this.listcards = listcards;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listcards.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View)object);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = layoutInflater.inflate(R.layout.item_card,container,false);
        ImageView imageView = (ImageView)view.findViewById(R.id.imgV);
        imageView.setImageResource(listcards.get(position));
        container.addView(view);
        return view;
    }
}
