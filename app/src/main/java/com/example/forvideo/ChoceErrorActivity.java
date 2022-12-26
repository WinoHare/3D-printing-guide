package com.example.forvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChoceErrorActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listSport = getListView();
        ArrayAdapter<Error> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Error.errors);
        listSport.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent  = new Intent(ChoceErrorActivity.this, ErrorsActivity.class);
        intent.putExtra(ErrorsActivity.EXTRA_ERROR, (int) id);
        startActivity(intent);
    }
}