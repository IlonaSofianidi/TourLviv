package androidlabs.com.tourlviv;

public class Place {
    private String place_name;
    private  String place_description;

    private String address;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int place_img_src=NO_IMAGE_PROVIDED;


    public Place(String place_name, String place_description, String address) {
        this.place_name = place_name;
        this.place_description = place_description;
        this.address = address;
    }

    public Place(String place_name, String place_description, String address,int place_img_src) {

        this.place_name = place_name;
        this.place_description = place_description;
        this.place_img_src = place_img_src;
        this.address = address;
    }



    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getPlace_description() {
        return place_description;
    }

    public void setPlace_description(String place_description) {
        this.place_description = place_description;
    }

    public int getPlace_img_src() {
        return place_img_src;
    }

    public void setPlace_img_src(int place_img_src) {
        this.place_img_src = place_img_src;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public boolean hasImageResource (){
        return place_img_src!=NO_IMAGE_PROVIDED;

    }

    @Override
    public String toString() {
        return "Place{" +
                "place_name='" + place_name + '\'' +
                ", place_description='" + place_description + '\'' +
                ", address='" + address + '\'' +
                ", place_img_src=" + place_img_src +
                '}';
    }
}
