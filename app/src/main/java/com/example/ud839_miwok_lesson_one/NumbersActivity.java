package com.example.ud839_miwok_lesson_one;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create array of words
        ArrayList<Word> words = new ArrayList<>();
        //Word w = new Word("one","lutti");
        //words.add(w);     OR we can write
        words.add(new Word("one","lutti"));
        words.add(new Word("two","ottoko"));
        words.add(new Word("three","titi"));
        words.add(new Word("four","ufmsrr"));
        words.add(new Word("five","butti"));
        words.add(new Word("six","pitti"));
        words.add(new Word("seven","setti"));
        words.add(new Word("eight","mitti"));
        words.add(new Word("nine","chitti"));
        words.add(new Word("one","katti"));

//        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this,R.layout.list_item, words);
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}