package com.example.customgridview;


import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.customgridview.R;
import com.example.customgridview.LanguageAdapter;
import com.example.customgridview.Language;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private List<Language> listLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridview);

        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new Language(2, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new Language(3, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new Language(4, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new Language(5, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new Language(6, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));


        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_grid_view, listLanguage);
        gridView.setAdapter(adapter);
    }
}