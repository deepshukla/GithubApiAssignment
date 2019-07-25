package com.lex.githubapiassignment;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.lex.githubapiassignment.models.Gist;

import java.util.ArrayList;

import rx.subscriptions.CompositeSubscription;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    final static String ID="id";
    private final CompositeSubscription subscriptions = new CompositeSubscription();
    private ListViewAdapter adapter;
    private MyViewModel viewModel;
    private RecyclerView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        listView.setHasFixedSize(true);
        listView.setLayoutManager(new LinearLayoutManager(this));
        viewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        subscriptions.add(viewModel.loadFeed().subscribe(this::onResponse, this::onFailure));
    }

    private void onResponse(ArrayList<Gist> gist) {
        Log.d(TAG, "onResponse: " );
        adapter = new ListViewAdapter(MainActivity.this,gist);
        listView.setAdapter(adapter);
    }

    private void onFailure(Throwable t) {
        Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_SHORT);
    }

    public void setClickListnere(TextView tvTitle, ArrayList<Gist> list, int i) {
      tvTitle.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent =new Intent(MainActivity.this,DetailsActivity.class);
              intent.putExtra(ID,list.get(i).getNumber());
              startActivity(intent);
          }
      });

    }
}
