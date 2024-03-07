package tr.com.mustafa.uygulama11sirazsizde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import tr.com.mustafa.uygulama11sirazsizde.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;
    ArrayList<Arkadaslar> ArkasalarArrayList;
    int kisiNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        ArkasalarArrayList = new ArrayList<>();

        Arkadaslar Mustafa=new Arkadaslar("Mustafa",123,"11/b",1,R.drawable.ogrenci1);
        Arkadaslar Anil=new Arkadaslar("Anil",5342,"11/b",2,R.drawable.ogrenci2);
        Arkadaslar Emin=new Arkadaslar("Emin",532,"11/b",3,R.drawable.ogrenci3);
        Arkadaslar Ali=new Arkadaslar("Ali",312,"11/b",4,R.drawable.ogrenci4);
        Arkadaslar Cemil=new Arkadaslar("Cemil",12323,"12/b",5,R.drawable.ogrenci1);
        Arkadaslar Hayriye=new Arkadaslar("hayriye",5342,"10/b",6,R.drawable.ogrenci2);
        Arkadaslar Akbas=new Arkadaslar("Emin",532,"12/b",7,R.drawable.ogrenci3);
        Arkadaslar Akcam=new Arkadaslar("Akçam",312,"11/a",8,R.drawable.ogrenci4);
        Arkadaslar Selim=new Arkadaslar("Selim",5342,"11/c",9,R.drawable.ogrenci2);
        Arkadaslar Mali=new Arkadaslar("Mali",5342,"11/c",10,R.drawable.ogrenci2);


        ArkasalarArrayList.add(Mustafa);
        ArkasalarArrayList.add(Anil);
        ArkasalarArrayList.add(Emin);
        ArkasalarArrayList.add(Ali);
        ArkasalarArrayList.add(Cemil);
        ArkasalarArrayList.add(Hayriye);
        ArkasalarArrayList.add(Akbas);
        ArkasalarArrayList.add(Akcam);
        ArkasalarArrayList.add(Selim);
        ArkasalarArrayList.add(Mali);


        binding.imageViewGorsel.setImageResource(ArkasalarArrayList.get(0).foto);
        binding.ogrenciAdi.setText("Adi Soyadi : " + ArkasalarArrayList.get(0).OgrenciAdi);
        binding.OgrenciSinifi.setText("Sinifi : "+ArkasalarArrayList.get(0).Sinifi);
        binding.OgrenciNo.setText("Sira No: "+ArkasalarArrayList.get(0).OkulNO);
        kisiNo=0;

    }

    public void geriGit(View view)
    {
        if(kisiNo>0)
        {
            kisiNo--;
            binding.imageViewGorsel.setImageResource(ArkasalarArrayList.get(kisiNo).foto);
            binding.ogrenciAdi.setText("Adı Soyadı " + ArkasalarArrayList.get(kisiNo).OgrenciAdi);
            binding.OgrenciSinifi.setText("Sınıfı : " + ArkasalarArrayList.get(kisiNo).Sinifi);
            binding.OgrenciNo.setText("Numarası : " + ArkasalarArrayList.get(kisiNo).OkulNO);
        }
        else kisiNo=10;

    }

    public void ileriGit(View view)
    {
        if(kisiNo<ArkasalarArrayList.size()-1)
        {
            kisiNo++;
            binding.imageViewGorsel.setImageResource(ArkasalarArrayList.get(kisiNo).foto);
            binding.ogrenciAdi.setText("Adı Soyadı " + ArkasalarArrayList.get(kisiNo).OgrenciAdi);
            binding.OgrenciSinifi.setText("Sınıfı : " + ArkasalarArrayList.get(kisiNo).Sinifi);
            binding.OgrenciNo.setText("Numarası : " + ArkasalarArrayList.get(kisiNo).OkulNO);
        }
        else kisiNo=-1;

    }
}