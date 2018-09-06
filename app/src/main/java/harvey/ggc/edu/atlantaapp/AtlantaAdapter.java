package harvey.ggc.edu.atlantaapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AtlantaAdapter extends ArrayList<Atlanta> {
    private int mColorResourceId;

    public AtlantaAdapter(Activity context, ArrayList<Atlanta> atlantas, int colorResourceId) {
        super(context, 0, atlantas);
        mColorResourceId = colorResourceId;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            Atlanta currentAtlanta = getItem(position);

            TextView nameTextView = (TextView) listItemView.findViewById(R.id.textView1);

            nameTextView.setText(currentAtlanta.getName());

            TextView locationTextView = (TextView) listItemView.findViewById(R.id.textView2);

            locationTextView.setText(currentAtlanta.getLocation());

            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image1);
            if (currentAtlanta.hasImage()) {
                imageView.setImageResource(currentAtlanta.getImageDrawable());

                imageView.setVisibility(View.VISIBLE);
            } else {
                imageView.setVisibility(View.GONE);
            }
            View textContainer = listItemView.findViewById(R.id.textView1);
            int color = ContextCompat.getColor(getContext(), mColorResourceId);

            textContainer.setBackgroundColor(color);


        }

        return listItemView;
    }
}

