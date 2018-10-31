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
public class BeerFragment extends Fragment {


    public BeerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view_root = inflater.inflate(R.layout.place_list,container,false);
        ListView listView = (ListView)view_root.findViewById(R.id.list_places);
        ArrayList<Place> beer_list = new ArrayList<>();
        beer_list.add(new Place("Гасова лямпа","Перший в Україні Музей-ресторація!","вул. Вірменська, 20",R.drawable.article_logo_23));
        beer_list.add(new Place("Хмільний дім Роберта Домса","«Хмільний дім Роберта Домса» – львівська кнайпа, яка розміщена у підвалах Львівської пивоварні.","вул. Клепарівська, 18",R.drawable.article_logo_44));
beer_list.add(new Place("Криївка","У підвалах площі Ринок знаходиться кнайпа, стилізована під криївку Української повстанської армії. Але, щоб туди потрапити, потрібно знати гасло...","пл. Ринок, 14",R.drawable.article_logo_162));
        beer_list.add(new Place("Ірландський паб \"Дублін\"","Паб Дублін – це місце, метою якого є перш за все культивування ірландських традицій.","пр. Крива Липа, 5",R.drawable.dublin_logo));
        beer_list.add(new Place("Корзо Паб","Відчуйте атмосферу справжнього ірландського пабу у Корзо.","вул. Братів Рогатинців 10",R.drawable.korzo_login));
        beer_list.add(new Place("Music Lab","Єдине у своєму роді місце, яке поєднує в собі різні жанри: рок та електронну музику.","вул. Братів Рогатинців, 27",R.drawable.music_lablogo));
        beer_list.add(new Place("Паб-ресторан «L'UFT»","Вільне місце для вільних людей!","вул. Коперника, 17",R.drawable.luft_logo));
        beer_list.add(new Place("Паб «Білий Лев»","У старовинній частині міста Паб «Білий Лев» гостинно відчинив свої двері для відвідувачів. Паб «Білий Лев» розміщується в кількох затишних залах на першому поверсі та у підвальному приміщенні.","вул. Лесі Українки, 15",R.drawable.lev_logo));
        beer_list.add(new Place("Pub Berlin Lemberg","“BierlinLemberg” – паб з затишною атмосферою, cтильним інтер’єром та широким вибором пива.","вул. Чайковського, 18",R.drawable.lemberg_logo));
        beer_list.add(new Place("П’яльня пива і горілки","Львівська інтерпретація популярних закладів у Польщі.","пл. Ринок, 31",R.drawable.pyalna_logo));
        beer_list.add(new Place("Театр пива \"Правда\"","Театр пива \"Правда\" - це простір, куди ми запрошуємо найкращих броварів світу варити пиво у нас, переймаючи їх технології і вміння. Ми починаємо створення саме львівського сорту пива.","пл. Ринок, 32",R.drawable.pravda_logo));
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),R.layout.list_item,beer_list);

        listView.setAdapter(placeAdapter);
        return view_root;

    }

}
