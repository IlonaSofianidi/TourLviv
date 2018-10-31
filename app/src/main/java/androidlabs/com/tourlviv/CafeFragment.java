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
public class CafeFragment extends Fragment {


    public CafeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View root_view = inflater.inflate(R.layout.place_list,container,false);
        ListView listView = (ListView)root_view.findViewById(R.id.list_places);
        ArrayList<Place> cafe_list = new ArrayList<>();
        cafe_list.add(new Place("Café 1","Винотека «Кафе 1» − затишне місце для людей, що бажають провести час за келихом вина в атмосфері Львова минулих часів.","пл. Катедральна 5/1",R.drawable.cafe_1));
        cafe_list.add(new Place("Під клепсидрою","Кнайпа, що знаходиться поруч із арт-галереєю \"Дзига\".","вул. Вірменська, 35",R.drawable.cafe_2));
        cafe_list.add(new Place("Світ кави","Простора кав'ярня з широким асортиментом світової кави. До кави пропонуються різноманітні солодкі «лєґуміни» («ласощі, смаколики» по-львівськи).","пл. Катедральна, 6",R.drawable.cafe_3));
        cafe_list.add(new Place("Під синьою пляшкою","Кнайпа знаходиться в глибині подвір'я старого будинку на Руській.","вул. Руська, 4",R.drawable.cafe_4));
        cafe_list.add(new Place("Віденська кав‘ярня","«Віденська кав‘ярня» є найстарішою кав'ярнею в місті, оскільки в 1829 році вона була спроектована і збудована власне як кав'ярня.","пр. Свободи,12",R.drawable.cafe_5));
        cafe_list.add(new Place("\"Кентавр\"","Кафе \"Кентавр\" знаходиться в самому серці Львова на площі Ринок. Тераса декорована зеленню і квітами, просторі зали, прикрашені раритетними меню, \"барвиста затишна та смачна\" пивниця, власний купаж кави, львівська та авторська кухня - відвідавши \"Кентавр\" одного разу, Ви запам'ятаєте його назавжди.","пл. Ринок, 34",R.drawable.cafe_6));
        cafe_list.add(new Place("Львівські пляцки","Перша міська пекарня сирників та штруделів «Львівські пляцки» - місце, куди приходять на запах, а залишаються з найсмачнішими спогадами.","пл. Ринок, 13",R.drawable.cafe_7));
        cafe_list.add(new Place("Кав’ярня “На бамбетлі”","Гостинна кав’ярня, розташована в колишньому пасажі “Андреоллі”, де було відкрито першу у Львові цукерню.","площа Ринок, 29",R.drawable.cafe_10));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),R.layout.list_item,cafe_list);
        listView.setAdapter(placeAdapter);
        return root_view;

    }

}
