package androidlabs.com.tourlviv;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SouvenirsFragment extends Fragment {

    public SouvenirsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container,false);
        ListView listView = (ListView) rootView.findViewById(R.id.list_places);
        ArrayList<Place> souvenirs_list = new ArrayList<>();
        souvenirs_list.add(new Place("Сувенірний ринок \"Вернісаж\"", "Ринок картин, художніх виробів, сувенірів, антикваріату у Львові", "пл. Вічева",R.drawable.souvenir_img));
        souvenirs_list.add(new Place("Сувеніри Just Lviv It!", "^_^", "пл. Ринок, 10",R.drawable.souvenir_no_img));
        souvenirs_list.add(new Place("Галерея львівських левів", "Сувенірна крамниця", "пл. Ринок, 10",R.drawable.souvenir_no_img));
        souvenirs_list.add(new Place("Cувенірний крам", "Сувенірна крамниця", "вул. Сербська, 8",R.drawable.souvenir_no_img));
        souvenirs_list.add(new Place("Музей магнітів", "Сувенірна крамниця", "вул. Сербська, 6",R.drawable.souvenir_no_img));
        souvenirs_list.add(new Place("ЕиноКрамниця", "Сувенірна крамниця", "вул. Сербська, 9",R.drawable.souvenir_no_img));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), R.layout.list_item, souvenirs_list);
        listView.setAdapter(placeAdapter);
        return rootView;
    }
}
