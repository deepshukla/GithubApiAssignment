package com.lex.githubapiassignment;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.lex.githubapiassignment.models.Comment;

import java.util.ArrayList;

import rx.subscriptions.CompositeSubscription;

public class DetailsActivity extends AppCompatActivity {
    private final CompositeSubscription subscriptions = new CompositeSubscription();
    private MyViewModel viewModel;
    private TextView tvComment;
    int id = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (getIntent()!=null) {
            id = getIntent().getIntExtra(MainActivity.ID,0);
        }
        setContentView(R.layout.activity_details);
        tvComment = findViewById(R.id.tv_comment);
        viewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        subscriptions.add(viewModel.loadComment(id).subscribe(this::onResponse, this::onFailure));
    }

    private void onFailure(Throwable throwable) {
        Toast.makeText(DetailsActivity.this,throwable.getMessage(),Toast.LENGTH_SHORT);
    }

    private void onResponse(ArrayList<Comment> list) {
        if (!TextUtils.isEmpty(list.get(0).getBody())) {
            tvComment.setText(list.get(0).getBody());
        } else {

            tvComment.setText("No Comment Found");
        }

    }
}
