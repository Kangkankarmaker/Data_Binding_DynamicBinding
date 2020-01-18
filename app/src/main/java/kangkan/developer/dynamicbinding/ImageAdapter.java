package kangkan.developer.dynamicbinding;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageAdapter {

    @BindingAdapter({"imageUrl","placeHolder"})
    public static void setImage(ImageView poster, String posterImage, Drawable placeHoldreImage)
    {
        Glide.with(poster.getContext())
                .load(posterImage)
                .centerCrop()
                .placeholder(placeHoldreImage)
                .crossFade()
                .into(poster);
    }
}
