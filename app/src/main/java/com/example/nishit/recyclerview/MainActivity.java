package com.example.nishit.recyclerview;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    List<Movie> lstMovie;
    ArrayList<Movie>mPopularList = new ArrayList<>();
    ArrayList<Movie> mTopTopRatedList = new ArrayList<>();
    public String popularMovies;
    public String topRatedMovies;
    @BindView(R.id.indeterminateBar)
    ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mProgressBar.setVisibility(View.INVISIBLE); //Hide Progressbar by Default
        ArrayList<Movie> mPopularList;
        ArrayList<Movie> mTopTopRatedList;
        lstMovie=new ArrayList<>();
        lstMovie.add(new Movie(" Black Mirror ","Category Movie","Description Movie", R.drawable.blackmirror));
        lstMovie.add(new Movie(" Avengers ","Category Movie","Description Movie", R.drawable.avngers));
        lstMovie.add(new Movie(" End Game ","Category Movie","Description Movie", R.drawable.endgame));
        lstMovie.add(new Movie(" Super Women ","Category Movie","Description Movie", R.drawable.superwomen));
        lstMovie.add(new Movie(" Ghoul ","Category Movie","Description Movie", R.drawable.ghoul));
        lstMovie.add(new Movie(" Mirzapur ","Category Movie","Description Movie", R.drawable.mirzapur));
        lstMovie.add(new Movie(" Mr.Robot ","Category Movie","Description Movie", R.drawable.mrrobot));
        lstMovie.add(new Movie(" Mom ","Category Movie","Description Movie", R.drawable.mom));
        lstMovie.add(new Movie(" Narcos ","Category Movie","Description Movie", R.drawable.narcos));
        lstMovie.add(new Movie(" Preacher ","Category Movie","Description Movie", R.drawable.preacher));
        lstMovie.add(new Movie(" 13 Reasons Why ","Category Movie","Description Movie", R.drawable.reasonswhy));
        lstMovie.add(new Movie(" Riverdale ","Category Movie","Description Movie", R.drawable.riverdale));
        lstMovie.add(new Movie(" Sacred Games ","Category Movie","Description Movie", R.drawable.sacredgames));
        lstMovie.add(new Movie(" Stranger Things ","Category Movie","Description Movie", R.drawable.strangerthings));
        lstMovie.add(new Movie(" Thor ","Category Movie","Description Movie", R.drawable.thor));
        lstMovie.add(new Movie(" Titanic ","Category Movie","Description Movie", R.drawable.titanic));
        lstMovie.add(new Movie(" Despicable Me 3 ","Category Movie","Description Movie", R.drawable.p5));

        lstMovie.add(new Movie(" Inside Out ","Category Movie","Description Movie", R.drawable.p1));
        lstMovie.add(new Movie(" The Dark Knight Rises ","Category Movie","Description Movie", R.drawable.p2));
        lstMovie.add(new Movie(" The Jungle Book ","Category Movie","Description Movie", R.drawable.p3));
        lstMovie.add(new Movie(" Minimal Movie ","Category Movie","Description Movie", R.drawable.p4));
        lstMovie.add(new Movie(" Despicable Me 3 ","Category Movie","Description Movie", R.drawable.p5));
        lstMovie.add(new Movie(" Thing Affieche ","Category Movie","Description Movie", R.drawable.p6));

        RecyclerView myrv =(RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this,lstMovie);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }

}
