package com.example.asanbekov_3_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String>CompanisList = new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recycle_view);

        LoadData();
        ConstructionCompaniesAdapter constructionCompaniesAdapter =
                new ConstructionCompaniesAdapter(CompanisList);
        recyclerView.setAdapter(constructionCompaniesAdapter);
    }

    private void LoadData() {
        CompanisList.add("Elite House");
        CompanisList.add("Мунара Строй");
        CompanisList.add("Эмаком");
        CompanisList.add("Ихлас");
        CompanisList.add("Burana Grand");
        CompanisList.add("Delmar Group");
        CompanisList.add("TS Group");
        CompanisList.add("Альфа Строй");
        CompanisList.add("Бишкек Курулуш");
        CompanisList.add("Barakat");
        CompanisList.add("Elegance Stroy");
        CompanisList.add("Family Village");
        CompanisList.add("Имарат Строй");
        CompanisList.add("Кут Строй");
        CompanisList.add("Аалам Строй");
        CompanisList.add("Байташ Групп");
    }
}