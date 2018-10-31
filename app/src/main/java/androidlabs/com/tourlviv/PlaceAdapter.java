package androidlabs.com.tourlviv;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place>{
    private Context context;
    private int resource;
    private List<Place> places;
    public PlaceAdapter(@NonNull Context context, int resource, @NonNull List<Place> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.places=objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        ViewHolder holder = null;
        if (listItemView == null) {
Log.d("Adapter", "Initializing view");
            LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
            listItemView = layoutInflater.inflate(resource, parent, false);


            holder = new ViewHolder();

            holder.name_place_textView = (TextView)listItemView.findViewById(R.id.place_textView);
            holder.place_description_textView = (TextView) listItemView.findViewById(R.id.description_textView);
            holder.place_address_textView=(TextView)listItemView.findViewById(R.id.address_textView);
            holder.place_img= (ImageView) listItemView.findViewById(R.id.image_view);


            listItemView.setTag(holder);
        } else {
            holder = (ViewHolder) listItemView.getTag();
        }
    Place place = places.get(position);
        holder.name_place_textView.setText(place.getPlace_name());
        holder.place_description_textView.setText(place.getPlace_description());
        holder.place_address_textView.setText(place.getAddress());
        Log.d("Adapter",place.toString());
if(place.hasImageResource()){
    holder.place_img.setImageResource(place.getPlace_img_src());
}
return listItemView;

    }
    static class ViewHolder{
        TextView name_place_textView;
        TextView place_description_textView;
        TextView place_address_textView;
        ImageView place_img;
    }
}
